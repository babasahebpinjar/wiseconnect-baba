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
import javax.xml.datatype.XMLGregorianCalendar;
import com.misys.tiplus2.apps.ti.service.common.EnigmaBoolean;
import com.misys.tiplus2.apps.ti.service.common.GWRApplicableRules;
import com.misys.tiplus2.apps.ti.service.common.GWRParty;
import com.misys.tiplus2.apps.ti.service.common.GWRRenewal;


/**
 * <p>Java class for GWREGS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GWREGS">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:messages.service.ti.apps.tiplus2.misys.com}GWRELCNEW">
 *       &lt;sequence>
 *         &lt;element name="Financial" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="NotPayableBeforeDate" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRDate" minOccurs="0"/>
 *         &lt;element name="PartialDrawingsAllowed" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="Trade" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="AdviseDirect" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="PrincipalBank" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRParty" minOccurs="0"/>
 *         &lt;element name="InstructionApplicableRules" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRApplicableRules" minOccurs="0"/>
 *         &lt;element name="ConfirmingBank" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRParty" minOccurs="0"/>
 *         &lt;element name="UseFreeFormat" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="Renewal" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRRenewal" minOccurs="0"/>
 *         &lt;element name="OtherProductType" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBranchProductType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GWREGS", propOrder = {
    "financial",
    "notPayableBeforeDate",
    "partialDrawingsAllowed",
    "trade",
    "adviseDirect",
    "principalBank",
    "instructionApplicableRules",
    "confirmingBank",
    "useFreeFormat",
    "renewal",
    "otherProductType"
})
@XmlSeeAlso({
    GWREG.class
})
public class GWREGS
    extends GWRELCNEW
{

    @XmlElement(name = "Financial")
    protected EnigmaBoolean financial;
    @XmlElementRef(name = "NotPayableBeforeDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> notPayableBeforeDate;
    @XmlElement(name = "PartialDrawingsAllowed")
    protected EnigmaBoolean partialDrawingsAllowed;
    @XmlElement(name = "Trade")
    protected EnigmaBoolean trade;
    @XmlElement(name = "AdviseDirect")
    protected EnigmaBoolean adviseDirect;
    @XmlElement(name = "PrincipalBank")
    protected GWRParty principalBank;
    @XmlElement(name = "InstructionApplicableRules")
    protected GWRApplicableRules instructionApplicableRules;
    @XmlElement(name = "ConfirmingBank")
    protected GWRParty confirmingBank;
    @XmlElement(name = "UseFreeFormat")
    protected EnigmaBoolean useFreeFormat;
    @XmlElement(name = "Renewal")
    protected GWRRenewal renewal;
    @XmlElement(name = "OtherProductType")
    protected String otherProductType;

    /**
     * Gets the value of the financial property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getFinancial() {
        return financial;
    }

    /**
     * Sets the value of the financial property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setFinancial(EnigmaBoolean value) {
        this.financial = value;
    }

    /**
     * Gets the value of the notPayableBeforeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNotPayableBeforeDate() {
        return notPayableBeforeDate;
    }

    /**
     * Sets the value of the notPayableBeforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNotPayableBeforeDate(JAXBElement<XMLGregorianCalendar> value) {
        this.notPayableBeforeDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the partialDrawingsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getPartialDrawingsAllowed() {
        return partialDrawingsAllowed;
    }

    /**
     * Sets the value of the partialDrawingsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setPartialDrawingsAllowed(EnigmaBoolean value) {
        this.partialDrawingsAllowed = value;
    }

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setTrade(EnigmaBoolean value) {
        this.trade = value;
    }

    /**
     * Gets the value of the adviseDirect property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getAdviseDirect() {
        return adviseDirect;
    }

    /**
     * Sets the value of the adviseDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setAdviseDirect(EnigmaBoolean value) {
        this.adviseDirect = value;
    }

    /**
     * Gets the value of the principalBank property.
     * 
     * @return
     *     possible object is
     *     {@link GWRParty }
     *     
     */
    public GWRParty getPrincipalBank() {
        return principalBank;
    }

    /**
     * Sets the value of the principalBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRParty }
     *     
     */
    public void setPrincipalBank(GWRParty value) {
        this.principalBank = value;
    }

    /**
     * Gets the value of the instructionApplicableRules property.
     * 
     * @return
     *     possible object is
     *     {@link GWRApplicableRules }
     *     
     */
    public GWRApplicableRules getInstructionApplicableRules() {
        return instructionApplicableRules;
    }

    /**
     * Sets the value of the instructionApplicableRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRApplicableRules }
     *     
     */
    public void setInstructionApplicableRules(GWRApplicableRules value) {
        this.instructionApplicableRules = value;
    }

    /**
     * Gets the value of the confirmingBank property.
     * 
     * @return
     *     possible object is
     *     {@link GWRParty }
     *     
     */
    public GWRParty getConfirmingBank() {
        return confirmingBank;
    }

    /**
     * Sets the value of the confirmingBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRParty }
     *     
     */
    public void setConfirmingBank(GWRParty value) {
        this.confirmingBank = value;
    }

    /**
     * Gets the value of the useFreeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getUseFreeFormat() {
        return useFreeFormat;
    }

    /**
     * Sets the value of the useFreeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setUseFreeFormat(EnigmaBoolean value) {
        this.useFreeFormat = value;
    }

    /**
     * Gets the value of the renewal property.
     * 
     * @return
     *     possible object is
     *     {@link GWRRenewal }
     *     
     */
    public GWRRenewal getRenewal() {
        return renewal;
    }

    /**
     * Sets the value of the renewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRRenewal }
     *     
     */
    public void setRenewal(GWRRenewal value) {
        this.renewal = value;
    }

    /**
     * Gets the value of the otherProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherProductType() {
        return otherProductType;
    }

    /**
     * Sets the value of the otherProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherProductType(String value) {
        this.otherProductType = value;
    }

}