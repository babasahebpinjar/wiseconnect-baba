//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 03:37:05 PM IST 
//


package com.misys.tiplus2.apps.ti.service.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.misys.tiplus2.apps.ti.service.common.GWRParty;


/**
 * TSDS-395 (PG) :: removed EBankMasterRef.
 * 
 * <p>Java class for GWR711 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GWR711">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:messages.service.ti.apps.tiplus2.misys.com}GatewayEventR">
 *       &lt;sequence>
 *         &lt;element name="CancelRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sender" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRParty" minOccurs="0"/>
 *         &lt;element name="ResponseType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="R"/>
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResponseDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eBankMasterRef" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWREBankReference" minOccurs="0"/>
 *         &lt;element name="eBankEventRef" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWREBankReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GWR711", propOrder = {
    "cancelRef",
    "sender",
    "responseType",
    "responseDetails",
    "eBankMasterRef",
    "eBankEventRef"
})
@XmlSeeAlso({
    TFELCBCR.class
})
public class GWR711
    extends GatewayEventR
{

    @XmlElement(name = "CancelRef")
    protected String cancelRef;
    @XmlElement(name = "Sender")
    protected GWRParty sender;
    @XmlElementRef(name = "ResponseType", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<String> responseType;
    @XmlElement(name = "ResponseDetails")
    protected String responseDetails;
    protected String eBankMasterRef;
    protected String eBankEventRef;

    /**
     * Gets the value of the cancelRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelRef() {
        return cancelRef;
    }

    /**
     * Sets the value of the cancelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelRef(String value) {
        this.cancelRef = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link GWRParty }
     *     
     */
    public GWRParty getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRParty }
     *     
     */
    public void setSender(GWRParty value) {
        this.sender = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseType(JAXBElement<String> value) {
        this.responseType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the responseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDetails() {
        return responseDetails;
    }

    /**
     * Sets the value of the responseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDetails(String value) {
        this.responseDetails = value;
    }

    /**
     * Gets the value of the eBankMasterRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBankMasterRef() {
        return eBankMasterRef;
    }

    /**
     * Sets the value of the eBankMasterRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBankMasterRef(String value) {
        this.eBankMasterRef = value;
    }

    /**
     * Gets the value of the eBankEventRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBankEventRef() {
        return eBankEventRef;
    }

    /**
     * Sets the value of the eBankEventRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBankEventRef(String value) {
        this.eBankEventRef = value;
    }

}
