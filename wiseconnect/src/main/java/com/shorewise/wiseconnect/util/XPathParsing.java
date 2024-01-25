package com.shorewise.wiseconnect.util;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;



/**
 * 
 * @since Apr 24, 2019 4:59:39 PM
 * @version
 * @author Kxt54179 Prasath Ravichandran
 *
 */
public class XPathParsing {

	private final static Logger logger = Logger.getLogger(XPathParsing.class.getName());

	/**
	 * 
	 * @param requestXML {@code allows }{@link String}
	 * @param xpath      {@code allows }{@link String}
	 * @return {@code returns }{@link String}
	 * @throws SAXException
	 * @throws IOException
	 * @throws XPathExpressionException
	 */
	public static String getValue(String requestXML, String xpath)
			throws SAXException, IOException, XPathExpressionException {

		String attributeValue = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setValidating(false);
			DocumentBuilder db;

			db = dbf.newDocumentBuilder();
			Document doc = db.parse(new InputSource(new StringReader(requestXML)));
			XPathFactory factory = XPathFactory.newInstance();
			javax.xml.xpath.XPath oXPath = factory.newXPath();
			attributeValue = oXPath.compile(xpath).evaluate(doc);

		} catch (ParserConfigurationException e) {
			logger.error("ParserConfigurationException:" + e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {
			logger.error("Xpath Exception:" + e.getMessage());
			e.printStackTrace();
		}
		// logger.debug("attributeValue:" + attributeValue);
		return attributeValue;
	}

	/**
	 * 
	 * @param requestXML {@code allows }{@link String}
	 * @param xpath      {@code allows }{@link String}
	 * @return {@code returns }{@link String}
	 */
	public static Map<String, String> getMultiTagValue(String requestXML, String xpath) {

		Map<String, String> messageMAP = new HashMap<String, String>();
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			dbFactory.setValidating(false);
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new InputSource(new StringReader(requestXML)));
			doc.getDocumentElement().normalize();
			XPath xPath = XPathFactory.newInstance().newXPath();
			String expression = xpath;
			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			logger.info("Message Count--->" + nodeList.getLength());
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);
				logger.info("Current Element :" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					logger.info("Element-" + i + "-Message-->" + eElement.getTextContent());
					messageMAP.put("" + i + "", eElement.getTextContent());
				}
			}
		} catch (ParserConfigurationException e) {
			logger.error("ParserConfigurationException: " + e.getMessage());
			e.printStackTrace();

		} catch (SAXException e) {
			logger.error("SAXException: " + e.getMessage());
			e.printStackTrace();

		} catch (IOException e) {
			logger.error("IOException: " + e.getMessage());
			e.printStackTrace();

		} catch (XPathExpressionException e) {
			logger.error("XPathExpressionException: " + e.getMessage());
			e.printStackTrace();
		}

		return messageMAP;
	}

	/**
	 * 
	 * @param requestXML {@code allows }{@link String}
	 * @param xpath      {@code allows }{@link String}
	 * @return {@code returns }{@link String}
	 */
	public static int getMultiTagCount(String requestXML, String xpath) {

		int tagCount = 0;

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			dbFactory.setValidating(false);
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new InputSource(new StringReader(requestXML)));
			doc.getDocumentElement().normalize();
			XPath xPath = XPathFactory.newInstance().newXPath();
			String expression = xpath;
			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			// logger.debug("Multiple Tag Count--->" + nodeList.getLength());
			tagCount = nodeList.getLength();

		} catch (ParserConfigurationException e) {
			logger.error("ParserConfigurationException: " + e.getMessage());
			e.printStackTrace();

		} catch (SAXException e) {
			logger.error("SAXException: " + e.getMessage());
			e.printStackTrace();

		} catch (IOException e) {
			logger.error("IOException: " + e.getMessage());
			e.printStackTrace();

		} catch (XPathExpressionException e) {
			logger.error("XPathExpressionException: " + e.getMessage());
			e.printStackTrace();
		}

		return tagCount;
	}

	public static void main(String[] args) throws Exception {

		String xpath = "ServiceRequest/BatchRequest/RequestHeader/Service";
		logger.debug(xpath);
		String attributeValue = null ;
		//= getValue(
		//		ThemeBridgeUtil.readPropertiesFile("D:\\_Prasath\\Database\\TI Plus+\\Feather_Fetch\\new18.xml"),
		//		xpath);
		logger.debug(attributeValue);
	}

}
