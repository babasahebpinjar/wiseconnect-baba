package com.shorewise.wiseconnect.model;

public class BackOfficeBatchBankReqPartTxnRec {
   private BackOfficeBatchBankReqAcctId AcctId;
   private String CreditDebitFlg;
   private BackOfficeBatchBankReqTrnAmt TrnAmt;
   private String TrnParticulars;
   private String ValueDt;
   private BackOfficeBatchBankReqPmtInst PmtInst;

   public BackOfficeBatchBankReqAcctId getAcctId() {
      return this.AcctId;
   }

   public void setAcctId(BackOfficeBatchBankReqAcctId acctId) {
      this.AcctId = acctId;
   }

   public String getCreditDebitFlg() {
      return this.CreditDebitFlg;
   }

   public void setCreditDebitFlg(String creditDebitFlg) {
      this.CreditDebitFlg = creditDebitFlg;
   }

   public BackOfficeBatchBankReqTrnAmt getTrnAmt() {
      return this.TrnAmt;
   }

   public void setTrnAmt(BackOfficeBatchBankReqTrnAmt trnAmt) {
      this.TrnAmt = trnAmt;
   }

   public String getTrnParticulars() {
      return this.TrnParticulars;
   }

   public void setTrnParticulars(String trnParticulars) {
      this.TrnParticulars = trnParticulars;
   }

   public String getValueDt() {
      return this.ValueDt;
   }

   public void setValueDt(String valueDt) {
      this.ValueDt = valueDt;
   }

   public BackOfficeBatchBankReqPmtInst getPmtInst() {
      return this.PmtInst;
   }

   public void setPmtInst(BackOfficeBatchBankReqPmtInst pmtInst) {
      this.PmtInst = pmtInst;
   }
}
