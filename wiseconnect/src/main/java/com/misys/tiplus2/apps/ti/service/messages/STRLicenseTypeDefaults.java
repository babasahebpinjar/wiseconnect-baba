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
import com.misys.tiplus2.apps.ti.service.common.GWRPeriod;
import com.misys.tiplus2.apps.ti.service.common.GWRProductType;
import com.misys.tiplus2.apps.ti.service.common.GWRUtilisedByNonPrincipal;


/**
 * .
 * 
 * <p>Java class for STRLicenseTypeDefaults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRLicenseTypeDefaults">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:messages.service.ti.apps.tiplus2.misys.com}GatewaySystemTailoring">
 *       &lt;sequence>
 *         &lt;element name="ProductType" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRProductType" minOccurs="0"/>
 *         &lt;element name="PrincipalLabel" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRLicenseTypePartyLabel" minOccurs="0"/>
 *         &lt;element name="NonPrincipalLabel" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRLicenseTypePartyLabel" minOccurs="0"/>
 *         &lt;element name="AllowMultipleLicenses" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="AllowOverdraws" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="AutomaticReinstatement" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="AmountTolerance" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRPercentAmount" minOccurs="0"/>
 *         &lt;element name="MultiCurrency" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="OverrideMultiCurrency" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="OverridePrincipal" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="OverrideNonPrincipal" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="OverrideReinstatement" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="PaymentDays" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRInteger" minOccurs="0"/>
 *         &lt;element name="UtilisedByNonPrincipal" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRUtilisedByNonPrincipal" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRPeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRLicenseTypeDefaults", propOrder = {
    "productType",
    "principalLabel",
    "nonPrincipalLabel",
    "allowMultipleLicenses",
    "allowOverdraws",
    "automaticReinstatement",
    "amountTolerance",
    "multiCurrency",
    "overrideMultiCurrency",
    "overridePrincipal",
    "overrideNonPrincipal",
    "overrideReinstatement",
    "paymentDays",
    "utilisedByNonPrincipal",
    "validityPeriod"
})
public class STRLicenseTypeDefaults
    extends GatewaySystemTailoring
{

    @XmlElement(name = "ProductType")
    protected GWRProductType productType;
    @XmlElement(name = "PrincipalLabel")
    protected String principalLabel;
    @XmlElement(name = "NonPrincipalLabel")
    protected String nonPrincipalLabel;
    @XmlElement(name = "AllowMultipleLicenses")
    protected EnigmaBoolean allowMultipleLicenses;
    @XmlElement(name = "AllowOverdraws")
    protected EnigmaBoolean allowOverdraws;
    @XmlElement(name = "AutomaticReinstatement")
    protected EnigmaBoolean automaticReinstatement;
    @XmlElement(name = "AmountTolerance")
    protected BigDecimal amountTolerance;
    @XmlElement(name = "MultiCurrency")
    protected EnigmaBoolean multiCurrency;
    @XmlElement(name = "OverrideMultiCurrency")
    protected EnigmaBoolean overrideMultiCurrency;
    @XmlElement(name = "OverridePrincipal")
    protected EnigmaBoolean overridePrincipal;
    @XmlElement(name = "OverrideNonPrincipal")
    protected EnigmaBoolean overrideNonPrincipal;
    @XmlElement(name = "OverrideReinstatement")
    protected EnigmaBoolean overrideReinstatement;
    @XmlElementRef(name = "PaymentDays", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<Integer> paymentDays;
    @XmlElement(name = "UtilisedByNonPrincipal")
    protected GWRUtilisedByNonPrincipal utilisedByNonPrincipal;
    @XmlElement(name = "ValidityPeriod")
    protected GWRPeriod validityPeriod;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link GWRProductType }
     *     
     */
    public GWRProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRProductType }
     *     
     */
    public void setProductType(GWRProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the principalLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalLabel() {
        return principalLabel;
    }

    /**
     * Sets the value of the principalLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalLabel(String value) {
        this.principalLabel = value;
    }

    /**
     * Gets the value of the nonPrincipalLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonPrincipalLabel() {
        return nonPrincipalLabel;
    }

    /**
     * Sets the value of the nonPrincipalLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonPrincipalLabel(String value) {
        this.nonPrincipalLabel = value;
    }

    /**
     * Gets the value of the allowMultipleLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getAllowMultipleLicenses() {
        return allowMultipleLicenses;
    }

    /**
     * Sets the value of the allowMultipleLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setAllowMultipleLicenses(EnigmaBoolean value) {
        this.allowMultipleLicenses = value;
    }

    /**
     * Gets the value of the allowOverdraws property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getAllowOverdraws() {
        return allowOverdraws;
    }

    /**
     * Sets the value of the allowOverdraws property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setAllowOverdraws(EnigmaBoolean value) {
        this.allowOverdraws = value;
    }

    /**
     * Gets the value of the automaticReinstatement property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getAutomaticReinstatement() {
        return automaticReinstatement;
    }

    /**
     * Sets the value of the automaticReinstatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setAutomaticReinstatement(EnigmaBoolean value) {
        this.automaticReinstatement = value;
    }

    /**
     * Gets the value of the amountTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountTolerance() {
        return amountTolerance;
    }

    /**
     * Sets the value of the amountTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountTolerance(BigDecimal value) {
        this.amountTolerance = value;
    }

    /**
     * Gets the value of the multiCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getMultiCurrency() {
        return multiCurrency;
    }

    /**
     * Sets the value of the multiCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setMultiCurrency(EnigmaBoolean value) {
        this.multiCurrency = value;
    }

    /**
     * Gets the value of the overrideMultiCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getOverrideMultiCurrency() {
        return overrideMultiCurrency;
    }

    /**
     * Sets the value of the overrideMultiCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setOverrideMultiCurrency(EnigmaBoolean value) {
        this.overrideMultiCurrency = value;
    }

    /**
     * Gets the value of the overridePrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getOverridePrincipal() {
        return overridePrincipal;
    }

    /**
     * Sets the value of the overridePrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setOverridePrincipal(EnigmaBoolean value) {
        this.overridePrincipal = value;
    }

    /**
     * Gets the value of the overrideNonPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getOverrideNonPrincipal() {
        return overrideNonPrincipal;
    }

    /**
     * Sets the value of the overrideNonPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setOverrideNonPrincipal(EnigmaBoolean value) {
        this.overrideNonPrincipal = value;
    }

    /**
     * Gets the value of the overrideReinstatement property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getOverrideReinstatement() {
        return overrideReinstatement;
    }

    /**
     * Sets the value of the overrideReinstatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setOverrideReinstatement(EnigmaBoolean value) {
        this.overrideReinstatement = value;
    }

    /**
     * Gets the value of the paymentDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaymentDays() {
        return paymentDays;
    }

    /**
     * Sets the value of the paymentDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaymentDays(JAXBElement<Integer> value) {
        this.paymentDays = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the utilisedByNonPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link GWRUtilisedByNonPrincipal }
     *     
     */
    public GWRUtilisedByNonPrincipal getUtilisedByNonPrincipal() {
        return utilisedByNonPrincipal;
    }

    /**
     * Sets the value of the utilisedByNonPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRUtilisedByNonPrincipal }
     *     
     */
    public void setUtilisedByNonPrincipal(GWRUtilisedByNonPrincipal value) {
        this.utilisedByNonPrincipal = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link GWRPeriod }
     *     
     */
    public GWRPeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRPeriod }
     *     
     */
    public void setValidityPeriod(GWRPeriod value) {
        this.validityPeriod = value;
    }

}
