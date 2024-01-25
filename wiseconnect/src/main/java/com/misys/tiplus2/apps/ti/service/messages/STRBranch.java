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
import javax.xml.bind.annotation.XmlType;
import com.misys.tiplus2.apps.ti.service.common.EnigmaBoolean;
import com.misys.tiplus2.apps.ti.service.common.GWRBranchAddressDetails;
import com.misys.tiplus2.apps.ti.service.common.GWRBranchType;
import com.misys.tiplus2.apps.ti.service.common.GWRContactDetails;


/**
 * Branch.
 * 
 * <p>Java class for STRBranch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRBranch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:messages.service.ti.apps.tiplus2.misys.com}GatewayStatic">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBranchCode" minOccurs="0"/>
 *         &lt;element name="BranchNumber" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBranchNumber" minOccurs="0"/>
 *         &lt;element name="MainBankingEntity" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRMainBankingEntity" minOccurs="0"/>
 *         &lt;element name="ParentBranch" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBranch" minOccurs="0"/>
 *         &lt;element name="BankingGroup" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="BankingBusiness" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="AutonomousBankingEntity" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="NonTransactionBranch" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="IsMainBankingEntity" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="InternalCustomerMnemonic" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRCustomerMnemonic" minOccurs="0"/>
 *         &lt;element name="BaseCurrency" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRCurrency" minOccurs="0"/>
 *         &lt;element name="ExchangeRateFormat" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRExchangeRateFormat" minOccurs="0"/>
 *         &lt;element name="ExchangeRateTolerance" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRInteger0to100" minOccurs="0"/>
 *         &lt;element name="LocalCurrency" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRCurrency" minOccurs="0"/>
 *         &lt;element name="SwiftAddress" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRSwiftAddress" minOccurs="0"/>
 *         &lt;element name="BranchFurtherId" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBranchFurtherId" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWREntityType" minOccurs="0"/>
 *         &lt;element name="SwiftSenderBranchType" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBranchType" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRCountry" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRTimeZone" minOccurs="0"/>
 *         &lt;element name="InheritContactDetails" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="ContactDetails" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRContactDetails" minOccurs="0"/>
 *         &lt;element name="AddressDetails" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBranchAddressDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRBranch", propOrder = {
    "code",
    "branchNumber",
    "mainBankingEntity",
    "parentBranch",
    "bankingGroup",
    "bankingBusiness",
    "autonomousBankingEntity",
    "nonTransactionBranch",
    "isMainBankingEntity",
    "internalCustomerMnemonic",
    "baseCurrency",
    "exchangeRateFormat",
    "exchangeRateTolerance",
    "localCurrency",
    "swiftAddress",
    "branchFurtherId",
    "entityType",
    "swiftSenderBranchType",
    "country",
    "timeZone",
    "inheritContactDetails",
    "contactDetails",
    "addressDetails"
})
public class STRBranch
    extends GatewayStatic
{

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "BranchNumber")
    protected String branchNumber;
    @XmlElement(name = "MainBankingEntity")
    protected String mainBankingEntity;
    @XmlElement(name = "ParentBranch")
    protected String parentBranch;
    @XmlElement(name = "BankingGroup")
    protected EnigmaBoolean bankingGroup;
    @XmlElement(name = "BankingBusiness")
    protected EnigmaBoolean bankingBusiness;
    @XmlElement(name = "AutonomousBankingEntity")
    protected EnigmaBoolean autonomousBankingEntity;
    @XmlElement(name = "NonTransactionBranch")
    protected EnigmaBoolean nonTransactionBranch;
    @XmlElement(name = "IsMainBankingEntity")
    protected EnigmaBoolean isMainBankingEntity;
    @XmlElement(name = "InternalCustomerMnemonic")
    protected String internalCustomerMnemonic;
    @XmlElement(name = "BaseCurrency")
    protected String baseCurrency;
    @XmlElement(name = "ExchangeRateFormat")
    protected String exchangeRateFormat;
    @XmlElementRef(name = "ExchangeRateTolerance", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<Integer> exchangeRateTolerance;
    @XmlElement(name = "LocalCurrency")
    protected String localCurrency;
    @XmlElement(name = "SwiftAddress")
    protected String swiftAddress;
    @XmlElement(name = "BranchFurtherId")
    protected String branchFurtherId;
    @XmlElement(name = "EntityType")
    protected String entityType;
    @XmlElement(name = "SwiftSenderBranchType")
    protected GWRBranchType swiftSenderBranchType;
    @XmlElementRef(name = "Country", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<String> country;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "InheritContactDetails")
    protected EnigmaBoolean inheritContactDetails;
    @XmlElement(name = "ContactDetails")
    protected GWRContactDetails contactDetails;
    @XmlElement(name = "AddressDetails")
    protected GWRBranchAddressDetails addressDetails;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the branchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchNumber() {
        return branchNumber;
    }

    /**
     * Sets the value of the branchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchNumber(String value) {
        this.branchNumber = value;
    }

    /**
     * Gets the value of the mainBankingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainBankingEntity() {
        return mainBankingEntity;
    }

    /**
     * Sets the value of the mainBankingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainBankingEntity(String value) {
        this.mainBankingEntity = value;
    }

    /**
     * Gets the value of the parentBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentBranch() {
        return parentBranch;
    }

    /**
     * Sets the value of the parentBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentBranch(String value) {
        this.parentBranch = value;
    }

    /**
     * Gets the value of the bankingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getBankingGroup() {
        return bankingGroup;
    }

    /**
     * Sets the value of the bankingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setBankingGroup(EnigmaBoolean value) {
        this.bankingGroup = value;
    }

    /**
     * Gets the value of the bankingBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getBankingBusiness() {
        return bankingBusiness;
    }

    /**
     * Sets the value of the bankingBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setBankingBusiness(EnigmaBoolean value) {
        this.bankingBusiness = value;
    }

    /**
     * Gets the value of the autonomousBankingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getAutonomousBankingEntity() {
        return autonomousBankingEntity;
    }

    /**
     * Sets the value of the autonomousBankingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setAutonomousBankingEntity(EnigmaBoolean value) {
        this.autonomousBankingEntity = value;
    }

    /**
     * Gets the value of the nonTransactionBranch property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getNonTransactionBranch() {
        return nonTransactionBranch;
    }

    /**
     * Sets the value of the nonTransactionBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setNonTransactionBranch(EnigmaBoolean value) {
        this.nonTransactionBranch = value;
    }

    /**
     * Gets the value of the isMainBankingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getIsMainBankingEntity() {
        return isMainBankingEntity;
    }

    /**
     * Sets the value of the isMainBankingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setIsMainBankingEntity(EnigmaBoolean value) {
        this.isMainBankingEntity = value;
    }

    /**
     * Gets the value of the internalCustomerMnemonic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalCustomerMnemonic() {
        return internalCustomerMnemonic;
    }

    /**
     * Sets the value of the internalCustomerMnemonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalCustomerMnemonic(String value) {
        this.internalCustomerMnemonic = value;
    }

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrency(String value) {
        this.baseCurrency = value;
    }

    /**
     * Gets the value of the exchangeRateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateFormat() {
        return exchangeRateFormat;
    }

    /**
     * Sets the value of the exchangeRateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateFormat(String value) {
        this.exchangeRateFormat = value;
    }

    /**
     * Gets the value of the exchangeRateTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExchangeRateTolerance() {
        return exchangeRateTolerance;
    }

    /**
     * Sets the value of the exchangeRateTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExchangeRateTolerance(JAXBElement<Integer> value) {
        this.exchangeRateTolerance = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the localCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCurrency() {
        return localCurrency;
    }

    /**
     * Sets the value of the localCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCurrency(String value) {
        this.localCurrency = value;
    }

    /**
     * Gets the value of the swiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftAddress() {
        return swiftAddress;
    }

    /**
     * Sets the value of the swiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiftAddress(String value) {
        this.swiftAddress = value;
    }

    /**
     * Gets the value of the branchFurtherId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchFurtherId() {
        return branchFurtherId;
    }

    /**
     * Sets the value of the branchFurtherId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchFurtherId(String value) {
        this.branchFurtherId = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the swiftSenderBranchType property.
     * 
     * @return
     *     possible object is
     *     {@link GWRBranchType }
     *     
     */
    public GWRBranchType getSwiftSenderBranchType() {
        return swiftSenderBranchType;
    }

    /**
     * Sets the value of the swiftSenderBranchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRBranchType }
     *     
     */
    public void setSwiftSenderBranchType(GWRBranchType value) {
        this.swiftSenderBranchType = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the inheritContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getInheritContactDetails() {
        return inheritContactDetails;
    }

    /**
     * Sets the value of the inheritContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setInheritContactDetails(EnigmaBoolean value) {
        this.inheritContactDetails = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GWRContactDetails }
     *     
     */
    public GWRContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRContactDetails }
     *     
     */
    public void setContactDetails(GWRContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the addressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GWRBranchAddressDetails }
     *     
     */
    public GWRBranchAddressDetails getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRBranchAddressDetails }
     *     
     */
    public void setAddressDetails(GWRBranchAddressDetails value) {
        this.addressDetails = value;
    }

}