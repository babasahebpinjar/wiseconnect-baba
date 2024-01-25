package com.shorewise.wiseconnect.service;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shorewise.wiseconnect.model.AmtAndCcy;
import com.shorewise.wiseconnect.model.BackOfficeBatchBankRes;
import com.shorewise.wiseconnect.model.PostingReq;
import com.shorewise.wiseconnect.model.PostingReqAcc;
import com.shorewise.wiseconnect.model.PostingReqCount;
import com.shorewise.wiseconnect.model.PostingReqCustomData;
import com.shorewise.wiseconnect.model.PostingReqPartTrnRec;
import com.shorewise.wiseconnect.model.PostingReqPmtInst;
import com.shorewise.wiseconnect.model.PostingReqTranPart;
import com.shorewise.wiseconnect.model.PostingReqTrnAddRequest;
import com.shorewise.wiseconnect.model.PostingReqTrnAddRq;
import com.shorewise.wiseconnect.model.PostingReqTrnDetail;
import com.shorewise.wiseconnect.model.PostingReqTrnHdr;
import com.shorewise.wiseconnect.util.CcyAmtConvertUtil;
import com.shorewise.wiseconnect.util.CommonMethods;
import com.shorewise.wiseconnect.util.DateTimeUtil;
import com.shorewise.wiseconnect.util.ServiceProcessorUtil;
import com.shorewise.wiseconnect.util.ThemeBridgeUtilFgb;
import com.shorewise.wiseconnect.util.ValidationsUtil;


@Component
public class EODPostingService extends ServiceProcessorUtil {
		
	 @Autowired
	 private JdbcTemplate jdbcTemplate;
	    
		
	   private static final Logger logger = Logger.getLogger(EODPostingService.class.getName());
	   private String bankResTranID;
	   private BackOfficeBatchBankRes bankRes;
	   Gson aGson = (new GsonBuilder()).disableHtmlEscaping().create();

	   public synchronized int insertPeriodPstIntoEODPostings() {
	      int insertedCount = 0;

	      try {
	         this.takeBackupOfEODData();
	         this.truncateEODStagingData();
	         insertedCount = this.insertPeriodPstIntoEODStagingTable();
	         if (insertedCount > 0) {
	            this.generateBatchEODPostings();
	         }
	      } catch (Exception var3) {
	         var3.printStackTrace();
	      }

	      return insertedCount;
	   }

	   public synchronized int insertFincePstIntoEODPostings() {
	      int insertedCount = 0;

	      try {
	         this.takeBackupOfEODData();
	         this.truncateEODStagingData();
	         insertedCount = this.insertFincePstIntoEODStagingTable();
	         if (insertedCount > 0) {
	            this.generateBatchEODPostings();
	         }
	      } catch (Exception var3) {
	         var3.printStackTrace();
	      }

	      return insertedCount;
	   }

	   public int insertPeriodPstIntoEODStagingTable() {
		    int insertedCount = 0;
		    new CommonMethods().getProperties();
		    String ftiEODPostingTable = (String)CommonMethods.TBProperties.get("FTI_EOD_POSTING_TBL");
		    String sql = "INSERT INTO THEMEBRIDGE.EODPOSTING_STAGING "
		               + "SELECT PRD.CHGPST_BOB AS POSTING_BRANCH, "
		               + "TRIM(SUBSTR(PRD.CHGPST_ACC,2,34)) AS BO_ACCT_NO, "
		               + "PRD.CHGPST_TCD AS TRAN_CODE, PRD.CHGPST_AMA AS POSTING_AMT, "
		               + "PRD.CHGPST_CCY AS POSTING_CCY, PRD.ACC_TYPE AS ACCT_TYPE, "
		               + "PRD.DR_CR_FLG AS DEBIT_CREDIT_FLAG, "
		               + "TO_CHAR(PRD.CHGPST_DTE,'YYYY-MM-DD') AS VALUE_DATE, "
		               + "TRIM(PRD.CHGPST_NR1) AS POSTING_NAR1, "
		               + "PRD.SEQNO AS POSTING_SEQNO, TRIM(PRD.CHGPST_DLR) AS MASTER_REFERENCE "
		               + "FROM " + ftiEODPostingTable + " PRD";

		    try {
		        insertedCount = jdbcTemplate.update(sql);
		        logger.info("TI eod table details are inserted into ThemeBridge EODPosting staging table successfully with the count: " + insertedCount);
		    } catch (DataAccessException e) {
		        logger.error("Error during insertion into EODPosting staging table: ", e);
		    }

		    return insertedCount;
		}

	   public int insertFincePstIntoEODStagingTable() {
	        String query = "INSERT INTO THEMEBRIDGE.EODPOSTING_STAGING  SELECT FIN.FINPST_BIN AS POSTING_BRANCH, TRIM(SUBSTR(FIN.FINPST_ACC,2,34)) AS BO_ACCT_NO, FIN.FINPST_TCD AS TRAN_CODE, FIN.FINPST_AMA AS POSTING_AMT, FIN.FINPST_CCY AS POSTING_CCY, FIN.ACC_TYPE AS ACCT_TYPE, FIN.DR_CR_FLG AS DEBIT_CREDIT_FLAG, TO_CHAR(FIN.FINPST_DTE,'YYYY-MM-DD') AS VALUE_DATE, TRIM(FIN.FINPST_DLP) AS POSTING_NAR1, '1' AS POSTING_SEQNO, TRIM(FIN.FINPST_DLR) AS MASTER_REFERENCE FROM FINCE_PST FIN";

	        try {
	            int insertedCount = jdbcTemplate.update(query);
	            logger.info("TI eod table details are inserted into ThemeBridge EODPosting staging table successfully with the count: " + insertedCount);
	            return insertedCount;
	        } catch (Exception e) {
	            logger.error("Error during insertFincePstIntoEODStagingTable: ", e);
	            return 0;
	        }
	    }

	  
	   public void takeBackupOfEODData() {
	        String sql = "INSERT INTO THEMEBRIDGE.EODPOSTING_BACKUP SELECT * FROM THEMEBRIDGE.EODPOSTING_STAGING";
	        try {
	            int count = jdbcTemplate.update(sql);
	            logger.info("Backup count: " + count);
	        } catch (DataAccessException e) {
	            logger.error("Error during backup: ", e);
	        }
	    }
	  

	   private void truncateEODStagingData() {
		    String sql = "TRUNCATE TABLE THEMEBRIDGE.EODPOSTING_STAGING";
		    try {
		        jdbcTemplate.execute(sql);
		        logger.info("ThemeBridge EODPOSTING_STAGING truncated successfully");
		    } catch (DataAccessException e) {
		        logger.error("Error during truncating table: ", e);
		    }
		}
	   
	   
	@SuppressWarnings("unchecked")
	public void generateBatchEODPostings() {
		      try {
		         new CommonMethods().getProperties();
		         String finacleCount = (String)CommonMethods.TBProperties.get("FinacleBatchCount");
		         int FinacleRecordCount = Integer.parseInt(finacleCount);
		         String[] validPostingAcctTypes = ((String)CommonMethods.TBProperties.get("FcyPostingAccountTypes")).split(",");
		         List<String> branchList = this.getBranchListFromEODStagingTable();
		         Iterator var6 = branchList.iterator();

		         while(true) {
		            String postingBranch;
		            List anEODStageTableList;
		            LinkedList trnRecList;
		            LinkedList trnPartList;
		            int creditCount;
		            int debitCount;
		            do {
		               do {
		                  if (!var6.hasNext()) {
		                     return;
		                  }

		                  postingBranch = (String)var6.next();
		                  anEODStageTableList = this.getDetailsFromEODStagingTable(postingBranch);
		                  logger.info("Size of EODstagetablelist is : " + anEODStageTableList.size() + " for Branch : " + postingBranch);
		                  trnRecList = new LinkedList();
		                  trnPartList = new LinkedList();
		                  creditCount = 0;
		                  debitCount = 0;
		               } while(anEODStageTableList == null);
		            } while(anEODStageTableList.size() <= 0);

		            Iterator<HashMap> sourceListItr = anEODStageTableList.iterator();
		            int recordCount = 0;

		            while(sourceListItr.hasNext()) {
		               HashMap<?, ?> anSourceMap = (HashMap)sourceListItr.next();
		               ++recordCount;
		               String debitCreditFlag = ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "DebitCreditFlag");
		               if (debitCreditFlag != null && debitCreditFlag.equals("C")) {
		                  ++creditCount;
		               } else if (debitCreditFlag != null && debitCreditFlag.equals("D")) {
		                  ++debitCount;
		               }

		               String postingAmount = ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "PostingAmount");
		               String postingCcy = ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "PostingCcy");
		               postingAmount = CcyAmtConvertUtil.convtoRegfrmtAmount(postingCcy, postingAmount);
		               String postingAcctNo = ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "BackOfficeAccountNo");
		               String acctType = ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "AcctType");
		               String masterReference = ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "MasterReference");
		               if (ThemeBridgeUtilFgb.isValidAmount(Double.valueOf(postingAmount)) && ThemeBridgeUtilFgb.isValidString(postingCcy) && ThemeBridgeUtilFgb.isValidString(acctType) && ArrayUtils.contains(validPostingAcctTypes, acctType) && !postingCcy.equalsIgnoreCase("INR") && ThemeBridgeUtilFgb.isValidString(postingAcctNo)) {
		                  String rate = this.fetchFXRate(postingCcy);
		                  if (ThemeBridgeUtilFgb.isValidString(rate)) {
		                     postingAmount = CcyAmtConvertUtil.getEquivalentINRAmount("INR", postingAmount, rate);
		                     if (ThemeBridgeUtilFgb.isValidString(postingAmount)) {
		                        postingCcy = "INR";
		                        postingAcctNo = postingAcctNo.substring(0, postingAcctNo.length() - 2) + "00";
		                        insertForeignCcyPostingDetails(masterReference, "", acctType, debitCreditFlag, CcyAmtConvertUtil.convtoRegfrmtAmount(ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "PostingCcy"), ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "PostingAmount")), ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "PostingCcy"), ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "BackOfficeAccountNo"), rate, postingAmount, postingCcy, postingAcctNo);
		                     } else {
		                         postingAmount = CcyAmtConvertUtil.convtoRegfrmtAmount(postingCcy, postingAmount);
		                       }
		                  }
		               }

		               PostingReqPartTrnRec aPostingReqPartTrnRec = new PostingReqPartTrnRec();
		               PostingReqAcc aPostingReqAcc = new PostingReqAcc();
		               aPostingReqAcc.setAcctId(postingAcctNo);
		               aPostingReqPartTrnRec.setAcctId(aPostingReqAcc);
		               aPostingReqPartTrnRec.setCreditDebitFlg(debitCreditFlag);
		               AmtAndCcy aAmtAndCcy = new AmtAndCcy();
		               aAmtAndCcy.setAmountValue(postingAmount);
		               aAmtAndCcy.setCurrencyCode(postingCcy);
		               aPostingReqPartTrnRec.setTrnAmt(aAmtAndCcy);
		               aPostingReqPartTrnRec.setTrnParticulars(masterReference);
		               aPostingReqPartTrnRec.setValueDt(ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "ValueDate") + "T" + DateTimeUtil.getH24Time());
		               aPostingReqPartTrnRec.setSerialNum(String.valueOf(recordCount));
		               PostingReqPmtInst aPostingReqPmtInst = new PostingReqPmtInst();
		               aPostingReqPmtInst.setPmtInstType("DV");
		               aPostingReqPartTrnRec.setPmtInst(aPostingReqPmtInst);
		               trnRecList.add(aPostingReqPartTrnRec);
		               PostingReqTranPart aPostingReqTranPart = new PostingReqTranPart();
		               aPostingReqTranPart.setSERIAL_NUM(String.valueOf(recordCount));
		               aPostingReqTranPart.setPARTTNDTLENTERED("1");
		               aPostingReqTranPart.setENTITYDISPID(masterReference);
		               aPostingReqTranPart.setENTITY_TYPE("EOD");
		               aPostingReqTranPart.setTRANRMKS(masterReference);
		               aPostingReqTranPart.setTRANPARTICULARS2(masterReference);
		               aPostingReqTranPart.setREFNO(masterReference);
		               trnPartList.add(aPostingReqTranPart);
		               if (recordCount == FinacleRecordCount) {
		                  this.processBankRequestDetails(trnRecList, trnPartList, creditCount, debitCount, postingBranch);
		                  recordCount = 0;
		                  creditCount = 0;
		                  debitCount = 0;
		                  trnRecList.clear();
		                  trnPartList.clear();
		               }
		            }

		            if (trnRecList != null && trnRecList.size() > 0) {
		               this.processBankRequestDetails(trnRecList, trnPartList, creditCount, debitCount, postingBranch);
		            }
		         }
		      } catch (Exception var26) {
		         logger.info("Error while parsing EOD Posting" + var26.getMessage());
		      }
		   }

	   public String pushBatchEODPostings() {
	      String bankRequest = "";
	      String bankResponse = "";
	      String tiResponse = "";
	      String tiResponseStatus = "FAILED";
	      String batchLogId = "";

	      try {
	         List<HashMap<String, Object>> anEODBatchPostingList = this.getBatchEODPostings();
	         if (anEODBatchPostingList != null && anEODBatchPostingList.size() > 0) {
	            Iterator sourceListItr = anEODBatchPostingList.iterator();

	            while(sourceListItr.hasNext()) {
	               HashMap<?, ?> anSourceMap = (HashMap)sourceListItr.next();
	               bankRequest = ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "BankRequest");
	               batchLogId = ValidationsUtil.mapValueToStringOrEmpty(anSourceMap, "BatchLogID");
	             

	                  updateEODPostingBatchLogData(batchLogId, bankResponse, tiResponse, tiResponseStatus);
	               }
	            }
	         
	      } catch (Exception var15) {
	         var15.printStackTrace();
	      }

	      return tiResponseStatus;
	   }

		public void insertForeignCcyPostingDetails(String masterReference, String eventReference, String accountType,
				String debitCreditFlag, String foreignCcyAmount, String foreignCcy, String foreignCcyAcctNo,
				String fxRate, String localCcyAmount, String localCcy, String localCcyAcctNo) {

			String sql = "INSERT INTO FOREIGN_CCY_POSTING "
					+ "(MASTER_REFERENCE, EVENT_REFERENCE, ACCT_TYPE, DEBIT_CREDIT_FLAG, FOREIGN_CCY_AMOUNT, FOREIGN_CCY, "
					+ "FOREIGN_CCY_ACCTNO, FXRATE, LOCAL_CCY_AMOUNT, LOCAL_CCY, LOCAL_CCY_ACCTNO) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			try {
				jdbcTemplate.update(sql, masterReference, eventReference, accountType, debitCreditFlag,
						foreignCcyAmount, foreignCcy, foreignCcyAcctNo, fxRate, localCcyAmount, localCcy,
						localCcyAcctNo);
				System.out.println("Record inserted into FOREIGN_CCY_POSTING table");
			} catch (DataAccessException e) {
				e.printStackTrace();
				// Handle or throw the exception appropriately
			}
		}
	   
	   
	   
	   public String fetchFXRate(String currency) {
	        String fxRateQuery = "SELECT SELLEX99 AS RATE FROM FXRATE86 WHERE CODE53 = 'BLS' AND CURREN49 = ?";
	        String rate = "";

	        try {
	            rate = jdbcTemplate.queryForObject(fxRateQuery, new Object[]{currency.trim()}, String.class);
	            logger.info("FX Rate value from FXRATE86 : " + rate);
	        } catch (EmptyResultDataAccessException e) {
	            logger.error("No FX rate found for currency: " + currency, e);
	        } catch (Exception e) {
	            logger.error("Error fetching FX rate for currency: " + currency, e);
	        }

	        return rate;
	    }

	   public List<HashMap<String, Object>> getDetailsFromEODStagingTable(String branch) {
	        String queryDetails = "SELECT * FROM EODPOSTING_STAGING WHERE TRIM(POSTING_BRANCH) = ? ORDER BY MASTER_REFERENCE, POSTING_AMT, POSTING_SEQNO";
	        
	        return jdbcTemplate.query(queryDetails, new Object[]{branch.trim()}, new ResultSetExtractor<List<HashMap<String, Object>>>() {
	            @Override
	            public List<HashMap<String, Object>> extractData(ResultSet rs) throws SQLException {
	                List<HashMap<String, Object>> list = new ArrayList<>();
	                while (rs.next()) {
	                    HashMap<String, Object> anHashMap = new HashMap<>();
	                    anHashMap.put("PostingBranch", rs.getString("POSTING_BRANCH"));
	                    anHashMap.put("BackOfficeAccountNo", rs.getString("BO_ACCT_NO"));
	                    anHashMap.put("TranCode", rs.getString("TRAN_CODE"));
	                    anHashMap.put("PostingAmount", rs.getString("POSTING_AMT"));
	                    anHashMap.put("PostingCcy", rs.getString("POSTING_CCY"));
	                    anHashMap.put("AcctType", rs.getString("ACCT_TYPE"));
	                    anHashMap.put("DebitCreditFlag", rs.getString("DEBIT_CREDIT_FLAG"));
	                    anHashMap.put("ValueDate", rs.getString("VALUE_DATE"));
	                    anHashMap.put("PostingNarrative1", rs.getString("POSTING_NAR1"));
	                    anHashMap.put("PosSeqNo", rs.getString("POSTING_SEQNO"));
	                    anHashMap.put("MasterReference", rs.getString("MASTER_REFERENCE"));
	                    list.add(anHashMap);
	                }
	                return list;
	            }
	        });
	    }
	   
	   public List<String> getBranchListFromEODStagingTable() {
	        String sql = "SELECT DISTINCT POSTING_BRANCH FROM EODPOSTING_STAGING";
	        return jdbcTemplate.query(sql, new RowMapper<String>() {
	            @Override
	            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
	                return rs.getString("POSTING_BRANCH").trim();
	            }
	        });
	    }


	   public List<HashMap<String, Object>> getBatchEODPostings() {
	        String sql = "SELECT BANKREQUEST, ID FROM EODPOSTING_BATCH_LOG WHERE STATUS='WAITING' ORDER BY ID";

	        return jdbcTemplate.query(sql, new RowMapper<HashMap<String, Object>>() {
	            @Override
	            public HashMap<String, Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
	                HashMap<String, Object> anHashMap = new HashMap<>();
	                anHashMap.put("BankRequest", rs.getString("BANKREQUEST"));
	                anHashMap.put("BatchLogID", rs.getInt("ID"));
	                return anHashMap;
	            }
	        });
	    }

	   private void processBankRequestDetails(List<PostingReqPartTrnRec> trnRecList, List<PostingReqTranPart> trnPartList, int creditCount, int debitCount, String postingBranch) {
	      String plainBankReq = "";
	      boolean var7 = false;

	      try {
	         PostingReqTrnDetail aPostingReqTrnDetail = new PostingReqTrnDetail();
	         aPostingReqTrnDetail.setPartTrnRec(trnRecList);
	         PostingReqTrnHdr aPostingReqTrnHdr = new PostingReqTrnHdr();
	         aPostingReqTrnHdr.setTrnSubType("BI");
	         aPostingReqTrnHdr.setTrnType("T");
	         PostingReqCount aPostingReqCount = new PostingReqCount();
	         aPostingReqCount.setCreditCount(String.valueOf(creditCount));
	         aPostingReqCount.setDebitCount(String.valueOf(debitCount));
	         aPostingReqCount.setTotalXferCount(String.valueOf(creditCount + debitCount));
	         PostingReqTrnAddRq aPostingReqTrnAddRq = new PostingReqTrnAddRq();
	         aPostingReqTrnAddRq.setXferTrnHdr(aPostingReqTrnHdr);
	         aPostingReqTrnAddRq.setXferCount(aPostingReqCount);
	         aPostingReqTrnAddRq.setXferTrnDetail(aPostingReqTrnDetail);
	         PostingReqCustomData aPostingReqCustomData = new PostingReqCustomData();
	         aPostingReqCustomData.setSolid(postingBranch);
	         aPostingReqCustomData.setTRANPART(trnPartList);
	         PostingReqTrnAddRequest aPostingReqTrnAddRequest = new PostingReqTrnAddRequest();
	         aPostingReqTrnAddRequest.setXferTrnAdd_CustomData(aPostingReqCustomData);
	         aPostingReqTrnAddRequest.setXferTrnAddRq(aPostingReqTrnAddRq);
	         String sequence = DateTimeUtil.getSqlLocalDateTime().toString();
	         sequence = sequence.replaceAll("[- :.]", "");
	         PostingReq aPostingReg = new PostingReq();
	         aPostingReg.setXferTrnAddRequest(aPostingReqTrnAddRequest);
	         aPostingReg.setMsgid(sequence);
	         plainBankReq = this.aGson.toJson(aPostingReg).trim();
	         logger.info("Bank Request of EOD Posting --> " + plainBankReq);
	         insertEODPostingBatchLogData("BackOffice", "EOD Posting", "ZONE1", postingBranch, "ZONE1", "BOCBS", plainBankReq, "", "", "WAITING");
	      } catch (Exception var16) {
	         var16.printStackTrace();
	      }

	   }

	  

	   public void insertEODPostingBatchLogData(String service, String operation, String zone, String branch, String source, String destination, String bankRequestJson, String bankResponseJson, String tiResponse, String tiResponseStatus) {
	        logger.info("Process entered into EOD Postings logging process in ThemeBridge EODPOSTING_BATCH_LOG table...!");
	        String query = "INSERT INTO EODPOSTING_BATCH_LOG(SERVICE, OPERATION, ZONE, SOURCE, DESTINATION, TIREQUEST, BANKREQUEST, BANKRESPONSE, TIRESPONSE, PROCESS_TIME, STATUS) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	        try {
	            int count = jdbcTemplate.update(query, service, operation, zone, source, destination, "NA", bankRequestJson, bankResponseJson, tiResponse, DateTimeUtil.getSqlLocalDateTime(), tiResponseStatus);
	            logger.info("EOD Batch Postings are added successfully with count: " + count);
	        } catch (Exception e) {
	            logger.error("Error during insertEODPostingBatchLogData: ", e);
	        }
	    }

	   public void updateEODPostingBatchLogData(String batchLogId, String bankResponseJson, String tiResponse, String tiResponseStatus) {
	        logger.info("Process entered into update EOD Posting logging process in ThemeBridge EODPOSTING_BATCH_LOG table...!");
	        String query = "UPDATE EODPOSTING_BATCH_LOG SET BANKRESPONSE=?, TIRESPONSE=?,PROCESS_TIME=?, STATUS=? WHERE ID=?";

	        try {
	            int count = jdbcTemplate.update(query, bankResponseJson, tiResponse, DateTimeUtil.getSqlLocalDateTime(), tiResponseStatus, Integer.valueOf(batchLogId));
	            logger.info("EOD Batch Posting is updated successfully for: " + batchLogId);
	        } catch (Exception e) {
	            logger.error("Error during updateEODPostingBatchLogData: ", e);
	        }
	    }
	}


