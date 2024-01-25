package com.shorewise.wiseconnect.util;

import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 *
 * @since 2020-FEB-13, 2019-JAN-24
 * @version v.2.1.2
 * @author <b><i><font color=blue>Prasath Ravichandran</font></i></b>
 *         <font color=green>Software Analyst</font>
 *         <font color=violet>Bluescope</font>
 *
 */
public class CcyAmtConvertUtil {

	private final static Logger logger = Logger.getLogger(CcyAmtConvertUtil.class.getName());

	public static void main(String[] args) {

		// getFileProperties("USD");
		// generateCcyPropFile("ZONE1", "2");

		// tiamountConversion("BHD", "1236545123654588995100");
		// getRegAmount("OMR", "1236545123654588995100");
		// // getRegAmountByDB("ZONE1", "ITL", "1236545123654588995100");
		// // ccyValueRoundOff("KWD", "126583.8954456");
		//
		// BigDecimal repayValue2 = new BigDecimal("456789.00");
		// BigDecimal repayValue = repayValue2.setScale(0, BigDecimal.ROUND_DOWN);
		// System.out.println(repayValue);

		// System.out.println(getRegAmount("INR", "235632"));
		// System.out.println(getRegAmount("JPY", "235632"));
		// System.out.println(getRegAmount("OMR", "235632"));

		// System.out.println(getEqualFCYAmount("USD", "7240.00", "72.4"));
		//System.out.println(getEqualFCYAmount("USD", "1500000.00", "72.4"));
		/*String tifrmtAmount="28302.63";
		BigDecimal tiamountBG = new BigDecimal(tifrmtAmount);
		BigDecimal convAmount = tiamountBG.divide(new BigDecimal(100), 2, RoundingMode.CEILING);
	

	String regularAmount = String.valueOf(convAmount);
	System.out.println(regularAmount);*/
		/*String tifrmtAmount="2261475";
		BigDecimal tiamountBG = new BigDecimal(tifrmtAmount);
		BigDecimal convAmount = tiamountBG.divide(new BigDecimal(100), 2, RoundingMode.CEILING);
System.out.println(convAmount+" convAmount");
	String regularAmount = String.valueOf(convAmount);
	System.out.println("regularAmount "+regularAmount);*/
		System.out.println(getEquivalentINRAmount("INR", "22614.75", "94.9463"));
	}

	/**
	 * 
	 * @since 14-SEP-2019
	 * @version v.1.0
	 * @author <b><font color=blue>Prasath Ravichandran, </font>
	 *         <font color=green>Software Analyst, </font>
	 *         <font color=violet>Bluescope Information Technology.</font></b>
	 * 
	 *         <p>
	 *         <b> Format INR amount conversion with REG_FORMATTED_AMOUNT </b>
	 *         </p>
	 * 
	 *         <p>
	 *         Input : 100<br>
	 *         Output : 100.00
	 *         </p>
	 * 
	 * @param outputCcyCode {@code allows 3 char }{@link String}
	 * @param regfrmtAmount {@code allows }{@link String}
	 * @return {@code allows }{@link String}
	 */
	public static String getFrmtAmount(String outputCcyCode, String regfrmtAmount) {

		String respAmount = "";
		try {
			BigDecimal inrValue = new BigDecimal(regfrmtAmount);

			Currency ccyNameCode = Currency.getInstance(outputCcyCode);
			int precision = ccyNameCode.getDefaultFractionDigits();
			RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_EVEN;

			BigDecimal roundOffValue = null;
			roundOffValue = inrValue.setScale(precision, DEFAULT_ROUNDING);
			// System.out.println(">>>" + roundOffValue);
			respAmount = String.valueOf(roundOffValue);

		} catch (Exception e) {
			System.out.println("Roundoff amount exception " + e.getMessage());
			e.printStackTrace();
		}
		// System.out.println("ReturnRegAmount: " + respAmount);
		return respAmount;
	}

	/**
	 * 01
	 * 
	 * @since 04-MAR-2019
	 * @version v.1.0
	 * @author <b><font color=blue>Prasath Ravichandran, </font>
	 *         <font color=green>Software Analyst, </font>
	 *         <font color=violet>Bluescope Information Technology.</font></b>
	 * 
	 *         <p>
	 *         <b> Amount conversion from REG_FORMATTED_AMOUNT >>-->>
	 *         TI_FORMATTED_AMOUNT by IF.....ELSE loop</b>
	 *         </p>
	 * 
	 *         <p>
	 *         Input : 100.23<br>
	 *         Output : 10023
	 *         </p>
	 * 
	 * @param currency      {@code allows 3 char }{@link String}
	 * @param regfrmtAmount {@code allows }{@link String}
	 * @return {@code returns }{@link String}
	 */
	public static String convtoTIfrmtAmount(String ccy, String regfrmtAmount) {

		String tifrmtAmount = "";
		BigDecimal convAmount = null;
		BigDecimal regAmountBG = null;

		try {
			if (ccy.equalsIgnoreCase("BIF") || ccy.equalsIgnoreCase("CLP") || ccy.equalsIgnoreCase("DJF")
					|| ccy.equalsIgnoreCase("ESP") || ccy.equalsIgnoreCase("GNF") || ccy.equalsIgnoreCase("ISK")
					|| ccy.equalsIgnoreCase("ITL") || ccy.equalsIgnoreCase("JPY") || ccy.equalsIgnoreCase("KMF")
					|| ccy.equalsIgnoreCase("KPW") || ccy.equalsIgnoreCase("KRW") || ccy.equalsIgnoreCase("MGA")
					|| ccy.equalsIgnoreCase("MKD") || ccy.equalsIgnoreCase("MMK") || ccy.equalsIgnoreCase("MRO")
					|| ccy.equalsIgnoreCase("PYG") || ccy.equalsIgnoreCase("RWF") || ccy.equalsIgnoreCase("VUV")
					|| ccy.equalsIgnoreCase("XAF") || ccy.equalsIgnoreCase("XOF") || ccy.equalsIgnoreCase("XPF")) {
				regAmountBG = new BigDecimal(regfrmtAmount);
				convAmount = regAmountBG; // nothing change

			} else if (ccy.equalsIgnoreCase("BHD") || ccy.equalsIgnoreCase("IQD") || ccy.equalsIgnoreCase("JOD")
					|| ccy.equalsIgnoreCase("KWD") || ccy.equalsIgnoreCase("LYD") || ccy.equalsIgnoreCase("OMR")
					|| ccy.equalsIgnoreCase("TND") || ccy.equalsIgnoreCase("XAG") || ccy.equalsIgnoreCase("XAU")) {
				regAmountBG = new BigDecimal(regfrmtAmount);
				convAmount = regAmountBG.multiply(new BigDecimal(1000));

			} else {
				regAmountBG = new BigDecimal(regfrmtAmount);
				convAmount = regAmountBG.multiply(new BigDecimal(100));
			}

			long tifrmtLong = convAmount.longValue();
			tifrmtAmount = String.valueOf(tifrmtLong);
			// System.out.println(">>****" + tifrmtAmount);

		} catch (Exception e) {
			System.out.println("REGULAR_FORMAT[" + ccy + "]: " + tifrmtAmount + ">>-->>" + regfrmtAmount);
			System.out.println("REGULAR_FORMAT_AMOUNT >>-->> TI_FORMAT_AMOUNT exception " + e.getMessage());
			e.printStackTrace();
		}

		return tifrmtAmount;
	}

	/**
	 * 02-B
	 * 
	 * @since 23-Jan-2019
	 * @version v.1.0
	 * @author <b><font color=blue>Prasath Ravichandran, </font>
	 *         <font color=green>Software Analyst, </font>
	 *         <font color=violet>Bluescope Information Technology.</font></b>
	 * 
	 *         <p>
	 *         <b> Amount conversion from TI_FORMATTED_AMOUNT >>-->>
	 *         REG_FORMATTED_AMOUNT by IF.....ELSE loop</b>
	 *         </p>
	 * 
	 *         <p>
	 *         Input : 10023 {added precision}<br>
	 *         Output : 100.23
	 *         </p>
	 * 
	 * @param currency     {@code allows 3 char }{@link String}
	 * @param tifrmtAmount {@code allows }{@link String}
	 * @return {@code returns }{@link String}
	 */
	public static String convtoRegfrmtAmount(String ccy, String tifrmtAmount) {

		// System.out.println("TIAmountConversion initiated!");

		String regularAmount = "";
		BigDecimal convAmount = null;
		BigDecimal tiamountBG = null;

		try {
			if (ccy.equalsIgnoreCase("BIF") || ccy.equalsIgnoreCase("CLP") || ccy.equalsIgnoreCase("DJF")
					|| ccy.equalsIgnoreCase("ESP") || ccy.equalsIgnoreCase("GNF") || ccy.equalsIgnoreCase("ISK")
					|| ccy.equalsIgnoreCase("ITL") || ccy.equalsIgnoreCase("JPY") || ccy.equalsIgnoreCase("KMF")
					|| ccy.equalsIgnoreCase("KPW") || ccy.equalsIgnoreCase("KRW") || ccy.equalsIgnoreCase("MGA")
					|| ccy.equalsIgnoreCase("MKD") || ccy.equalsIgnoreCase("MMK") || ccy.equalsIgnoreCase("MRO")
					|| ccy.equalsIgnoreCase("PYG") || ccy.equalsIgnoreCase("RWF") || ccy.equalsIgnoreCase("VUV")
					|| ccy.equalsIgnoreCase("XAF") || ccy.equalsIgnoreCase("XOF") || ccy.equalsIgnoreCase("XPF")) {
				tiamountBG = new BigDecimal(tifrmtAmount);
				convAmount = tiamountBG; // nothing change

			} else if (ccy.equalsIgnoreCase("BHD") || ccy.equalsIgnoreCase("IQD") || ccy.equalsIgnoreCase("JOD")
					|| ccy.equalsIgnoreCase("KWD") || ccy.equalsIgnoreCase("LYD") || ccy.equalsIgnoreCase("OMR")
					|| ccy.equalsIgnoreCase("TND") || ccy.equalsIgnoreCase("XAG") || ccy.equalsIgnoreCase("XAU")) {
				tiamountBG = new BigDecimal(tifrmtAmount);
				convAmount = tiamountBG.divide(new BigDecimal(1000), 3, RoundingMode.CEILING);

			} else {
				tiamountBG = new BigDecimal(tifrmtAmount);
				convAmount = tiamountBG.divide(new BigDecimal(100), 2, RoundingMode.CEILING);
			}

			regularAmount = String.valueOf(convAmount);

		} catch (Exception e) {
			System.out.println("TIFRMT_AMOUNT[" + ccy + "]: " + tifrmtAmount + ">>-->>" + regularAmount);
			System.out.println("TI_FORMAT_AMOUNT >>-->> REGULAR_FORMAT_AMOUNT exception " + e.getMessage());
			e.printStackTrace();
		}

		// System.out.println("TI_FORMAT >>-->> " + tifrmtAmount + " <<--<< [" + ccy + "]
		// >>-->> REGULAR_FORMAT >>-->> " + regularAmount);
		return regularAmount;
	}

	/**
	 * 02-A (Perfect output) - Preferable
	 * 
	 * @since 23-Jan-2019
	 * @version v.1.0
	 * @author <b><font color=blue>Prasath Ravichandran, </font>
	 *         <font color=green>Software Analyst, </font>
	 *         <font color=violet>Bluescope Information Technology.</font></b>
	 * 
	 *         <p>
	 *         <b> Amount conversion from TI_FORMATTED_AMOUNT >>-->>
	 *         REG_FORMATTED_AMOUNT by database data</b>
	 *         </p>
	 * 
	 *         <p>
	 *         Input : 10023 <br>
	 *         Output : 100.23
	 *         </p>
	 * 
	 * @param sourceSystem {@code allows}{@link String}
	 * @param currency     {@code allows 3 char }{@link String}
	 * @param tifrmtamount {@code allows }{@link String}
	 * @return {@code returns }{@link String}
	 */
	public static String getRegAmount(String currency, String tifrmtamount) {

		// System.out.println("TIFRMT_AMOUNT[" + currency + "]: " + tifrmtamount);
		String regularFrmtAmount = "";

		try {
			int decimalPlace = 0;
			// String decimalStr = getFileProperties(currency);
			// decimalPlace = Integer.parseInt(getFileProperties(currency));

			/** Auto pick ccy decimal value from java default lib **/
			Currency ccyNameCode = Currency.getInstance(currency);
			decimalPlace = ccyNameCode.getDefaultFractionDigits();
			// System.out.println("CCY_decimalPlace " + decimalPlace);

			double minorValueD = Math.pow(10, decimalPlace);
			BigDecimal denominator = BigDecimal.valueOf(minorValueD);
			// System.out.println("CCY_denominatorValue " + denominator);

			BigDecimal tiamountBD = new BigDecimal(tifrmtamount);
			BigDecimal resultAmount = tiamountBD.divide(denominator, decimalPlace, RoundingMode.CEILING);
			regularFrmtAmount = String.valueOf(resultAmount);

		} catch (Exception e) {
			System.out.println("TIFRMT_AMOUNT[" + currency + "]: " + tifrmtamount + ">>-->>" + regularFrmtAmount);
			System.out.println("AmountConversion Exception! " + e.getMessage());
			e.printStackTrace();
		}
		// System.out.println("RegularAmount[" + currency + "]: " + regularFrmtAmount);
		return regularFrmtAmount;
	}

	/**
	 * 02-C, Not used in Kotak
	 * 
	 * @since 23-Jan-2019
	 * @version v.1.0
	 * @author <b><font color=blue>Prasath Ravichandran, </font>
	 *         <font color=green>Software Analyst, </font>
	 *         <font color=violet>Bluescope Information Technology.</font></b>
	 * 
	 *         <p>
	 *         <b> Amount conversion from TI_FORMATTED_AMOUNT >>-->>
	 *         REG_FORMATTED_AMOUNT by database data</b>
	 *         </p>
	 * 
	 *         <p>
	 *         Input : 10023 <br>
	 *         Output : 100.23
	 *         </p>
	 * 
	 * @param sourceSystem {@code allows}{@link String}
	 * @param currency     {@code allows 3 char }{@link String}
	 * @param tifrmtamount {@code allows }{@link String}
	 * @return {@code returns }{@link String}
	 */
	public static String getRegAmountByDB(String sourceSystem, String currency, String tifrmtamount) {

		// System.out.println("GetRegAmountByDB initiated!");

		String regularAmount = "";

		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps = null;

		/** 2019-Jan-23 **/
		String ccyDtlsQuery = "Select trim(C8CCY) as C8CCY, trim(C8CCYN) as C8CCYN, trim(C8CED) as C8CED, trim(C8CUR) as C8CUR"
				+ " from C8PF where C8CCY = ? order by C8CED, C8CCY asc ";
		System.out.println("CurrencyDetailsQuery: " + ccyDtlsQuery + "; Param[" + currency + "]");

		try {
			con = DatabaseUtility.getTizoneConnection();
			ps = con.prepareStatement(ccyDtlsQuery);
			ps.setString(1, currency);
			rs = ps.executeQuery();

			while (rs.next()) {
				int decimalPlace = rs.getInt("C8CED");
				System.out.println("CCY_decimalPlace " + decimalPlace);

				double minorValueD = Math.pow(10, decimalPlace);
				BigDecimal denominator = BigDecimal.valueOf(minorValueD);
				System.out.println("CCY_denominatorValue " + denominator);

				BigDecimal tiamountBD = new BigDecimal(tifrmtamount);
				BigDecimal resultAmount = tiamountBD.divide(denominator, decimalPlace, RoundingMode.CEILING);
				regularAmount = String.valueOf(resultAmount);
			}

		} catch (SQLException e) {
			System.out.println("CurrencyDetailsQuery: " + ccyDtlsQuery + "; Param[" + currency + "]");
			System.out.println("AmountConversion SQLException! " + e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("CurrencyDetailsQuery: " + ccyDtlsQuery + "; Param[" + currency + "]");
			System.out.println("AmountConversion Exception! " + e.getMessage());
			e.printStackTrace();

		} finally {
			DatabaseUtility.surrenderPrepdConnection(con, ps, rs);
		}
		// System.out.println("RegularAmount[" + currency + "]: " + regularAmount);
		return regularAmount;
	}

	/********* UTIL ************/

	/**
	 * 02-D Currency denominator value, Not used in Kotak
	 * 
	 * <p>
	 * Input : USD <br>
	 * Output : 100
	 * </p>
	 * 
	 * <p>
	 * Input : OMR <br>
	 * Output : 1000
	 * </p>
	 * 
	 * <p>
	 * Input : JPY <br>
	 * Output : 1
	 * </p>
	 * 
	 * @param ccyCode {@code allows}{@link String}
	 * @return {@code allows}{@link BigDecimal}
	 */
	public static BigDecimal getDecimalforCurrency(String ccyCode) {

		BigDecimal denominatorValue = null;
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement ps = null;

		String query = "Select power(10, C8CED) as DENOMINATOR from C8PF where trim(c8ccy) ='" + ccyCode + "'";
		System.out.println("CcyMasterQurey: " + query);

		try {
			conn = DatabaseUtility.getTizoneConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				denominatorValue = rs.getBigDecimal("DENOMINATOR");
			}

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
			e.printStackTrace();

		} finally {
			DatabaseUtility.surrenderPrepdConnection(conn, ps, rs);
		}
		// System.out.println("DenominatorValue: " + denominatorValue);
		return denominatorValue;
	}

	/**
	 * 02-E Not used in Kotak
	 * 
	 * @since 23-Jan-2019
	 * @version v.1.0
	 * @author <b><font color=blue>Prasath Ravichandran, </font>
	 *         <font color=green>Software Analyst, </font>
	 *         <font color=violet>Bluescope Information Technology.</font></b>
	 * 
	 *         <p>
	 *         <b> Get CCY details data from properties </b>
	 *         </p>
	 * 
	 * @param key {@code allows }{@link String}
	 * @return {@code returns }{@link String}
	 */
	public static String getFileProperties(String key) {

		// System.out.println("GetFileProperties initiated!");

		String value = null;
		Properties fileProperty = null;
		InputStream inputStream = null;
		// logger.debug("Property KeyName : " + keyName);

		try {
			fileProperty = new Properties();
			// getClass().getResourceAsStream("CurrencyDetails.properties");
			inputStream = CcyAmtConvertUtil.class.getClassLoader().getResourceAsStream("currencyDetails.properties");
			fileProperty.load(inputStream);
			value = fileProperty.getProperty(key);

		} catch (Exception e) {
			System.out.println("Load property exception! " + e.getMessage());
			e.printStackTrace();

		} finally {
			try {
				if (inputStream != null)
					inputStream.close();
			} catch (Exception e) {
				System.out.println("InputStream exception! " + e.getMessage());
				e.printStackTrace();
			}
		}

		// System.out.println("Value >> " + value);
		return value;
	}

	/**
	 * 02-F Not used in Kotak
	 * 
	 * @since 23-Jan-2019
	 * @version v.1.0
	 * @author <b><font color=blue>Prasath Ravichandran, </font>
	 *         <font color=green>Software Analyst, </font>
	 *         <font color=violet>Bluescope Information Technology.</font></b>
	 * 
	 *         <p>
	 *         <b> Amount conversion from TI_FORMATTED_AMOUNT >>
	 *         REG_FORMATTED_AMOUNT by database data</b>
	 *         </p>
	 * 
	 * @param currency {@code allows }{@link String}
	 * @param tiamount {@code allows }{@link String}
	 * @return {@code returns }{@link String}
	 */
	public static String generateCcyPropFile(String sourceSystem, String decimal) {

		// System.out.println("GenerateCcyPropFile initiated!");

		String regularAmount = "";

		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps = null;

		/** 2019-Jan-23 **/
		String ccyDtlsQuery = "Select trim(C8CCY) as C8CCY, trim(C8CCYN) as C8CCYN, trim(C8CED) as C8CED, trim(C8CUR) as C8CUR"
				+ " from C8PF where C8CED = ? order by C8CCY asc ";
		System.out.println("CurrencyDetailsQuery: " + ccyDtlsQuery);

		try {
			con = DatabaseUtility.getTizoneConnection();
			ps = con.prepareStatement(ccyDtlsQuery);
			ps.setString(1, decimal);
			rs = ps.executeQuery();

			while (rs.next()) {
				String name = rs.getString("C8CUR");
				String ccy = rs.getString("C8CCY");
				String deci = rs.getString("C8CED");

				System.out.println("#" + name);
				System.out.println(ccy + "=" + deci);
			}

		} catch (SQLException e) {
			System.out.println("AmountConversion SQLException! " + e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("AmountConversion Exception! " + e.getMessage());
			e.printStackTrace();

		} finally {
			DatabaseUtility.surrenderPrepdConnection(con, ps, rs);
		}

		return regularAmount;
	}

	/**
	 * 03-A
	 * 
	 * Proper round off amount value based on currency (Perfect output), Not used in
	 * Kotak
	 * <p>
	 * Input : 123.4565 <br>
	 * Output : 123.46
	 * </p>
	 * 
	 * @param ccyCode       {@code allows 'INR' }{@link String }
	 * @param regfrmtAmount {@code allows '123.456' }{@link String }
	 * @return {@code allows '123.46' }{@link String }
	 */
	public static String ccyValueRoundOff(String ccyCode, String regfrmtAmount) {

		String respAmount = "";

		try {
			/** Dont delete below code **/
			// BigDecimal value1 = new BigDecimal("734449.4458999");
			// BigDecimal value2 = new BigDecimal("1245456.465463456");
			// BigDecimal multipliedValue = value1.multiply(value2);
			// System.out.println("Multiplied Value: " + multipliedValue);

			BigDecimal roundOffValue = null;
			BigDecimal amountValue = new BigDecimal(regfrmtAmount);

			Currency ccyNameCode = Currency.getInstance(ccyCode);
			int precision = ccyNameCode.getDefaultFractionDigits();// 2
			// System.out.println(ccyNameCode.getSymbol());// INR
			// System.out.println(ccyNameCode.getNumericCode()); //356
			// System.out.println(ccyNameCode.getDisplayName());//Indian Rupee
			// System.out.println(ccyNameCode.getCurrencyCode());// INR
			// System.out.println(ccyNameCode.getAvailableCurrencies());

			RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_EVEN;
			roundOffValue = amountValue.setScale(precision, DEFAULT_ROUNDING);
			// System.out.println(">>>" + roundOffValue);

			respAmount = String.valueOf(roundOffValue);

		} catch (Exception e) {
			System.out.println("Roundoff amount exception " + e.getMessage());
			e.printStackTrace();
		}

		return respAmount;
	}

	/**
	 * 03-B Not used in Kotak
	 * 
	 * @return
	 */
	public static String currencyRoundOff() {

		String regularAmount = "";
		try {
			BigDecimal value1 = new BigDecimal("734449.4458999");
			BigDecimal value2 = new BigDecimal("1245456.465463456");

			BigDecimal multiResult = value1.multiply(value2);
			System.out.println("Multiplied Value: " + multiResult);

			Currency ccyNameCode = Currency.getInstance("INR");
			int precision = ccyNameCode.getDefaultFractionDigits();

			RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_EVEN;
			BigDecimal roundOffValue = multiResult.setScale(precision, DEFAULT_ROUNDING);
			System.out.println(">>>" + roundOffValue);

			regularAmount = String.valueOf(roundOffValue);

		} catch (Exception e) {
			System.out.println("Roundoff amount exception " + e.getMessage());
			e.printStackTrace();
		}

		return regularAmount;
	}

	/**
	 * 
	 * 05-A Get INR equivalent amount against FCY regular amount with currency
	 * fraction digits
	 * 
	 * <p>
	 * Param1 : INR <br>
	 * Param2 : 12356489.4564565 <br>
	 * Param3 : 65.325 <br>
	 * Output : 807187673.74
	 * </p>
	 * 
	 * @param outputCcyCode   {@code always 'INR' }{@link String }
	 * @param regfrmtAmount   {@code allows '12365.45' }{@link String }
	 * @param regfrmtSpotRate {@code allows '72.456' }{@link String }
	 * @return {@code allows '895951.05' }{@link String }
	 */
	public static String getEquivalentINRAmount(String outputCcyCode, String regfrmtAmount, String regfrmtSpotRate) {

		String respAmount = "";
		// LimitServicesUtil.getSpotEquivalentINRAmount

		try {
			BigDecimal value1 = new BigDecimal(regfrmtAmount);
			BigDecimal value2 = new BigDecimal(regfrmtSpotRate);

			BigDecimal multipliedValue = value1.multiply(value2);
			// System.out.println("Multiplied spotrate value: " + multipliedValue);

			Currency ccyNameCode = Currency.getInstance(outputCcyCode);
			int precision = ccyNameCode.getDefaultFractionDigits();
			RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_EVEN;

			BigDecimal roundOffValue = null;
			// NumberFormatting.CurrencyRoundOffValue(multipliedValue);//Dont
			roundOffValue = multipliedValue.setScale(precision, DEFAULT_ROUNDING);
			// System.out.println(">>>" + roundOffValue);

			respAmount = String.valueOf(roundOffValue);

		} catch (Exception e) {
			System.out.println("Roundoff amount exception " + e.getMessage());
			e.printStackTrace();
		}
		// System.out.println("ReturnRegAmount: " + respAmount);
		return respAmount;
	}

//	/**
//	 * 05-B
//	 * <p>
//	 * Param1 : INR <br>
//	 * Param2 : 12356489.4564565 <br>
//	 * Param3 : 65.325 <br>
//	 * Output : 807187673.74
//	 * </p>
//	 * 
//	 * @param outputCcyCode   {@code always 'USD' }{@link String }
//	 * @param regfrmtAmount   {@code allows '12365.45' }{@link String }
//	 * @param regfrmtSpotRate {@code allows '72.456' }{@link String }
//	 * @return {@code allows '895951.05' }{@link String }
//	 */
//	public static String getEquivalentFCYAmount(String outputCcyCode, String regfrmtAmount, String regfrmtSpotRate) {
//
//		String respAmount = "";
//
//		try {
//			BigDecimal value1 = new BigDecimal(regfrmtAmount);
//			BigDecimal value2 = new BigDecimal(regfrmtSpotRate);
//
//			BigDecimal multipliedValue = value1.multiply(value2);
//			System.out.println("Multiplied by spotrate value: " + multipliedValue);
//
//			Currency ccyNameCode = Currency.getInstance(outputCcyCode);
//			int precision = ccyNameCode.getDefaultFractionDigits();
//			RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_EVEN;
//
//			BigDecimal roundOffValue = null;
//			// NumberFormatting.CurrencyRoundOffValue(multipliedValue);//Dont
//			roundOffValue = multipliedValue.setScale(precision, DEFAULT_ROUNDING);
//			// System.out.println(">>>" + roundOffValue);
//
//			respAmount = String.valueOf(roundOffValue);
//
//		} catch (Exception e) {
//			System.out.println("Roundoff amount exception " + e.getMessage());
//			e.printStackTrace();
//		}
//		// System.out.println("ReturnAmount: " + respAmount);
//		return respAmount;
//	}

	/**
	 * 05-B
	 * <p>
	 * Param1 : INR <br>
	 * Param2 : 12356489.4564565 <br>
	 * Param3 : 65.325 <br>
	 * Output : 807187673.74
	 * </p>
	 * 
	 * @param outputCcyCode      {@code always 'USD' }{@link String }
	 * @param regfrmtAmountInr   {@code allows '12365.45' }{@link String }
	 * @param regfrmtFcySpotRate {@code allows '72.456' }{@link String }
	 * @return {@code allows '895951.05' }{@link String }
	 */
	public static String getEqualFCYAmount(String outputCcyCode, String regfrmtAmountInr, String regfrmtFcySpotRate) {

		String respAmount = "";

		try {
			BigDecimal value1 = new BigDecimal(regfrmtAmountInr);
			BigDecimal value2 = new BigDecimal(regfrmtFcySpotRate);

			// BigDecimal dividedValue = value1.divide(value2);// Don't use
			// java.lang.ArithmeticException: Non-terminating decimal expansion; no exact
			// representable decimal result.

			Currency ccyNameCode = Currency.getInstance(outputCcyCode);
			int precision = ccyNameCode.getDefaultFractionDigits();
			RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_EVEN;

			BigDecimal dividedValue = value1.divide(value2, precision, DEFAULT_ROUNDING);
			System.out.println("DividedValue by spotrate value: " + dividedValue);// With round off

			BigDecimal roundOffValue = null;
			roundOffValue = dividedValue.setScale(precision, DEFAULT_ROUNDING);
			// System.out.println(">>>" + roundOffValue);

			respAmount = String.valueOf(roundOffValue);

		} catch (Exception e) {
			System.out.println("Roundoff amount exception " + e.getMessage());
			e.printStackTrace();
		}
		// System.out.println("ReturnAmount: " + respAmount);
		return respAmount;
	}

	/**
	 * Not used in Kotak
	 * 
	 * @param country
	 * @param currency
	 * @param regfrmtAmount
	 */
	public static void ccy(String country, String currency, String regfrmtAmount) {

		BigDecimal amount = new BigDecimal(19319.123456);

		/* Format amount in US format which is the default */
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		System.out.println("US: " + defaultFormat.format(amount));

		/* Format amount in French Currency format */
		Locale france = new Locale("fr", "FR");
		NumberFormat franceFormat = NumberFormat.getCurrencyInstance(france);
		System.out.println("France: " + franceFormat.format(amount));

		/* Format amount in Great Britain Currency format */
		Locale britain = new Locale("en", "GB");
		NumberFormat britainFormat = NumberFormat.getCurrencyInstance(britain);
		System.out.println("UK: " + britainFormat.format(amount));

		/* Format amount in German Currency format */
		Locale german = new Locale("de", "DE");
		NumberFormat germanFormat = NumberFormat.getCurrencyInstance(german);
		System.out.println("German: " + germanFormat.format(amount));

		/* Format amount in Indian Currency format */
		Locale indian = new Locale("en", "IN");
		NumberFormat indianFormat = NumberFormat.getCurrencyInstance(indian);
		System.out.println("Indian: " + indianFormat.format(amount));
	}

	/**
	 * 04-A
	 * 
	 * @since 25-Jan-2019, 02-MAR-2019
	 * @version v.1.0
	 * 
	 * @param currency {@code allows }{@link String}
	 * @param mbe      {@code allows }{@link String}
	 * @return {@code returns }{@link String}
	 */
	public static String getFcySpotRate(String currency, String mbe) {

		String spotRate = "";

		ResultSet res = null;
		Connection conn = null;
		PreparedStatement ps = null;

		String spotRateQuery = "SELECT SPOTRATE FROM SPOTRATE WHERE CURRENCY = ? AND TRIM(BRANCH) = '0001'";
		System.out.println("SpotRateQuery: " + spotRateQuery + "; Param[" + currency + ", 0001" + "]");

		try {
			conn = DatabaseUtility.getTizoneConnection();
			ps = conn.prepareStatement(spotRateQuery);
			ps.setString(1, currency);
			res = ps.executeQuery();

			while (res.next()) {
				spotRate = res.getString("SPOTRATE");
			}
		} catch (Exception e) {
			System.out.println("SpotRateQuery: " + spotRateQuery + "; Param[" + currency + ", 0001" + "]");
			System.out.println("Spotrate fetch exceptions..! " + e.getMessage());
			e.printStackTrace();

		} finally {
			DatabaseUtility.surrenderConnection(conn, ps, res);
		}
		// System.out.println("SpotRate for FCY[" + currency + "]: " + spotRate);
		return spotRate;
	}

	/**
	 * 04-B
	 * 
	 * @since 01-Feb-2019, 02-MAR-2019
	 * 
	 * @version v.1.0
	 * 
	 * @param currency {@code allows }{@link String}
	 * @param mbe      {@code allows }{@link String}
	 * @return {@code allows }{@link String}
	 */
	public static String getFcyFxRate(String currency, String mbe) {

		String buyRate = "";

		ResultSet res = null;
		Connection conn = null;
		PreparedStatement ps = null;

		String fcyFxRateQuery = "SELECT CODE53, CURREN49, BUYEXC03, SELLEX99 FROM FXRATE86 WHERE CURREN49 = ? AND CODE53 = 'RVRTCD' AND TRIM(BRANCH) = '0001' ";
		System.out.println("FcyFxBuyRateQuery : " + fcyFxRateQuery + "; Param[" + currency + ", 0001" + "]");

		try {
			conn = DatabaseUtility.getTizoneConnection();
			ps = conn.prepareStatement(fcyFxRateQuery);
			ps.setString(1, currency);
			res = ps.executeQuery();

			while (res.next()) {
				buyRate = res.getString("BUYEXC03");
				// sellRate = aResultset.getInt("SELLEX99");
			}

		} catch (Exception e) {
			System.out.println("FcyFxBuyRateQuery : " + fcyFxRateQuery + "; Param[" + currency + ", 0001" + "]");
			System.out.println("Exception while" + e.getMessage());
			e.printStackTrace();

		} finally {
			DatabaseUtility.surrenderConnection(conn, ps, res);
		}
		// System.out.println("FXRate for FCY[" + currency + "]: " + buyRate);
		return buyRate;
	}

	public static String getRemoveDecimal(String currency, String amount) {
		// Ram
		String result = "";
		BigDecimal repayValue2 = new BigDecimal(amount);// 100.265
		BigDecimal repayValue = repayValue2.setScale(0, BigDecimal.ROUND_DOWN);
		result = String.valueOf(amount);

		System.out.println(result);
		return result;
	}

}
