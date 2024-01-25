//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 03:37:05 PM IST 
//


package com.misys.tiplus2.apps.ti.service.messages;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.misys.tiplus2.apps.ti.service.common.EnigmaBoolean;


/**
 * Response pane for the FX contract enquiry.
 * 
 * <p>Java class for FXContractEnquiryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FXContractEnquiryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExchangeRate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999"/>
 *               &lt;fractionDigits value="20"/>
 *               &lt;totalDigits value="28"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AvailableAmount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AvailableCurrency" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StartDate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpiryDate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CheckedInbackoffice" type="{urn:common.service.ti.apps.tiplus2.misys.com}EnigmaBoolean" minOccurs="0"/>
 *         &lt;element name="ErrorCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Error" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsError" type="{urn:common.service.ti.apps.tiplus2.misys.com}EnigmaBoolean" minOccurs="0"/>
 *         &lt;element name="Reciprocal" type="{urn:common.service.ti.apps.tiplus2.misys.com}EnigmaBoolean" minOccurs="0"/>
 *         &lt;element name="BaseCurrency" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
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
@XmlType(name = "FXContractEnquiryResponse", propOrder = {
    "exchangeRate",
    "availableAmount",
    "availableCurrency",
    "startDate",
    "expiryDate",
    "checkedInbackoffice",
    "errorCode",
    "error",
    "isError",
    "reciprocal",
    "baseCurrency"
})
public class FXContractEnquiryResponse {
    @XmlElementRef(name = "ExchangeRate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> exchangeRate;
    @XmlElement(name = "AvailableAmount")
    protected String availableAmount;
    @XmlElementRef(name = "AvailableCurrency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<String> availableCurrency;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "ExpiryDate")
    protected String expiryDate;
    @XmlElementRef(name = "CheckedInbackoffice", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<EnigmaBoolean> checkedInbackoffice;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "Error")
    protected String error;
    @XmlElementRef(name = "IsError", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<EnigmaBoolean> isError;
    @XmlElementRef(name = "Reciprocal", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<EnigmaBoolean> reciprocal;
    @XmlElementRef(name = "BaseCurrency", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<String> baseCurrency;

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setExchangeRate(JAXBElement<BigDecimal> value) {
        this.exchangeRate = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the availableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableAmount() {
        return availableAmount;
    }

    /**
     * Sets the value of the availableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableAmount(String value) {
        this.availableAmount = value;
    }

    /**
     * Gets the value of the availableCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailableCurrency() {
        return availableCurrency;
    }

    /**
     * Sets the value of the availableCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailableCurrency(JAXBElement<String> value) {
        this.availableCurrency = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the checkedInbackoffice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnigmaBoolean }{@code >}
     *     
     */
    public JAXBElement<EnigmaBoolean> getCheckedInbackoffice() {
        return checkedInbackoffice;
    }

    /**
     * Sets the value of the checkedInbackoffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnigmaBoolean }{@code >}
     *     
     */
    public void setCheckedInbackoffice(JAXBElement<EnigmaBoolean> value) {
        this.checkedInbackoffice = ((JAXBElement<EnigmaBoolean> ) value);
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnigmaBoolean }{@code >}
     *     
     */
    public JAXBElement<EnigmaBoolean> getIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnigmaBoolean }{@code >}
     *     
     */
    public void setIsError(JAXBElement<EnigmaBoolean> value) {
        this.isError = ((JAXBElement<EnigmaBoolean> ) value);
    }

    /**
     * Gets the value of the reciprocal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnigmaBoolean }{@code >}
     *     
     */
    public JAXBElement<EnigmaBoolean> getReciprocal() {
        return reciprocal;
    }

    /**
     * Sets the value of the reciprocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnigmaBoolean }{@code >}
     *     
     */
    public void setReciprocal(JAXBElement<EnigmaBoolean> value) {
        this.reciprocal = ((JAXBElement<EnigmaBoolean> ) value);
    }

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseCurrency(JAXBElement<String> value) {
        this.baseCurrency = ((JAXBElement<String> ) value);
    }

}