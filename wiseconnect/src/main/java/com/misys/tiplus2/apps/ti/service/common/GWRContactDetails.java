//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 03:37:05 PM IST 
//


package com.misys.tiplus2.apps.ti.service.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contact details.
 * 
 * <p>Java class for GWRContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GWRContactDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailAddress" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWREmailAddress" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRPhoneNumber" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRFaxNumber" minOccurs="0"/>
 *         &lt;element name="TelexNumber" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRTelex" minOccurs="0"/>
 *         &lt;element name="TelexAnswerBack" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRTelexAnswerBack" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GWRContactDetails", propOrder = {
    "emailAddress",
    "telephoneNumber",
    "faxNumber",
    "telexNumber",
    "telexAnswerBack"
})
public class GWRContactDetails {

    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "TelephoneNumber")
    protected String telephoneNumber;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "TelexNumber")
    protected String telexNumber;
    @XmlElement(name = "TelexAnswerBack")
    protected String telexAnswerBack;

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the telexNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelexNumber() {
        return telexNumber;
    }

    /**
     * Sets the value of the telexNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelexNumber(String value) {
        this.telexNumber = value;
    }

    /**
     * Gets the value of the telexAnswerBack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelexAnswerBack() {
        return telexAnswerBack;
    }

    /**
     * Sets the value of the telexAnswerBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelexAnswerBack(String value) {
        this.telexAnswerBack = value;
    }

}