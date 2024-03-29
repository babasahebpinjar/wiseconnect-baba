package com.shorewise.wiseconnect.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

/**
 * @since 2019-OCT-29, 2016-SEP-22
 * @version 4.2.1
 * @author <code>Prasath Ravichandran</code>
 * 
 */
public class DateTimeUtil {

	private final static Logger logger = Logger.getLogger(DateTimeUtil.class.getName());

	/***********************************************************************/
	// G Era designation Text AD
	// y Year Year 1996; 96
	// M Month in year Month July; Jul; 07
	// w Week in year Number 27
	// W Week in month Number 2
	// D Day in year Number 189
	// d Day in month Number 10
	// F Day of week in month Number 2
	// E Day in week Text Tuesday; Tue
	// a Am/pm marker Text PM
	// H Hour in day (0-23) Number 0
	// k Hour in day (1-24) Number 24
	// K Hour in am/pm (0-11) Number 0
	// h Hour in am/pm (1-12) Number 12
	// m Minute in hour Number 30
	// s Second in minute Number 55
	// S Millisecond Number 978
	// z Time zone General time zone Pacific Standard Time; PST; GMT-08:00
	// Z Time zone RFC 822 time zone -0800
	// X Time zone ISO 8601 time zone -08; -0800; -08:00
	/***********************************************************************/

	// Date and Time Pattern Result
	// "yyyy.MM.dd G 'at' HH:mm:ss z" 2001.07.04 AD at 12:08:56 PDT
	// "EEE, MMM d, ''yy" Wed, Jul 4, '01
	// "h:mm a" 12:08 PM
	// "hh 'o''clock' a, zzzz" 12 o'clock PM, Pacific Daylight Time
	// "K:mm a, z" 0:08 PM, PDT
	// "yyyyy.MMMMM.dd GGG hh:mm aaa" 02001.July.04 AD 12:08 PM
	// "EEE, d MMM yyyy HH:mm:ss Z" Wed, 4 Jul 2001 12:08:56 -0700
	// "yyMMddHHmmssZ" 010704120856-0700
	// "yyyy-MM-dd'T'HH:mm:ss.SSSZ" 2001-07-04T12:08:56.235-0700
	// "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" 2001-07-04T12:08:56.235-07:00
	// "YYYY-'W'ww-u" 2001-W27-3

	public static void main(String[] args) throws Exception {

		// Date tiValueDate1 = DateTimeUtil.getTISystemValueDate();
		// logger.debug("ValueDate : " + tiValueDate1); // 2017-02-17
		//
		// Date limitNodeExpiryDate2 =
		// DateTimeUtil.getDateByStringDateInFormat("2017-02-17", "yyyy-MM-dd");
		// logger.debug("Product : " + limitNodeExpiryDate2);
		//
		// logger.debug(tiValueDate1.compareTo(limitNodeExpiryDate2));
		//
		// if (tiValueDate1.compareTo(limitNodeExpiryDate2) <= 0) {
		// logger.debug("Loop in");
		// } else {
		// logger.debug("Loop out");
		// }

		// String test = getStringLocalDateInFormat("dd-MMM-yy");
		// logger.debug(test);

		//
		// String datetime = "";
		// datetime = getDateAsEndSystemFormat();
		// logger.info("datetime >>-->>" + datetime + "<<--<<");
		//
		// // Date date = null;
		// // date =
		// // logger.info("date >>-->>" + date + "<<--<<");
		//
		// // Timestamp timestamp = null;
		// // timestamp = GetCurrentTimeStamp();
		// // logger.info("timestamp >>-->>" + timestamp + "<<--<<");
		//
		// // getDateFromTimestamp("01/21/2016 14:56:29.045");
		// // yyyy-MM-dd HH:mm:ss.S
		//
		// // logger.debug(getXmlGregorianDate("2016-01-21
		// 14:56:29.045"));
		//
		// date();
		//
		// logger.debug(getLocalTime());
		// getStringLocalDateInFormat("yyyymmddHHmm");

		// logger.debug(getTISystemDate());

		// System.out.println(getStringLocalDate(new Date(), "yyyy-MM-dd"));

		// System.out.println(dateStrformatChange("20170404", "yyyymmdd",
		// "yyyy-mm-dd"));

		// System.out.println(getStringDate("20170915235953", "yyyyMMddHHmmss",
		// "yyyy-MM-dd"));
		// System.out.println(getStringTimestamp("20170915235953",
		// "yyyyMMddHHmmss", "hh:mm:ss a"));

		// System.out.println(getDateTimeChangeFormat("2018-05-18",
		// "yyyy-MM-dd", "dd-MMM-yy"));

		// System.out.println(getDateTimeChangeFormat("001118",
		// "yyMMdd", "yyyyMMdd"));

		// String inp = "20-JAN-18 08.58.29.736 AM";
		// String covDateTime = DateTimeUtil.getStringDate(inp, "dd-MMM-yy
		// hh.mm.ss.SSS a", "dd-MMM-yy hh.mm.ss.SSS a");
		// System.out.println(covDateTime);

		// System.out.println("ASAP : " +
		// getSqlDateByStringDateInFormat("9102017", "dMMyyyy"));

		// System.out.println(getCurrentTimeStamp2());

//		Date date = new Date();
//		long t = date.getTime();
//		java.sql.Date sqlDate = new java.sql.Date(t);
//		System.out.println(sqlDate);
//
//		long time = System.currentTimeMillis();
//		// java.sql.Date date123 = new java.sql.Date(time);
//		java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
//		System.out.println("date123 " + timestamp);

		// System.out.println(getH24Time());

		// System.out.println(getStringLocalDate(new Date()));

//		Date date = null;
//		System.out.println(getStringLocalDate(date));

//		Calendar cal = Calendar.getInstance();
//		LocalDate myObj = LocalDate.now();
//		System.out.println(myObj);
//		System.out.println("Julian Date:" + cal.get(Calendar.DAY_OF_YEAR));

//		String inputStr = "2007-11-11 12:13:14";
//		inputStr = "2007-11-11 00:00:00";
////		inputStr = "2007-11-11 00:00";
//		inputStr = "2007-11-11";
////		inputStr = "";
////		inputStr = null;
//		System.out.println(getConvToTimeStamp(inputStr));

//		XMLGregorianCalendar date = null;
//		// date = "20/12/1990";
//		System.out.println("DATE: " + getSqlDateByXMLGregorianCalendar(date));

		String dateStr = "2019-03-21";
//		dateStr = "";
//		dateStr = null;

		System.out.println(getSqlDateByStringDate(dateStr, "yyyy-MM-dd"));

	}

	/**
	 * 
	 * @param dateStr   {@code allows } {@link String}
	 * @param inpformat {@code allows 'yyyymmdd' } {@link String}
	 * @param outFormat {@code allows 'yyyy-mm-dd' } {@link String}
	 * @return {@code returns 'yyyy-mm-dd'} {@link String}
	 */
	public static String dateStrformatChange(String dateStr, String inpformat, String outFormat) {

		String result = "";
		try {
			DateFormat df = new SimpleDateFormat(inpformat);
			Date startDate = df.parse(dateStr);
			DateFormat df2 = new SimpleDateFormat(outFormat);
			String startDateString2 = df2.format(startDate);
			// System.out.println("OutputFormat : " + startDateString2);
			result = startDateString2;

		} catch (ParseException e) {
			logger.error("DateString conversion error!! " + e.getMessage());
			e.printStackTrace();
			result = dateStr;
		}
		return result;
	}

	/************** Date as Date ****************/
	/**
	 * Get local date
	 * 
	 * @return {@link Date} 'Fri Sep 16 15:09:53 IST 2016'
	 */
	public static Date getLocalDate() {
		return new Date();
	}

	/**
	 * Get local date and time
	 * 
	 * @return {@link Date}
	 */
	public static Date getLocalTime() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		return cal.getTime();
	}

	/**
	 * 
	 * @return
	 */
	public static String getCurrentDate() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		java.util.Date date = new java.util.Date();

		return dateFormat.format(date);
	}

	/**
	 * Get local date and time in format 'yyyyMMddhhmmss'
	 * 
	 * @return {@link String}
	 */
	public static String getFormatLocalDateTime() {
		Date date = new Date();
		return DateTimeUtil.getStringDateByDateInFormat(date, "yyMMddHHmmssS");
	}

	/**
	 * Get local date and time in yyMMdd
	 * 
	 * @return {@link String} >>-->>160921<<--<<
	 */
	public static String getLocalTime(String format) {

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date());
	}

	/**
	 * Get local date and time in format 'yyyyMMddhhmmss'
	 * 
	 * @return {@link String}
	 */
	public static String getCibilDateTime() {
		Date date = new Date();
		return DateTimeUtil.getStringDateByDateInFormat(date, "yyyyMMddHHmmssS");
	}

	/**
	 * 
	 * @return
	 */
	public static String getTimeNow() {

		// hh - 12 Hours
		// HH - 24 Hours
		// TO_TIMESTAMP('03-JUN-2015 05.09.40.01 PM', 'DD-MON-RR HH.MI.SS.FF
		// AM'))
		SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
		Date now = new Date();
		String strDate = sdf.format(now);

		return strDate;
	}

	/**
	 * Get Date by date string
	 * 
	 * @param dateStr    {@code allows } {@link String}
	 * @param dateFormat {@code allows } {@link String}
	 * 
	 * @return {@link Date}
	 */
	public static Date getDateByStringDateInFormat(String dateStr, String dateFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			logger.error(e.getMessage(), e);
		}
		// logger.debug(date);
		return date;
	}

	// String startDateString = "31-10-2015";
	// DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	// Date startDate = df.parse(startDateString);
	// logger.debug(startDate);

	/********************* Date as String Format *************************/

	/**
	 * @param
	 * @return {@link String} '22092016'
	 */

	/**
	 * @param date {@code allows }{@link Date}
	 * @return {@link String} '2017-01-15'
	 */
	public static String getStringLocalDate(Date date) {

		String result = "";
		// Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		result = formatter.format(date);

		return result;
	}

	/**
	 * 
	 * @param date   {@code allows }{@link Date}
	 * @param format {@code allows }{@link String} 'yyyyMMdd'
	 * @return {@link String} '20170115'
	 */
	public static String getStringLocalDate(Date date, String format) {

		String result = "";
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(format);
			result = formatter.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @param {@link String} 'DDMMYYYY'
	 * @return {@link String} '22092016'
	 */
	public static String getStringYear(String outformat) {

		String result = "";
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat(outformat);
		result = formatter.format(today);
		return result;
	}

	/**
	 * @param {@link String} '22092016'
	 * @return {@link String} '22092016'
	 */
	public static String getStringLocalDate(String outformat) {

		String result = "";
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat(outformat);
		result = formatter.format(today);
		return result;
	}

	/**
	 * @param
	 * @return {@link String} '22092016'
	 */
	public static String getStringLocalDate() {

		String result = "";
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		result = formatter.format(today);
		return result;
	}

	/**
	 * 
	 * @param dateformat {@code allows} {@link String} "yyyy/MM/dd"
	 * @return {@link String}>>--->> 2016/09/22 <<--<<
	 */
	public static String getStringLocalDateInFormat(String dateformat) {

		String result = "";
		DateFormat dateFormat = new SimpleDateFormat(dateformat);
		java.util.Date date = new java.util.Date();
		result = dateFormat.format(date);
		return result;
	}

	/**
	 * @param stringdateformat {@code allows } {@link String}
	 * @return {@code allows } {@link String}
	 */
	public static String getStringDateInFormatFromCalendar(String stringdateformat) {

		String result = "";
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat(stringdateformat);
		result = formatter.format(today);
		return result;
	}

	/**
	 * Get local date and time in yyMMdd
	 * 
	 * @return {@link String} >>-->>160921<<--<<
	 */
	public static String getLocalTimeInSwiftFormat() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		return sdf.format(new Date());
	}

	/**
	 * For StaticData
	 * 
	 * @param {@code allows } {@link String} '01/21/2016 14:56:29.045'
	 * @return {@link String} '2016-01-21'
	 * @return {@link String} '14:56:29 PM'
	 */
	public static String getStringDate(String timesatmp, String inFormat, String outFormat) {

		String dateOnly = "";
		// String inFormat = "yyyyMMddHHmmss";
		DateFormat df = new SimpleDateFormat(inFormat);

		Date dt = null;
		try {
			dt = df.parse(timesatmp);
			// outTimestempFormat = "yyyy-MM-dd"
			DateFormat dfmt = new SimpleDateFormat(outFormat);
			dateOnly = dfmt.format(dt);

		} catch (ParseException e) {
			logger.error("Formatter exceptions " + e.getMessage());
			e.printStackTrace();
		}

		// logger.debug(dateOnly);
		return dateOnly;
	}

	/**
	 * For StaticData
	 * 
	 * @param {@code allows } {@link String} '01/21/2016 14:56:29.045'
	 * @return {@link String} '2016-01-21'
	 * @return {@link String} '14:56:29 PM'
	 */
	public static String getStringTimestamp(String timesatmp, String inFormat, String outFormat) {

		String timeOnly = "";
		// String inFormat = "yyyyMMddHHmmss";
		DateFormat df = new SimpleDateFormat(inFormat);

		Date dt = null;
		try {
			dt = df.parse(timesatmp);
			// outTimestempFormat = "HH:mm:ss a";
			DateFormat Outdf = new SimpleDateFormat(outFormat);
			timeOnly = Outdf.format(dt);

		} catch (ParseException e) {
			logger.error("Formatter exceptions " + e.getMessage());
			e.printStackTrace();
		}
		// logger.debug("TimestampOUT" + timeOnly);
		return timeOnly;
	}

	/**
	 * For StaticData
	 * 
	 * @param {@code allows } {@link String} '01/21/2016 14:56:29.045'
	 * @return {@link String} '2016-01-21'
	 * @return {@link String} '14:56:29 PM'
	 */
	public static String getStringDateFromTimestamp(String timesatmp) {

		String dateOnly = "";
		String fmt = "MM/dd/yyyy HH:mm:ss.SSS";
		DateFormat df = new SimpleDateFormat(fmt);

		Date dt = null;
		try {
			dt = df.parse(timesatmp);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		DateFormat tdf = new SimpleDateFormat("HH:mm:ss a");
		DateFormat dfmt = new SimpleDateFormat("yyyy-MM-dd");
		String timeOnly = tdf.format(dt);

		dateOnly = dfmt.format(dt);

		logger.debug(dateOnly + "\t" + timeOnly);
		return dateOnly;
	}

	/**
	 * Get date string in expected format
	 * 
	 * @param date       {@code allows } {@link Date}
	 * @param dateFormat {@code allows } {@link String} 'yyyy-MM-dd'
	 * @return {@link String} 'yyyy-MM-dd'
	 */
	public static String getStringDateByDateInFormat(Date date, String dateFormat) {
		SimpleDateFormat sdf = null;
		String result = "";
		if (ValidationsUtil.isValidObject(date)) {
			try {
				sdf = new SimpleDateFormat(dateFormat);
				result = sdf.format(date);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
		return result;
	}

	/**
	 * 
	 * @return
	 */
	public static String getCurrentTimeStamp() {

		// hh - 12 Hours
		// HH - 24 Hours
		// TO_TIMESTAMP('03-JUN-2015 05.09.40.01 PM', 'DD-MON-RR HH.MI.SS.FF
		// AM'))
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh.mm.ss.FF a");
		Date now = new Date();
		String strDate = sdf.format(now);

		return strDate;
	}

	/**
	 * 
	 * @return
	 */
	public static String getCurrentTimeStamp2() {

		// hh - 12 Hours
		// HH - 24 Hours
		// TO_TIMESTAMP('03-JUN-2015 05.09.40.01 PM', 'DD-MON-RR HH.MI.SS.FF
		// AM'))
		SimpleDateFormat sdf = new SimpleDateFormat("HHmmssMs");
		Date now = new Date();
		String strDate = sdf.format(now);

		return strDate;
	}

	public static String getCurrentTimeStamp3() {

		int unique_id = (int) ((new Date().getTime() / 1000L) % Integer.MAX_VALUE);

		String str = String.valueOf(unique_id);
		return str;
	}

	/**
	 * 2019-SEP-23
	 * 
	 * @param inputStr {@code allows }{@link String yyyy-mm-dd hh:mm:ss[.fffffffff]}
	 * @return Timestamp {@code returns }{@link Timestamp yyyy-mm-dd hh:mm:ss.f}
	 */
	public static Timestamp getConvToTimeStamp(String inputStr) {

		Timestamp timestampRes = null;
		// inputStr = "2007-11-11 12:13:14";
		try {
			if (inputStr != null && !inputStr.isEmpty()) {
				timestampRes = java.sql.Timestamp.valueOf(inputStr);
				// System.out.println(result);
			}
		} catch (Exception e) {
			logger.error("Exception " + e.getMessage());
			e.printStackTrace();
		}
		return timestampRes;
	}

	/**
	 * To convert XMLGregorianCalendar to string value
	 * <p>
	 * <code>
	 * Note: this function returns date as long in string format   
	 * </code>
	 * </p>
	 * 
	 * @param xmlGCDate {@link XMLGregorianCalendar}
	 * @return {@link String} 'yyyy-MM-dd'
	 */
	public static String getStringDateByXMLGregorianCalendar(XMLGregorianCalendar xmlGCDate) {
		String result = "";
		if (ValidationsUtil.isValidObject(xmlGCDate)) {
			Calendar calendar = xmlGCDate.toGregorianCalendar();
			Date date = calendar.getTime();
			result = date.getTime() + "";
		}
		return result;
	}

	/****************** Get Time as String Format ******************/

	/**
	 * 
	 * @return {@link String} >>--->> HHmmssS <<--<<
	 */
	public static String getStringLocalTime() {

		String result = new Date() + "";
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("HH.mm.ss.S");
		result = formatter.format(today);
		return result;
	}

	public static String getStringLocalTimeFi() {

		String result = new Date() + "";
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss.S");
		result = formatter.format(today);
		return result;
	}

	public static String getH24Time() {

		String result = "";
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss.S");
		result = formatter.format(today);
		return result;
	}

	/**
	 * 
	 * @param timeFormat "HH.mm.ss.S a Z"
	 * @return {@link String} >>--->> 13.29.37.969 PM +0530 <<--<<
	 */
	public static String getStringLocalTimeInFormat(String timeFormat) {

		String result = new Date() + "";
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat(timeFormat);
		result = formatter.format(today);
		return result;
	}

	/**
	 * 
	 * @return {@link String} 'GMT+05:30'
	 */
	public static String getStringTimeZoneGMT() {

		Calendar c = Calendar.getInstance();
		// logger.debug("current: " + c.getTime());
		TimeZone z = c.getTimeZone();
		int offset = z.getRawOffset();
		if (z.inDaylightTime(new Date())) {
			offset = offset + z.getDSTSavings();
		}
		int offsetHrs = offset / 1000 / 60 / 60;
		int offsetMins = offset / 1000 / 60 % 60;
		// logger.debug("offsetHrs: " + offsetHrs);
		// logger.debug("offsetMins: " + offsetMins);
		c.add(Calendar.HOUR_OF_DAY, (-offsetHrs));
		c.add(Calendar.MINUTE, (-offsetMins));
		// logger.debug("GMT Time: " + c.getTime());
		String formattedoffsetHrs = String.format("%02d", offsetHrs);
		// logger.debug("formatted " + formattedoffsetHrs);
		String time = "GMT+" + formattedoffsetHrs + ":" + offsetMins;
		// logger.debug(""+time);
		return time;
	}

	/****************** Get DateTime as String Format ******************/

	/**
	 * Get local date and time
	 * 
	 * @return {@link Date} 'Fri Sep 16 15:08:16 IST 2016'
	 */
	public static Date getDateLocalDateTime() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		return cal.getTime();
	}

	/**
	 * <code>Multiple format string date
	 * </code>
	 * 
	 * @return {@link String}
	 */
	public static String GetStringLocalDateTimeInFormat() {

		/*** ORACLE ****/
		// hh - 12 Hours
		// HH - 24 Hours
		// TO_TIMESTAMP('03-JUN-2015 05.09.40.01 PM', 'DD-MON-RR HH.MI.SS.FF
		// AM'))

		/*** JAVA ***/
		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh.mm.ss.FF
		// a"); // >>-->>21-Sep-2016 06.46.37.03 PM<<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH.mm.ss.FF
		// a"); // datetime >>-->>21-Sep-2016 18.45.14.03 PM<<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH.mm.ss.FFF
		// a"); // >>-->>21-Sep-2016 18.59.02.003 PM<<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("HH.mm.ss");
		// >>-->>19.02.49<<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("hh.mm.ss");
		// >>-->>07.04.12<<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss.FFF
		// a"); // >>-->>21-09-2016 18.53.05.003 PM<<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss.FFF
		// a Z "); // >>-->>21-09-2016 18.54.12.003 +0530 PM<<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy Z ");
		// >>-->>21-09-2016 +0530 <<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy a ");
		// >>-->>21-09-2016 PM <<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("HH.mm.ss.FF a ");
		// >>-->>18.56.47.03 PM <<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH.mm.ss.FFF
		// a"); // >>-->>21/09/2016 19.08.43.003 PM<<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss.FFF
		// a"); // >>-->>21.09.2016 19.09.32.003 PM<<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH/mm/ss/FFF
		// a"); // >>-->>21.09.2016 19/10/19/003 PM<<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.FFF
		// a"); // >>-->>21.09.2016 19:11:26.003 PM<<--<<

		// SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.S
		// a"); // >>-->>21.09.2016 19:16:54.688 PM<<--<<

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.SS a Z");
		// >>-->>21.09.2016 19:17:38.827 PM +0530<<--<<

		// logger.debug("Now Date time :" + new Date());
		// Now Date time :Wed Sep 21 18:57:51 IST 2016

		Date now = new Date();
		String strDate = sdf.format(now);
		return strDate;
	}

	/**************** Unix system EPOCH DateTime format ******************/

	/**
	 * Current time in unix epoch
	 * 
	 * @return {@link String} '1474017835'
	 */
	public static String getStringEpochLocalDateTime() {

		String epochTime = "";
		long unixTime = System.currentTimeMillis() / 1000L;
		epochTime = String.valueOf(unixTime);
		return epochTime;
	}

	/**
	 * 
	 * @param epochFormatTime {@code allows }{@link Long}
	 * @param dateTimeFormat  {@code allows }{@link String} 'yyyy/MM/dd HH:mm:ss.sss
	 *                        a Z'
	 * @return {@link String} 'yyyy/MM/dd HH:mm:ss.sss a Z'
	 */
	public static String getStringDateTimeFromEpoch(long epochFormatTime, String dateTimeFormat) {

		String dateTime = new java.text.SimpleDateFormat(dateTimeFormat)
				.format(new java.util.Date(epochFormatTime * 1000));
		return dateTime;
	}

	/****************** KOTAK MAHINDRAN BANK **********************/

	/**
	 * Finacle treasury
	 * 
	 * @return {@link String} '2016-01-23'
	 */
	public static String getCurrentDateAsTreasury() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = new java.util.Date();

		return dateFormat.format(date);
	}

	/**
	 * Date as end system format
	 * 
	 * @return {@link String} >>-->>2016-09-21T19:26:27.197<<--<<
	 */
	public static String getDateAsEndSystemFormat() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
		String date = sdf.format(new Date());
		// logger.debug(date);
		return date;
	}

	/**
	 * Date as end system format
	 * 
	 * @return {@link String} >>-->>2016-09-21T19:26:27.197<<--<<
	 */
	public static String getFinSysTimestamp() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
		String date = sdf.format(new Date());
		// logger.debug(date);
		return date;
	}

	/***************** Get Timestamp *********************/

	/**
	 * 
	 * @return {@link Timestamp} 2016-09-16 14:44:37.638
	 */
	public static Timestamp GetLocalTimeStamp() {

		java.util.Date date = new java.util.Date();
		Timestamp ts = new Timestamp(date.getTime());
		return ts;
	}

	/**
	 * 
	 * @return {@link Timestamp} >>--->> 2016-09-22 16:36:54.954 <<--<<
	 */
	public static Timestamp getTimestamp() {

		Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
		// logger.debug(timeStamp);
		return timeStamp;
	}

	/**
	 * Get local date and time in SQL Timestamp type
	 * 
	 * @param date       {@code allows } {@link String}
	 * @param dateFormat {@code allows } {@link String}
	 * @return {@link Timestamp}
	 */
	public static Timestamp getTimeStampByDateAndFormat(String dateStr, String dateFormat) {

		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date date = null;
		Timestamp sqlTimestamp = null;
		try {
			date = sdf.parse(dateStr);
			long t = date.getTime();
			sqlTimestamp = new Timestamp(t);
		} catch (ParseException e) {
			logger.error("Exception! Check the logs for details", e);
		}
		return sqlTimestamp;
	}

	/**************** Convert date time ******************/

	/**
	 * Get date and time to convert current format to new format
	 * 
	 * @param date       {@code allows} {@link String}
	 * @param currFrmt   {@code allows} {@link String}
	 * @param ChngeFormt {@code allows} {@link String}
	 * @return {@link String}
	 */
	public static String getDateTimeChangeFormat(String date, String currFrmt, String ChngeFormt) {

		String frmtChngeDte = "";
		SimpleDateFormat dateCurrFormat = new SimpleDateFormat(currFrmt);
		SimpleDateFormat dateChngeFormat = new SimpleDateFormat(ChngeFormt);
		try {
			Date valueDate = dateCurrFormat.parse(date);
			frmtChngeDte = dateChngeFormat.format(valueDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return frmtChngeDte;
	}

	/**
	 * Get date string in expected format
	 * 
	 * @param date           {@code allows} {@link String}
	 * @param dateFormat     {@code allows} {@link String}
	 * @param expectedFormat {@code allows} {@link String}
	 * @return {@link String}
	 */
	public static String getStringDateInFormat(String date, String dateFormat, String expectedFormat) {
		SimpleDateFormat sdf = null;
		String result = "";
		if (ValidationsUtil.isValidString(date)) {
			try {
				sdf = new SimpleDateFormat(dateFormat);
				Date aDate = sdf.parse(date);
				sdf = new SimpleDateFormat(expectedFormat);
				result = sdf.format(aDate);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
		return result;
	}

	/**
	 * Get date string in expected format
	 * 
	 * @param date           {@code allows} {@link String}
	 * @param dateFormat     {@code allows} {@link String}
	 * @param expectedFormat {@code allows} {@link String}
	 * @return {@link String}
	 */
	public static String getStringDateForExtractionFileFormat(String date, String dateFormat, String expectedFormat) {
		SimpleDateFormat sdf = null;
		String result = "";
		if (ValidationsUtil.isValidString(date)) {
			try {
				String aResult = "";
				sdf = new SimpleDateFormat(dateFormat);
				Date aDate = sdf.parse(date);
				sdf = new SimpleDateFormat(expectedFormat);
				aResult = sdf.format(aDate);
				Date bDate = new Date();
				String bResult = getStringDateByDateInFormat(bDate, "HHmm");
				result = aResult.concat(bResult);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
		return result;
	}

	/***************** XMLGregorianCalendar *********************/

	/**
	 * To convert Local XMLGregorianCalendar to string value
	 * <p>
	 * <code>
	 * Note: this function returns date as long in string format   
	 * </code>
	 * </p>
	 * 
	 * @param xmlGCDate {@link XMLGregorianCalendar}
	 * @return {@link String}
	 * @throws Exception
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	public static String getXmlGregorianCalendarLocalTimeToString() throws Exception {

		String result = "";
		Calendar calendar = getLocalDateInXMLGregorian().toGregorianCalendar();
		Date date = calendar.getTime();
		result = date.getTime() + "";
		return result;
	}

	/**
	 * Get local date in XML Gregorian
	 * 
	 * @return {@link Date}
	 * @throws Exception
	 */
	public static XMLGregorianCalendar getLocalDateInXMLGregorian() throws Exception {
		XMLGregorianCalendar result = null;

		try {
			Date dateTime = DateTimeUtil.getLocalDate();
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateTime);
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int date = cal.get(Calendar.DATE);
			int hour = cal.get(Calendar.HOUR);
			int minute = cal.get(Calendar.MINUTE);
			int second = cal.get(Calendar.SECOND);

			int millisecond = cal.get(Calendar.MILLISECOND);

			result = DatatypeFactory.newInstance().newXMLGregorianCalendar(year, month + 1, date, hour, minute, second,
					millisecond, DatatypeConstants.FIELD_UNDEFINED);

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new Exception(e.getMessage());
		}

		return result;
	}

	/**
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar dateToXMLGregorianCalendarDate(Date date)
			throws ParseException, DatatypeConfigurationException {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		XMLGregorianCalendar xmlGC = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
		return xmlGC;
	}

	/**
	 * Get local date in XML Gregorian
	 * 
	 * @param dateToBeConvert {@code allows }{@link Date}
	 * @return {@link XMLGregorianCalendar } '2016-09-22'
	 * @throws Exception
	 */
	public static XMLGregorianCalendar getDateInXMLGregorianByDate(Date dateToBeConvert) throws Exception {

		XMLGregorianCalendar result = null;
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateToBeConvert);
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int date = cal.get(Calendar.DATE);

			result = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(year, month + 1, date,
					DatatypeConstants.FIELD_UNDEFINED);

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new Exception(e.getMessage());
		}

		return result;
	}

	public static XMLGregorianCalendar getXmlGregorianDate(String dateString) {

		if (dateString == null || dateString.isEmpty()) {
			return null;
		}
		DateFormat formatter = null;
		Date date = null;
		DatatypeFactory df = null;
		GregorianCalendar gc = new GregorianCalendar();

		if (dateString.charAt(4) == '-') {
			if (dateString.length() > 10) {
				formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
			}
			formatter = new SimpleDateFormat("yyyy-MM-dd");
		} else if (dateString.charAt(4) == '|') {
			formatter = new SimpleDateFormat("yyyy|MMM|E");
		} else if (dateString.charAt(4) == '/') {
			formatter = new SimpleDateFormat("yyyy/MM/dd");
		} else if (dateString.charAt(2) == '/') {
			formatter = new SimpleDateFormat("dd/MM/yyyy");
		} else if (dateString.charAt(2) == '/') {
			formatter = new SimpleDateFormat("MM/dd/yyyy");
		} else if (dateString.charAt(2) == '-') {
			formatter = new SimpleDateFormat("dd-MMM-yy");
		} else {
			formatter = new SimpleDateFormat("yyyyMMdd");
		}

		// gc.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
		// gc.setTime(DatatypeConstants.FIELD_UNDEFINED,
		// DatatypeConstants.FIELD_UNDEFINED,
		// DatatypeConstants.FIELD_UNDEFINED);
		try {
			date = (Date) formatter.parse(dateString);

			df = DatatypeFactory.newInstance();

			gc.setTimeInMillis(date.getTime());

			// gc.setTimeZone(new TimeZone(DatatypeConstants.FIELD_UNDEFINED));
			// gc.setTimezone();

		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// logger.debug(df.newXMLGregorianCalendar(gc));

		// XMLGregorianCalendar gc =
		// DatatypeFactory.newInstance().newXMLGregorianCalendar( c );
		// gc.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
		// gc.setTime(DatatypeConstants.FIELD_UNDEFINED,
		// DatatypeConstants.FIELD_UNDEFINED,
		// DatatypeConstants.FIELD_UNDEFINED);
		XMLGregorianCalendar resultGC = df.newXMLGregorianCalendar(gc);
		// resultGC.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
		resultGC.setTime(DatatypeConstants.FIELD_UNDEFINED, DatatypeConstants.FIELD_UNDEFINED,
				DatatypeConstants.FIELD_UNDEFINED);
		return resultGC;
	}

	/**
	 * 
	 * @param date {@code allows }{@link Date}
	 * @return {@link XMLGregorianCalendar}
	 */
	public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTime(date);
		XMLGregorianCalendar xmlCalendar = null;
		try {
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
		} catch (DatatypeConfigurationException ex) {
			// Logger.getLogger(StringReplace.class.getName()).log(Level.SEVERE,
			// null, ex);
		}
		return xmlCalendar;
	}

	/**
	 * <code>Get data in XMLGregorian Calendar</code>
	 * 
	 * @param dateString   {@code allows } {@link String} "20-09-2016 02.23.65"
	 * @param dateInFormat {@code allows } {@link String} "dd-MM-yyyy hh.mm.ss"
	 * @return {@link XMLGragorianCalendar} >>--->> 2016-09-20 <<--<<
	 * @throws Exception
	 */
	public static XMLGregorianCalendar getDateInXMLGregorianByStringDateInFormat(String dateString, String dateInFormat)
			throws Exception {
		XMLGregorianCalendar result = null;

		try {
			Date dateToBeConvert = getDateByStringDateInFormat(dateString, dateInFormat);
			result = getDateInXMLGregorianByDate(dateToBeConvert);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new Exception(e.getMessage());
		}

		return result;
	}

	/**
	 * Get local date and time in XML Gregorian
	 * 
	 * @param {@code allows}{@link Date}
	 * @return {@link Date} '2016-09-22T05:05:12'
	 * @throws Exception
	 */
	public static XMLGregorianCalendar getDateTimeInXMLGregorianByDate(Date dateToBeConvert) throws Exception {

		XMLGregorianCalendar result = null;
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateToBeConvert);
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int date = cal.get(Calendar.DATE);
			int hour = cal.get(Calendar.HOUR);
			int minute = cal.get(Calendar.MINUTE);
			int second = cal.get(Calendar.SECOND);

			result = DatatypeFactory.newInstance().newXMLGregorianCalendar(year, month + 1, date, hour, minute, second,
					DatatypeConstants.FIELD_UNDEFINED, DatatypeConstants.FIELD_UNDEFINED);

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new Exception(e.getMessage());
		}

		return result;
	}

	/**
	 * @author Prasath Ravichandran.With milliseconds
	 * 
	 * @return {@link XMLGregorianCalendar} '2016-09-21T07:40:21.655'
	 * @throws Exception
	 */
	public static XMLGregorianCalendar getLocalDateTimemilliInXMLGregorian() throws Exception {

		XMLGregorianCalendar result = null;
		try {
			Date dateTime = getLocalDate();
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateTime);
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int date = cal.get(Calendar.DATE);
			int hour = cal.get(Calendar.HOUR); // 12 hours
			int minute = cal.get(Calendar.MINUTE);
			int second = cal.get(Calendar.SECOND);

			int millisecond = cal.get(Calendar.MILLISECOND);

			result = DatatypeFactory.newInstance().newXMLGregorianCalendar(year, month + 1, date, hour, minute, second,
					millisecond, DatatypeConstants.FIELD_UNDEFINED);

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new Exception(e.getMessage());
		}

		return result;
	}

	/**
	 * @author <code>Prasath Ravichandran</code>. Without milliseconds
	 * 
	 * @return {@link XMLGregorianCalendar} '2016-09-21T07:43:57'
	 * @throws Exception
	 */
	public static XMLGregorianCalendar getLocalDateTimeInXMLGregorian() throws Exception {
		XMLGregorianCalendar result = null;

		try {
			Date dateTime = getLocalDate();
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateTime);
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int date = cal.get(Calendar.DATE);
			int hour = cal.get(Calendar.HOUR);
			int minute = cal.get(Calendar.MINUTE);
			int second = cal.get(Calendar.SECOND);
			// int millisecond = cal.get(Calendar.MILLISECOND);

			result = DatatypeFactory.newInstance().newXMLGregorianCalendar(year, month + 1, date, hour, minute, second,
					DatatypeConstants.FIELD_UNDEFINED, DatatypeConstants.FIELD_UNDEFINED);

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new Exception(e.getMessage());
		}

		return result;
	}

	/**
	 * Get local date in XML Gregorian
	 * 
	 * @return {@link XMLGregorianCalendar} '2016-09-21T19:28:49.132'
	 */
	public static XMLGregorianCalendar getXMLGregorianCalendarAsEndSystemFormat() {
		XMLGregorianCalendar gDateFormatted2 = null;
		try {
			Calendar cal = Calendar.getInstance();

			gDateFormatted2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.HOUR_OF_DAY),
					cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND), cal.get(Calendar.MILLISECOND),
					DatatypeConstants.FIELD_UNDEFINED);

		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return gDateFormatted2;
	}

	/**
	 * To convert XMLGregorianCalendar to string value
	 * <p>
	 * <code>
	 * Note: this function returns date as long in string format   
	 * </code>
	 * </p>
	 * 
	 * @param xmlGCDate  {@code allows }{@link XMLGregorianCalendar}
	 * @param dateFormat {@code allows }{@link String}
	 * @return {@link String}
	 */
	public static String getXMLGregorianCalendarByStringInFormat(XMLGregorianCalendar xmlGCDate, String dateFormat) {
		String result = "";
		if (ValidationsUtil.isValidObject(xmlGCDate)) {
			Calendar calendar = xmlGCDate.toGregorianCalendar();
			Date date = calendar.getTime();
			result = getStringDateByDateInFormat(date, dateFormat);
		}
		return result;
	}

	/**
	 * To convert XMLGregorianCalendar to string value
	 * <p>
	 * <code>
	 * Note: this function returns date as long in string format   
	 * </code>
	 * </p>
	 * 
	 * @param xmlGCDate {@link XMLGregorianCalendar}
	 * @return {@link String}
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	public static String xmlGregorianCalendarToString(XMLGregorianCalendar xmlGCDate) {
		String result = "";
		if (ValidationsUtil.isValidObject(xmlGCDate)) {
			Calendar calendar = xmlGCDate.toGregorianCalendar();
			Date date = calendar.getTime();
			result = date.getTime() + "";
		}
		return result;
	}

	/**
	 * To convert XMLGregorianCalendar to string value
	 * <p>
	 * <code>
	 * Note: this function returns date as long in string format   
	 * </code>
	 * </p>
	 * 
	 * @param xmlGCDate {@link XMLGregorianCalendar}
	 * @return {@link String}
	 * @throws ParseException
	 * @throws DatatypeConfigurationException
	 */
	public static String xmlGregorianCalendarToStringWithFormat(XMLGregorianCalendar xmlGCDate, String dateFormat) {
		String result = "";
		if (ValidationsUtil.isValidObject(xmlGCDate)) {
			Calendar calendar = xmlGCDate.toGregorianCalendar();
			Date date = calendar.getTime();
			result = DateTimeUtil.getStringDateByDateInFormat(date, dateFormat);
		}
		return result;
	}

	/**
	 * To convert XMLGregorianCalendar to string value
	 * <p>
	 * <code>
	 * Note: this function returns date as long in string format   
	 * </code>
	 * </p>
	 * 
	 * @param xmlGCDate  {@code allows }{@link XMLGregorianCalendar}
	 * @param dateFormat {@code allows}{@link dateFormat}
	 * @return {@link String}
	 */
	public static String getStringDateByXMLGregorianCalendar(XMLGregorianCalendar xmlGCDate, String dateFormat) {
		String result = "";
		if (ValidationsUtil.isValidObject(xmlGCDate)) {
			Calendar calendar = xmlGCDate.toGregorianCalendar();
			Date date = calendar.getTime();
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			result = sdf.format(date);
		}
		return result;
	}

	/**************************** SQL DATE **********************************/

	/**
	 * Get local date and time in SQL Date
	 * 
	 * @return {@link java.sql.Date} >>--->> 2016-09-22 <<--<<
	 */
	public static java.sql.Date getSqlLocalDate() {

		Date date = new Date();
		long t = date.getTime();
		java.sql.Date sqlDate = new java.sql.Date(t);

		return sqlDate;
	}

	/**
	 * Get SQL Date by date string
	 * 
	 * @param date       {@code allows } {@link String} "2016-08-15"
	 * @param dateFormat {@code allows } {@link String} "yyyy-mm-dd"
	 * 
	 * @return {@link java.sql.Date} >>--->> 2016-09-22 <<--<<
	 */
	public static java.sql.Date getSqlDateByStringDate(String dateStr, String dateFormat) {

		java.sql.Date sqlDate = null;
		try {
			if (dateStr != null && !dateStr.isEmpty()) {
				SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
				Date date = sdf.parse(dateStr);
				long t = date.getTime();
				sqlDate = new java.sql.Date(t);
			} else {
				logger.info("InputDateString is null or empty");
			}
		} catch (ParseException e) {
			logger.error("Date parse exception " + e.getMessage());
			e.printStackTrace();
		}
		return sqlDate;
	}

	/**
	 * Get SQL Date by date string
	 * 
	 * @param date       {@code allows } {@link String} "2016-08-15"
	 * @param dateFormat {@code allows } {@link String} "yyyy-mm-dd"
	 * 
	 * @return {@link java.sql.Date} >>--->> 2016-09-22 <<--<<
	 */
	public static java.sql.Date getSqlDateByStringDateInFormat(String dateStr, String dateFormat) {

		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date date = null;
		java.sql.Date sqlDate = null;
		try {
			date = sdf.parse(dateStr);
			long t = date.getTime();
			sqlDate = new java.sql.Date(t);

		} catch (ParseException e) {
			logger.error("Date convert exception " + e.getMessage());
			e.printStackTrace();
		}
		return sqlDate;
	}

	/******************** SQL Timestamp ********************/

	/**
	 * Get local date and time in SQL Timestamp
	 * 
	 * @return {@link java.sql.Timestamp} >>--->> 2016-09-22 17:44:59.732 <<--<<
	 */
	public static Timestamp getSqlLocalDateTime() {
		Date date = new Date();
		long t = date.getTime();
		Timestamp sqlTimestamp = new Timestamp(t);
		return sqlTimestamp;
	}

	/**
	 * return {@link java.sql.Timestamp} '2016-09-22 16:09:21.504'
	 */
	public static java.sql.Timestamp getSqlLocalTimestamp() {

		Calendar calendar = Calendar.getInstance();
		java.util.Date now = calendar.getTime();
		java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());

		return currentTimestamp;
	}

	/**
	 * Get local date and time in SQL Timestamp type
	 * 
	 * @param date       {@code allows } {@link String}
	 * @param dateFormat {@code allows } {@link String}
	 * @return {@link java.sql.Timestamp} '2016-09-22 16:09:21.504'
	 */
	public static Timestamp getSqlTimeStampByStringDateInFormat(String dateStr, String dateFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date date = null;
		Timestamp sqlTimestamp = null;
		try {
			date = sdf.parse(dateStr);
			long t = date.getTime();
			sqlTimestamp = new Timestamp(t);
		} catch (ParseException e) {
			logger.error(e.getMessage(), e);
		}
		return sqlTimestamp;
	}

	/**
	 * Raanjith
	 * 
	 * @param date {@code allows } {@link XMLGregorianCalendar}
	 * @return {@link java.sql.Date} ''2016-09-22'
	 */
	public static java.sql.Date getSqlDateByXMLGregorianCalendar(XMLGregorianCalendar date) {

		java.sql.Date sqlDt = null;
		try {
			if (date != null) {
				java.util.Date dt = date.toGregorianCalendar().getTime();
				sqlDt = new java.sql.Date(dt.getTime());
			}
		} catch (Exception e) {
			logger.error("Grgorian convertion exception " + e.getMessage());
			e.printStackTrace();
		}
		return sqlDt;
	}

	/**
	 * SUPERB!, @author Prasath Ravichandran, 2017-DEC-16
	 * 
	 * @param utilDate {@code allows }{@link java.util.Date}
	 * @return {@code allows }{@link java.sql.Date}
	 */
	public static java.sql.Date getSqlDateByUtilDate(java.util.Date utilDate) {

		java.sql.Date sqlDate = null;
		try {
			if (utilDate != null) {
				// converting java.util.Date to java.sql.Date in Java
				sqlDate = new java.sql.Date(utilDate.getTime());
				logger.debug("Converted value of java.sql.Date : " + sqlDate);
			} else {
				logger.debug("java.util.Date utilDate is null");
			}
		} catch (Exception e) {
			logger.error("Exception " + e.getMessage());
			e.printStackTrace();
		}
		return sqlDate;
	}

	/**
	 * SUPERB!, @author Prasath Ravichandran, 2017-DEC-16
	 * 
	 * @param sqlDate {@code allows }{@link java.sql.Date}
	 * @return utilDate {@code allows }{@link java.util.Date}
	 */
	public static java.util.Date getUtilDateBySqlDate(java.sql.Date sqlDate) {

		java.util.Date utilDate = null;
		try {
			if (sqlDate != null) {
				// converting java.sql.Date to java.util.Date back
				utilDate = new java.util.Date(sqlDate.getTime());
				logger.debug("Converted value of java.util.Date : " + utilDate);
			} else {
				logger.debug("java.sql.Date utilDate is null");
			}

		} catch (Exception e) {
			logger.error("Exception " + e.getMessage());
			e.printStackTrace();
		}
		return utilDate;
	}

	public static String getTISystemDate() {

		String tiCurrDate = null;
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps = null;

		// 02-OCT-16
		String query = "SELECT to_char(PROCDATE,'yyyy-mm-dd') as PROCDATE FROM DLYPRCCYCL ";
		// logger.debug("TI CURRENT DATE QUERY : " + query);

		try {
			con = DatabaseUtility.getTizoneConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				tiCurrDate = rs.getString(1);
			}

		} catch (SQLException e) {
			logger.error("SQL Exceptions! Fince_Pst Failed to insert. " + e.getMessage(), e);
			e.printStackTrace();

		} catch (Exception e) {
			logger.error("Exception! Fince_Pst Failed to insert " + e.getMessage(), e);
			e.printStackTrace();

		} finally {
			DatabaseUtility.surrenderPrepdConnection(con, ps, rs);
		}

		return tiCurrDate;
	}

	/**
	 * 2019-SEP-23
	 * 
	 * @return {@code returns }{@link java.sql.Date}
	 */
	public static java.sql.Date getDlyProcCyclDate() {

		java.sql.Date tiCurrDate = null;

		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps = null;

		String query = "SELECT PROCDATE FROM DLYPRCCYCL ";
		// logger.debug("TI CURRENT DATE QUERY : " + query);

		try {
			con = DatabaseUtility.getTizoneConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				tiCurrDate = rs.getDate("PROCDATE");
			}

		} catch (SQLException e) {
			logger.error("SQL Exceptions! " + e.getMessage(), e);
			e.printStackTrace();

		} catch (Exception e) {
			logger.error("Exception! " + e.getMessage(), e);
			e.printStackTrace();

		} finally {
			DatabaseUtility.surrenderPrepdConnection(con, ps, rs);
		}
		return tiCurrDate;
	}

	public static java.sql.Date getTISystemSqlDate() {
		java.sql.Date tiCurrDate = null;
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps = null;
		// 02-OCT-16
		String query = "SELECT to_char(PROCDATE,'yyyy-mm-dd') as PROCDATE FROM DLYPRCCYCL ";
		// logger.debug("TI CURRENT DATE QUERY : " + query);
		try {
			con = DatabaseUtility.getTizoneConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				tiCurrDate = rs.getDate(1);
			}
		} catch (SQLException e) {
			logger.error("SQL Exceptions! " + e.getMessage(), e);
			e.printStackTrace();
		} catch (Exception e) {
			logger.error("Exception! " + e.getMessage(), e);
			e.printStackTrace();
		} finally {
			DatabaseUtility.surrenderPrepdConnection(con, ps, rs);
		}
		return tiCurrDate;
	}

	public static java.sql.Date getTISystemValueDate() {

		java.sql.Date tiCurrDate = null;
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps = null;

		// 02-OCT-16
		String query = "SELECT to_date(PROCDATE,'dd-MON-yy') as PROCDATE FROM DLYPRCCYCL ";
		// logger.debug("TI CURRENT DATE QUERY : " + query);

		try {
			con = DatabaseUtility.getTizoneConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				tiCurrDate = rs.getDate(1);
			}

		} catch (SQLException e) {
			logger.error("SQL Exceptions! " + e.getMessage(), e);
			e.printStackTrace();

		} catch (Exception e) {
			logger.error("Exception! " + e.getMessage(), e);
			e.printStackTrace();

		} finally {
			DatabaseUtility.surrenderPrepdConnection(con, ps, rs);
		}

		return tiCurrDate;
	}

	private static java.sql.Date getTINxtDate() {

		java.sql.Date tiCurrDate = null;
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps = null;

		// 02-OCT-16
		String query = "SELECT to_date(NEXTDATE,'dd-MON-yy') as PROCDATE FROM DLYPRCCYCL ";
		// logger.debug("TI CURRENT DATE QUERY : " + query);

		try {
			con = DatabaseUtility.getTizoneConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				tiCurrDate = rs.getDate(1);
			}

		} catch (SQLException e) {
			logger.error("SQL Exceptions! Fince_Pst Failed to insert. " + e.getMessage(), e);
			e.printStackTrace();

		} catch (Exception e) {
			logger.error("Exception! Fince_Pst Failed to insert " + e.getMessage(), e);
			e.printStackTrace();

		} finally {
			DatabaseUtility.surrenderPrepdConnection(con, ps, rs);
		}

		return tiCurrDate;
	}

	/**
	 * Get current date of TIPlus system
	 * 
	 * @return {@link String}
	 */
	public static String getCurrentDateofTISystem() {
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		String result = "";
		try {
			String query = "select TO_CHAR(procdate,'dd-MM-yyyy') as currentdate from dlyprccycl";
			try {
				con = DatabaseUtility.getTizoneConnection();
				stmt = con.createStatement();
				res = stmt.executeQuery(query);
				while (res.next()) {
					if (ValidationsUtil.isValidString(res.getString("currentdate").trim())) {
						result = res.getString("currentdate").trim();
					}
				}

			} catch (SQLException e) {
				logger.error("Exception! " + e.getMessage());
				e.printStackTrace();
			} finally {
				DatabaseUtility.surrenderConnection(con, stmt, res);
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
		}
		return result;
	}

	public static int dateDiff(String fromDate, String toDate) {

		// String fromDate = "22-Jan-2018";
		// String toDate = "31-Jan-2018";
		// System.out.println(dateDiff(fromDate, toDate));

		// Custom date format
		SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");

		Date d1 = null;
		Date d2 = null;
		try {
			d1 = format.parse(fromDate);
			d2 = format.parse(toDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		long diff1 = d1.compareTo(d2);
		System.out.println("From date is small>>>>" + diff1);

		long diff2 = d2.compareTo(d1);
		System.out.println("From date is big>>>>" + diff2);

		return 1;
	}

	/**
	 * @since 26-APR-2019
	 * @author Kxt54179
	 * 
	 * @param dateToValidate
	 * @param dateFromat
	 * @return
	 */
	public static boolean isValidDate(String dateToValidate, String dateFromat) {

		boolean isvalid = true;

		if (dateToValidate != null && !dateToValidate.isEmpty()) {

			SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
			sdf.setLenient(false);
			try {
				// if not valid, it will throw ParseException
				Date date = sdf.parse(dateToValidate);
				System.out.println(date);
				isvalid = true;

			} catch (ParseException e) {
				isvalid = false;
				System.out.println("ParseException " + e.getMessage());
				e.printStackTrace();
			}

		} else {
			isvalid = false;
		}

		return isvalid;
	}

}
