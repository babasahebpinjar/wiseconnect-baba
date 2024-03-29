package com.shorewise.wiseconnect.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;


import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.google.gson.Gson;
import com.misys.tiplus2.services.control.ServiceRequest;
import com.misys.tiplus2.services.control.ServiceResponse;


/**
 * 
 * @since 2019-OCT-30, 2019-SEP-16
 * @version v.4.2.4
 * @author <b><i><font color=blue>Prasath Ravichandran,</font></i></b>
 *         <font color=green>Software Analyst,</font>
 *         <font color=violet>Bluescope</font>
 *
 */
public class ThemeBridgeUtil {

	public static Logger logger = Logger.getLogger(ThemeBridgeUtil.class);
	public static Properties property = null;

	/**
	 * Random ID/String used for CorrelationID in TI
	 * 
	 * @return {@link String}
	 */
	public static String randomCorrelationId() {
		return UUID.randomUUID().toString();
	}

	/**
	 * Random ID/String used for limit service requestid in ESB which allows only 18
	 * character
	 * 
	 * @return {@link String}
	 */
	public static String randomLimitRequestId() {
		String result = randomCorrelationId().replace('-', '0');
		result = getSubStringData(result, 0, 9);
		return result;
	}

	/**
	 * 
	 * @param length
	 * @return
	 */
	public static long generateRandom(int length) {
		Random random = new Random();
		char[] digits = new char[length];
		digits[0] = (char) (random.nextInt(9) + '1');
		for (int i = 1; i < length; i++) {
			digits[i] = (char) (random.nextInt(10) + '0');
		}
		return Long.parseLong(new String(digits));
	}

	public static String integerToString(Integer number) {

		String stringValue = null;
		if (ValidationsUtil.isValidObject(number)) {
			stringValue = String.valueOf(number);
		}
		return stringValue;
	}

	public static Integer StringtoInt(String name) {

		if (name == null) {
			return null;
		}
		Integer aint = 0;
		try {
			aint = new Integer(name);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return aint;
	}

	/**
	 * Convert String to Long
	 * 
	 * @param name : Input Long value as a String
	 * @return Long value
	 */
	public static Long StringtoLong(String name) {
		Long aint = 0L;
		try {
			aint = Long.parseLong(name);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return aint;
	}

	/**
	 * Get the tag value from the XML string
	 * 
	 * @param xmlString {@code allows } {@link String}
	 * @param tagName   {@code allows } {@link String}
	 * @return {@link String}
	 */
	public static String getXMLTagValue(String xmlString, String tagName) {
		String result = "";
		if (ValidationsUtil.isValidString(xmlString) && ValidationsUtil.isValidString(tagName)) {
			try {
				result = xmlString.split("<" + tagName + ">")[1].split("</" + tagName + ">")[0];
			} catch (ArrayIndexOutOfBoundsException e) {
				logger.error(e.getMessage(), e);
			} finally {
				// do nothing
			}
		}
		return ValidationsUtil.getValidStringValue(result);
	}

	public static String getValueFromXml(String inputXml, String key) {
		logger.info("getValue FormXML to be started.........................");
		String result = "";
		String startIndex = "<" + key + ">";
		String endIndex = "</" + key + ">";
		logger.info("ket startIndex tage==>" + startIndex);
		logger.info("ket endIndex tage==>" + endIndex);
		logger.info("ket endIndex tage==>" + endIndex);
		logger.info("ket startIndex tage==>" + startIndex);
		try {
			String requiredString = inputXml.substring(inputXml.indexOf(startIndex) + startIndex.length(),
					inputXml.indexOf(endIndex));
			logger.info(requiredString);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(e);
			return "";
		}
		return result;
	}

	/***************************************************/

	/**
	 * Reads content from a file
	 * 
	 * @param filePath {@code allows } {@link String}
	 * @return {@link String}
	 * @throws Exception
	 */
	public static String readPropertiesFile(String filePath) throws Exception {

		InputStream input = ThemeBridgeUtil.class.getClassLoader().getResourceAsStream(filePath);
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {
			br = new BufferedReader(new InputStreamReader(input));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}

	/**
	 * <p>
	 * Converts an object to JSON
	 * </p>
	 * <p>
	 * If {@code obj} is null or not a valid Object, returns a empty {@link String}
	 * </p>
	 * 
	 * @param obj {@code allows any }{@link Object}
	 * @return {@link String}
	 */
	public static String convertObjectToJSON(Object obj) {
		String jsonText = "";
		if (ValidationsUtil.isValidObject(obj)) {
			Gson gson = new Gson();
			jsonText = gson.toJson(obj);
		} else {
			logger.error("Function convertObjectToJSON argument contains Null value");
		}

		return jsonText;
	}

	/**
	 * <p>
	 * Converts an object to JSON
	 * </p>
	 * <p>
	 * If {@code obj} is null or not a valid Object, returns a empty {@link String}
	 * </p>
	 * 
	 * @param gson {@code allows any }{@link Object}
	 * @param obj  {@code allows any }{@link Object}
	 * 
	 * @return {@link String}
	 */
	public static String convertObjectToJSON(Gson gson, Object obj) {
		String jsonText = "";
		if (ValidationsUtil.isValidObject(obj)) {
			if (!ValidationsUtil.isValidObject(gson)) {
				gson = new Gson();
			}
			jsonText = gson.toJson(obj);
		} else {
			logger.error("Function convertObjectToJSON argument contains Null value");
		}

		return jsonText;
	}

	/**
	 * <p>
	 * Converts JSON to an object
	 * </p>
	 * 
	 * <p>
	 * If {@code jsonText} is null or empty {@link String}, returns a empty
	 * {@link Object}
	 * </p>
	 * 
	 * @param jsonText {@code allows }{@link String}
	 * @param obj      {@code allows any }{@link Object}
	 * @return {@link Object}
	 */
	public static Object convertJsonToObject(String jsonText, Object obj) {
		if (ValidationsUtil.isValidString(jsonText) && ValidationsUtil.isValidObject(obj)) {
			Gson gson = new Gson();
			logger.info("Function convertJsonToObject arguments : " + obj);
			obj = gson.fromJson(jsonText, Object.class);
		} else {
			logger.error("Function convertJsonToObject arguments contains Null value");
		}

		return obj;
	}

	/**
	 * To get a key value from dummyFile.properties
	 * 
	 * @param keyName {@code allows } {@link String}
	 * @return keyValue {@link String}
	 */
	public static String getFileProperties(String keyName) {
		if (!ValidationsUtil.isValidObject(property)) {
			property = new Properties();
			InputStream inputStream = ThemeBridgeUtil.class.getClassLoader()
					.getResourceAsStream("dummyFile.properties");
			try {
				property.load(inputStream);
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			} catch (NullPointerException e) {
				logger.error(e.getMessage(), e);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			} finally {
				try {
					inputStream.close();
				} catch (Exception e) {
					logger.error(e.getMessage(), e);
				}
			}
		}
		return property.getProperty(keyName);
	}

	/**
	 * To convert Response XML to String, JAXBContext of ServiceResponse
	 * 
	 * @param serviceResponse {@code allows } {@link ServiceResponse}
	 * 
	 * @return {@link String}
	 */
	public static String convertRequesXMLToString(ServiceRequest serviceRequest) {
		String result = "";
		JAXBContext context = null;
		try {
			context = JAXBInstanceInitialiser.getServiceRequestContext();
			result = JAXBTransformUtil.doMarshalling(context, serviceRequest);
		} catch (Exception exp) {
			logger.error(exp.getMessage(), exp);
		}
		return result;
	}

	/**
	 * To convert Response XML to String, JAXBContext of ServiceResponse
	 * 
	 * @param serviceResponse {@code allows } {@link ServiceResponse}
	 * 
	 * @return {@link String}
	 */
	public static String convertResponseXMLToString(ServiceResponse serviceResponse) {
		String result = "";
		JAXBContext context = null;
		try {
			context = JAXBInstanceInitialiser.getServiceResponseContext();
			result = JAXBTransformUtil.doMarshalling(context, serviceResponse);
		} catch (Exception exp) {
			logger.error("Exception " + exp.getMessage());
			exp.printStackTrace();
		}
		return result;
	}

	/**
	 * To do marshalling of JAXBObject and returns as string
	 * 
	 * @param context    {@code allows object of } {@link JAXBContext}
	 * @param toDoObject {@code allows object of } {@link ServiceRequest}
	 * @return {@link String}
	 */
	public static String doMarshalling(JAXBContext context, Object toDoObject) {
		String result = "";
		if (ValidationsUtil.isValidObject(toDoObject)) {
			ByteArrayOutputStream outStream = new ByteArrayOutputStream();
			try {
				Marshaller jaxbMarshaller = context.createMarshaller();
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				jaxbMarshaller.marshal(toDoObject, outStream);
				result = outStream.toString();
			} catch (Exception exp) {
				logger.error("Exception " + exp.getMessage());
				exp.printStackTrace();
			} finally {
				try {
					outStream.close();
				} catch (IOException e) {
					logger.error("Exception " + e.getMessage());
					e.printStackTrace();
				}
			}
		} else {
			logger.info("Marshalling object is not valid");
		}
		return result;
	}

	/**
	 * Parsing pipe separator content into array
	 * 
	 * @param pipeConcatenatedString {@code allows } {@link String}
	 * @return {@link String}
	 */
	public static String[] parsePipeSeparatorIntoArray(String pipeConcatenatedString) {
		String[] resultArray = null;
		if (ValidationsUtil.isValidString(pipeConcatenatedString)) {
			resultArray = pipeConcatenatedString.split("\\|");
		}
		return resultArray;
	}

	/**
	 * Separate the string with seperator
	 * 
	 * @param inputString   {@code allows } {@link String}
	 * @param separatorCode {@code allows } {@link String}
	 * 
	 * @return {@link String}
	 */
	public static String[] parseStringSeparatorIntoArray(String inputString, String separatorCode) {
		String[] resultArray = null;
		if (ValidationsUtil.isValidString(inputString)) {
			resultArray = inputString.split(separatorCode);
		}
		return resultArray;
	}

	public static void main(String[] args) {

		BigDecimal result = null;
		Connection aConnection = null;
		PreparedStatement aPreparedStatement = null;
		ResultSet aResultSet = null;
		Float f=17723.5f;
		BigDecimal Mt103Amt=BigDecimal.valueOf(f);
		String uetr="b11baf0a-045c-4a16-ca40-b60ad7978d3g";
		try {
			aConnection = DatabaseUtility.getThemebridgeConnection();
			aPreparedStatement = aConnection.prepareStatement(
					"select sum(amount) from THEMEBRIDGE.ETT_MT103_SWIFT_TRACKER WHERE UETR = ?");
			aPreparedStatement.setString(1, uetr);
			aResultSet = aPreparedStatement.executeQuery();
			while (aResultSet.next()) {
				result = aResultSet.getBigDecimal(1);
				if(result==null)
					result=BigDecimal.ZERO;
				int comp=Mt103Amt.compareTo(result);
				System.out.println(comp);
			
			}
			System.out.println(result);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		/*
		
		Float f=17723.5f;
		BigDecimal Mt103Amt=BigDecimal.valueOf(f);
		System.out.println(Mt103Amt);
		BigDecimal totAmt=BigDecimal.ZERO;
		int comp=Mt103Amt.compareTo(totAmt);
		System.out.println(comp);*/
	}

	/**
	 * Get the values from and to index
	 * 
	 * @param value     {@code allows } {@link String}
	 * @param fromIndex {@code allows } {@link Integer}
	 * @param toIndex   {@code allows } {@link Integer}
	 * @return {@link String}
	 */
	public static String getSubStringData(String value, int fromIndex, int toIndex) {
		String result = "";
		if (ValidationsUtil.isValidString(value) && value.length() > fromIndex && value.length() >= toIndex
				&& fromIndex < toIndex) {
			result = value.substring(fromIndex, toIndex).trim();
		} else {
			result = value;
		}
		return result;
	}

	/**
	 * Get the values from and to index
	 * 
	 * @param text  {@code allows } {@link String}
	 * @param token {@code allows } {@link Integer}
	 * @param value {@code allows } {@link Integer}
	 * @return {@link String}
	 */
	public static String replaceTokenByValue(String text, String token, String value) {
		if (ValidationsUtil.isValidString(text) && ValidationsUtil.isValidString(value)) {
			text = text.replace(token, value);
		}
		return text;
	}

	public static String formatXml(String xml) {
		try {
			Transformer serializer = SAXTransformerFactory.newInstance().newTransformer();
			serializer.setOutputProperty(OutputKeys.INDENT, "yes");
			serializer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

			serializer.setOutputProperty("{http://xml.customer.org/xslt}indent-amount", "2");
			Source xmlSource = new SAXSource(new InputSource(new ByteArrayInputStream(xml.getBytes())));
			StreamResult res = new StreamResult(new ByteArrayOutputStream());
			serializer.transform(xmlSource, res);
			return new String(((ByteArrayOutputStream) res.getOutputStream()).toByteArray());
		} catch (Exception e) {

			return xml;
		}
	}

	public static String getRateCSV(String inputXML, InputStream input) throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new InputSource(new StringReader(inputXML)));

		StreamSource stylesource = new StreamSource(input);
		Transformer transformer = TransformerFactory.newInstance().newTransformer(stylesource);

		StringWriter sw = new StringWriter();
		StreamResult result = new StreamResult(sw);
		transformer.transform(new DOMSource(document), result);
		StringBuffer csv = sw.getBuffer();

		// Source source = new DOMSource(document);
		// Result outputTarget = new StreamResult(new
		// File(ANBConstantValue.CSV_FILE_PATH+"rate.csv"));
		// transformer.transform(source, outputTarget);
		// String filepath = ANBConstantValue.CSV_FILE_PATH+"rate.csv";

		return csv.toString();
	}

	public static String getXmlFromObject(Object anSourceObject) {

		String requestXML = "";
		try {
			StringWriter writer = new StringWriter();
			JAXBContext context = JAXBContext.newInstance(anSourceObject.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(anSourceObject, writer);
			requestXML = writer.toString();

		} catch (JAXBException e) {
			logger.error("getXmlFromObject JAXBException => " + e.getMessage(), e);
			e.printStackTrace();
		}

		return requestXML;
	}

	public static Object getObjectFromXml(String responseXml, Object anObject) {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(anObject.getClass());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			anObject = (Object) jaxbUnmarshaller.unmarshal(new StringReader(responseXml));

		} catch (JAXBException e) {
			logger.error("getObjectFromXml JAXBException => " + e.getMessage(), e);
			e.printStackTrace();
		}

		return anObject;
	}

	public static List<String> getValuelist(String requestXML, String xpath)
			throws SAXException, IOException, XPathExpressionException {
		// logger.info(xpath);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		DocumentBuilder db;
		List<String> xPathNodeListValue = new ArrayList<String>();
		try {
			db = dbf.newDocumentBuilder();
			Document doc = db.parse(new InputSource(new StringReader(requestXML)));
			XPathFactory factory = XPathFactory.newInstance();
			javax.xml.xpath.XPath oXPath = factory.newXPath();
			// get attribute Value

			// attributeValue = oXPath.compile(xpath).evaluate(doc);
			NodeList nl = (NodeList) oXPath.compile(xpath).evaluate(doc, XPathConstants.NODESET);
			int totalBooks = nl.getLength();
			logger.info(totalBooks);

			for (int i = 0; i < totalBooks; i++) {

				Node firstBookNode = nl.item(i);
				logger.info(firstBookNode.getNamespaceURI());
				if (firstBookNode.getNodeType() == Node.ELEMENT_NODE) {
					try {

						String facvalue = nl.item(i).getTextContent();
						String nodeName = nl.item(i).getNodeName();
						logger.info(nodeName + ":" + facvalue);
						xPathNodeListValue.add(nodeName + ":" + facvalue);

					} catch (Exception e) {

					}
				}
			}
			// logger.info(attributeValue);

		} catch (ParserConfigurationException e) {
			logger.info("ParserConfigurationException:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info("xPathNodeListValue :" + xPathNodeListValue);

		return xPathNodeListValue;
	}

	public static String getValue(String requestXML, String xpath)
			throws SAXException, IOException, XPathExpressionException {
		// logger.info(xpath);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		DocumentBuilder db;
		String attributeValue = "";
		try {
			db = dbf.newDocumentBuilder();
			Document doc = db.parse(new InputSource(new StringReader(requestXML)));
			XPathFactory factory = XPathFactory.newInstance();
			javax.xml.xpath.XPath oXPath = factory.newXPath();
			// get attribute Value
			attributeValue = oXPath.compile(xpath).evaluate(doc);
			// logger.info(attributeValue);
		} catch (ParserConfigurationException e) {
			logger.error("ParserConfigurationException:" + e.getMessage());
			attributeValue = "";
			e.printStackTrace();
		} catch (Exception e) {
			logger.error("Exception " + e.getMessage());
			attributeValue = "";
			e.printStackTrace();
		}
		// logger.info("attributeValue:" + attributeValue);
		return attributeValue;
	}

	public static String prettyFormat(String xml) {
		StringWriter stringWriter = null;
		String retruResult = "";
		try {
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new InputSource(new ByteArrayInputStream(xml.getBytes("utf-8"))));

			XPath xPath = XPathFactory.newInstance().newXPath();
			NodeList nodeList = (NodeList) xPath.evaluate("//text()[normalize-space()='']", document,
					XPathConstants.NODESET);

			for (int i = 0; i < nodeList.getLength(); ++i) {
				Node node = nodeList.item(i);
				node.getParentNode().removeChild(node);
			}

			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

			stringWriter = new StringWriter();
			StreamResult streamResult = new StreamResult(stringWriter);

			transformer.transform(new DOMSource(document), streamResult);
			retruResult = stringWriter.toString();
		} catch (Exception e) {
			e.printStackTrace();
			retruResult = "";
		}
		return xml;

	}

	

	public static void checkFolderExistsElseCreate(String folderPath) {

		logger.info("Directory :(:(:(:(:(" + folderPath);

		File file = new File(folderPath);
		if (!file.exists()) {
			logger.info("Directory is not exists So we tries to create the directory....");
			if (file.mkdirs()) {
				logger.info("Directory is created Successfully :):):):):)");
			} else {
				logger.info("Failed to create directory :(:(:(:(:(");
			}
		} else {

			logger.info("Directory is exists :):):):):)");

		}

	}

	/**
	 * <p>
	 * Read file to avoid new line \r\n
	 * </p>
	 * Reads content from a file
	 * 
	 * @since 20-OCT-2018
	 * @version v2.0
	 * @author Kxt54179, Prasath Ravichandran
	 * 
	 * @param filePath {@code allows } {@link String}
	 * @return {@link String}
	 * @throws Exception
	 */
	public static String readFile(String filePath) throws Exception {

		String result = "";
		logger.info("Read Filepath: " + filePath);

		String line = null;
		FileReader fileReader = null;
		BufferedReader buffReader = null;
		StringBuilder strBuilder = new StringBuilder();
		String newLineSeparator = System.getProperty("line.separator");

		try {
			fileReader = new FileReader(filePath);
			buffReader = new BufferedReader(fileReader);

			int lineCount = 1;
			while ((line = buffReader.readLine()) != null) {
				if (lineCount > 1)
					strBuilder.append(newLineSeparator);
				strBuilder.append(line);
				++lineCount;
			}

			result = strBuilder.toString();
			// logger.info("File lines: " + lineCount);
			// logger.info("Result: \n>>-->>" + result + "<<--<<");

		} catch (Exception ex) {
			logger.error("FileReader exception " + ex.getMessage());
			throw new Exception(ex);

		} finally {
			try {
				if (fileReader != null)
					fileReader.close();
			} catch (Exception ex1) {
				logger.error("FileReader close exception! " + ex1.getMessage());
				ex1.printStackTrace();
			}
			try {
				if (buffReader != null)
					buffReader.close();
			} catch (Exception ex2) {
				logger.error("BufferedReader close exception! " + ex2.getMessage());
				ex2.printStackTrace();
			}
		}

		return result;
	}

	/**
	 * <p>
	 * Read file to avoid new line \r\n - NEW
	 * </p>
	 * Reads content from a file
	 * 
	 * @since 2019-OCT-29
	 * @version v2.0
	 * @author Kxt54179, Prasath Ravichandran
	 * 
	 * @param filePath {@code allows } {@link InputStream}
	 * @return {@link String}
	 * @throws Exception
	 */
	public static String readFileInpStream(InputStream inpStream) throws IOException {

		String result = "";
		BufferedReader buffReader = null;

		try {
			String line = null;
			StringBuilder strBuilder = new StringBuilder();
			String newLineSeparator = System.getProperty("line.separator");// CRLF
			buffReader = new BufferedReader(new InputStreamReader(inpStream));

			int lineCount = 1;
			while ((line = buffReader.readLine()) != null) {
				if (lineCount > 1)
					strBuilder.append(newLineSeparator);
				strBuilder.append(line);
				++lineCount;
			}

			result = strBuilder.toString();
			// logger.info("File lines: " + lineCount);
			// logger.info("Result: \n>>-->>" + result + "<<--<<");

		} catch (IOException ex) {
			logger.error("IOException " + ex.getMessage());
			ex.printStackTrace();

		} finally {
			try {
				if (buffReader != null)
					buffReader.close();
			} catch (IOException ex) {
				logger.error("BufferedReader close exception! " + ex.getMessage());
				ex.printStackTrace();
			}
		}

		return result;
	}

	/**
	 * <p>
	 * Read file to avoid new line \r\n OLD
	 * </p>
	 * Reads content from a file
	 * 
	 * @since 20-OCT-2018
	 * @version v2.0
	 * @author Kxt54179, Prasath Ravichandran
	 * 
	 * @param filePath {@code allows } {@link InputStream}
	 * @return {@link String}
	 * @throws Exception
	 */
//	public static String readFile(InputStream inpStream) throws IOException {
//
//		String result = "";
//
//		String line = null;
//		BufferedReader buffReader = null;
//		StringBuilder strBuilder = new StringBuilder();
//		String newLineSeparator = System.getProperty("line.separator");
//
//		try {
//			buffReader = new BufferedReader(new InputStreamReader(inpStream));
//
//			int lineCount = 1;
//			while ((line = buffReader.readLine()) != null) {
//				if (lineCount > 1)
//					strBuilder.append(newLineSeparator);
//				strBuilder.append(line);
//				++lineCount;
//			}
//
//			result = strBuilder.toString();
//			// logger.info("File lines: " + lineCount);
//			// logger.info("Result: \n>>-->>" + result + "<<--<<");
//
//		} catch (IOException ex) {
//			logger.error("IOException " + ex.getMessage());
//			ex.printStackTrace();
//
//		} finally {
//			try {
//				if (buffReader != null)
//					buffReader.close();
//			} catch (IOException ex) {
//				logger.error("BufferedReader close exception! " + ex.getMessage());
//				ex.printStackTrace();
//			}
//		}
//
//		return result;
//	}

	/**
	 * To write swift out message in text file and store in it local path
	 * 
	 * @param filePath    {@code allows } {@link String}
	 * @param textContent {@code allows } {@link String}
	 * 
	 * @return {@link boolean}
	 */
	public static boolean writeFile(String filePath, String textContent) {
		boolean isSucceed = false;
		Writer output = null;
		File file = null;
		try {
			file = new File(filePath);
			output = new BufferedWriter(new FileWriter(file));
			if (ValidationsUtil.isValidString(textContent)) {
				output.write(textContent);
			}
			isSucceed = true;
			// logger.info("----------> File has been written in " + filePath
			// + " <----------");
		} catch (Exception ex) {
			logger.error("Exception " + ex.getMessage());
			ex.printStackTrace();
			isSucceed = false;
		} finally {
			try {
				output.close();
			} catch (IOException e) {
				logger.error("Exception " + e.getMessage());
				e.printStackTrace();
			}
		}
		return isSucceed;
	}

	/**
	 * To delete a file which stored in it local system
	 * 
	 * @param filePath {@code allows } {@link String}
	 * 
	 * @return {@link boolean}
	 */
	public static boolean deleteFile(String filePath) {
		boolean isSucceed = false;
		File file = null;
		try {
			file = new File(filePath);
			if (file.exists()) {
				file.delete();
			}
			isSucceed = true;
		} catch (Exception ex) {
			logger.error("Exception " + ex.getMessage());
			isSucceed = false;
		} finally {

		}
		return isSucceed;
	}

	public static boolean moveFile(String source, String destination) {
		InputStream inStream = null;
		OutputStream outStream = null;
		boolean result = false;
		try {

			File afile = new File(source);
			File bfile = new File(destination);
			logger.info("source :>>>>>>>>>>>" + source);
			logger.info("destination :>>>>>>>>>>>>>" + destination);

			if (afile != null && afile.exists()) {
				inStream = new FileInputStream(afile);
				outStream = new FileOutputStream(bfile);

				byte[] buffer = new byte[1024];

				int length;
				// copy the file content in bytes
				while ((length = inStream.read(buffer)) > 0) {
					outStream.write(buffer, 0, length);
				}

				inStream.close();
				outStream.close();

				afile.setWritable(true);
				// delete the original file
				System.gc();
				afile.delete();

				// FileDeleteStrategy.FORCE.delete(afile);
				result = true;
				// logger.info("File is copied successful!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static boolean moveFiles(String dirPath, File file) {
		boolean isConfirm = false;

		if (file != null) {
			logger.info("DirPath : " + dirPath + ", File : " + file.getName());
			ThemeBridgeUtil.checkFolderExistsElseCreate(dirPath);
			String fileName = file.getName();
			String folderPath = dirPath;

			File folder = new File(folderPath);
			if (!folder.exists()) {
				if (folder.mkdir()) {
					logger.info("Folder is created!");
				} else {
					logger.info("Failed to create directory!");
				}
			} else {
				logger.info("Folder already exists");
			}
			File f = new File(folderPath + fileName);
			if (f.exists()) {
				f.delete();
				logger.info("exists:>" + f.getAbsolutePath());
			}
			logger.info("File moveeeee:>" + f.getAbsolutePath());
			isConfirm = file.renameTo(new File(folderPath + fileName));

			logger.info("File moved " + isConfirm);
			// if (!isConfirm) {
			// file.renameTo(new File(dirPath, "1_" + file.getName()));
			// }
		}
		return isConfirm;
	}

	public static boolean txtFileWriter(List<String> finalWriteData, String fileRefNo) {
		FileWriter fw;
		try {

			String[] fileDir = fileRefNo.split("/");
			String filename = fileDir[fileDir.length - 1];

			logger.info("FileName \t:>" + filename);
			logger.info("filename.length() \t:>" + filename.length());
			logger.info("FileRefNo \t:>" + fileRefNo);
			logger.info("finalWriteData Size\t:>" + finalWriteData.size());

			String folderPath = fileRefNo.substring(0, fileRefNo.length() - filename.length());
			logger.info(folderPath);
			// checkFolderExistsElseCreate(folderPath);

			int i = finalWriteData.size();
			fw = new FileWriter(fileRefNo);
			BufferedWriter bw = new BufferedWriter(fw);
			int count = 1;
			for (String dataPart : finalWriteData) {
				// logger.info(dataPart);
				bw.write(dataPart);
				if (count != i)
					bw.newLine();
				count++;
			}
			bw.close();

		} catch (IOException e) {
			logger.error("IOException " + e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean txtFileWriterEndline(List<String> finalWriteData, String fileRefNo) {
		FileWriter fw;
		try {

			String[] fileDir = fileRefNo.split("/");
			String filename = fileDir[fileDir.length - 1];

			logger.info("FileNAme \t:>" + filename);
			logger.info("filename.length() \t:>" + filename.length());
			logger.info("FileRefNo \t:>" + fileRefNo);
			logger.info("finalWriteData Size\t:>" + finalWriteData.size());

			String folderPath = fileRefNo.substring(0, fileRefNo.length() - filename.length());
			logger.info(folderPath);
			// checkFolderExistsElseCreate(folderPath);

			int i = finalWriteData.size();
			fw = new FileWriter(fileRefNo);
			BufferedWriter bw = new BufferedWriter(fw);
			int count = 1;
			for (String dataPart : finalWriteData) {
				// logger.info(dataPart);
				bw.write(dataPart);
				// if (count != i)
				bw.newLine();
				count++;
			}
			bw.close();

		} catch (IOException e) {
			logger.error("IOException " + e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static void removeLastEmptyLineFromTextFile(String fileFullPath) {

		try {
			RandomAccessFile file = new RandomAccessFile(fileFullPath, "rw");
			long length = file.length();
			logger.info("File Length Before Last line Removal Process : " + file.length());

			// Assume that last line is of 10 char
			file.setLength(length - 2);

			logger.info("Now The File Length After Last Line Removal Process : " + file.length());
			file.close();

		} catch (Exception ex) {
			logger.error("ERROR At Last Line Removal Process : " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public static boolean isValidTime()
	{

		boolean isValidTime=false;
		String dateStart="";
		String finale="";
		Connection dbconn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		
		try{
			dbconn = DatabaseUtility.getThemebridgeConnection();
			String query="select PROCESSTIME from themebridge.LISTENER_SCHEDULER where key='POSTING_STAGING_LISTENER'";
			pstmt = dbconn.prepareStatement(query);
			res = pstmt.executeQuery();
			while(res.next())
			{
				System.out.println("Resultset date/Time-> "+res.getString("PROCESSTIME"));
				//logger.info(LocalDate.parse(res.getString("PROCESSTIME"), DateTimeFormatter.ofPattern("YYYY/M/DD")));
				dateStart=res.getString("PROCESSTIME");//2020-11-12 1:40:50
				DateFormat df= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				Date parsedDate = df.parse(dateStart);
				System.out.println("parsedDate "+parsedDate);
			}
		
		}catch(Exception e){
			e.printStackTrace();
		
		}finally {
			DatabaseUtility.surrenderConnection(dbconn, pstmt, res);
		}
		

			DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss");
			LocalDateTime now=LocalDateTime.now();
			Date date= new Date();
			String dateStop = dtf.format(now);
			System.out.println("DateStop-> "+dateStop);
			
			dateStart=dateStart.replaceAll(":",".");	
			/*System.out.println("Sub "+(StringUtils.substringBetween(dateStart, "-", "-").length()));
			String sub=StringUtils.substringBetween(dateStart, "-", "-");
			int le=StringUtils.substringBetween(dateStart, "-", "-").length();
			
			if(le<2)
			{
				logger.info("single digit");
				logger.info("Before replace-> "+dateStart);
				//finale=dateStart.replace(sub,"0"+sub);
				finale=StringUtils.replaceOnce(dateStart, sub, "0"+sub);
				logger.info("DbOP Finale--> "+finale);
			}*/
			//HH converts hour in 24 hours format (0-23), day calculation
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss");
			Date d1 = null; 
			Date d2 = null;
			try {
				System.out.println("dateStart to parse-> "+dateStart);
				d1 = format.parse(finale);
				System.out.println("d1 completed");
				System.out.println("dateStop to parse-> "+dateStop);
				d2 = format.parse(dateStop);
				System.out.println("D2 completed");
				//in milliseconds
				long diff = d2.getTime() - d1.getTime();

				long diffSeconds = diff / 1000 % 60;
				long diffMinutes = diff / (60 * 1000) % 60;
				long diffHours = diff / (60 * 60 * 1000) % 24;
				long diffDays = diff / (24 * 60 * 60 * 1000);

				System.out.print(diffDays + " days, ");
				System.out.print(diffHours + " hours, ");
				System.out.print(diffMinutes + " minutes, ");
				System.out.print(diffSeconds + " seconds.");
				if(diffMinutes>=1)
				{
					isValidTime=true;
					System.out.println("IF-->Diffm");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		return isValidTime;
	}
	

}