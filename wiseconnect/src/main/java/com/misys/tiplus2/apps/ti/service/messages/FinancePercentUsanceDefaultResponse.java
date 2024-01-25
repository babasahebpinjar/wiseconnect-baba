//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 03:37:05 PM IST 
//


package com.misys.tiplus2.apps.ti.service.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response pane for the enquiry pane FinPctUsce.
 * 
 * <p>Java class for FinancePercentUsanceDefaultResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancePercentUsanceDefaultResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PERCENT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="19"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USANCE_NUM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USANCE_UNT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BOECODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BOMSG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BOEMSGE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancePercentUsanceDefaultResponse", propOrder = {
    "percent",
    "usancenum",
    "usanceunt",
    "boecode",
    "bomsg",
    "boemsge"
})
public class FinancePercentUsanceDefaultResponse {

    @XmlElement(name = "PERCENT")
    protected String percent;
    @XmlElement(name = "USANCE_NUM")
    protected String usancenum;
    @XmlElement(name = "USANCE_UNT")
    protected String usanceunt;
    @XmlElement(name = "BOECODE")
    protected String boecode;
    @XmlElement(name = "BOMSG")
    protected String bomsg;
    @XmlElement(name = "BOEMSGE")
    protected String boemsge;

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERCENT() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERCENT(String value) {
        this.percent = value;
    }

    /**
     * Gets the value of the usancenum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSANCENUM() {
        return usancenum;
    }

    /**
     * Sets the value of the usancenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSANCENUM(String value) {
        this.usancenum = value;
    }

    /**
     * Gets the value of the usanceunt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSANCEUNT() {
        return usanceunt;
    }

    /**
     * Sets the value of the usanceunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSANCEUNT(String value) {
        this.usanceunt = value;
    }

    /**
     * Gets the value of the boecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOECODE() {
        return boecode;
    }

    /**
     * Sets the value of the boecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOECODE(String value) {
        this.boecode = value;
    }

    /**
     * Gets the value of the bomsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOMSG() {
        return bomsg;
    }

    /**
     * Sets the value of the bomsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOMSG(String value) {
        this.bomsg = value;
    }

    /**
     * Gets the value of the boemsge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOEMSGE() {
        return boemsge;
    }

    /**
     * Sets the value of the boemsge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOEMSGE(String value) {
        this.boemsge = value;
    }

}