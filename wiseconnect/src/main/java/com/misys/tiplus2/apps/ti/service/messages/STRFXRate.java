//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 03:37:05 PM IST 
//


package com.misys.tiplus2.apps.ti.service.messages;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.misys.tiplus2.apps.ti.service.common.EnigmaBoolean;
import com.misys.tiplus2.apps.ti.service.common.GWRExchangeRateBy;


/**
 * .
 * 
 * <p>Java class for STRFXRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRFXRate">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:messages.service.ti.apps.tiplus2.misys.com}GatewayStatic">
 *       &lt;sequence>
 *         &lt;element name="FxRateCode" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRFxRateCode" minOccurs="0"/>
 *         &lt;element name="BankingEntity" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBranch" minOccurs="0"/>
 *         &lt;element name="Currency" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRCurrency" minOccurs="0"/>
 *         &lt;element name="BuyExchangeRate" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWREQ3ExchangeRate" minOccurs="0"/>
 *         &lt;element name="BuyPercentSpread" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRSpreadPercent" minOccurs="0"/>
 *         &lt;element name="BuySpreadRate" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRSpreadRate" minOccurs="0"/>
 *         &lt;element name="SellExchangeRate" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWREQ3ExchangeRate" minOccurs="0"/>
 *         &lt;element name="SellPercentSpread" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRSpreadPercent" minOccurs="0"/>
 *         &lt;element name="SellSpreadRate" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRSpreadRate" minOccurs="0"/>
 *         &lt;element name="BuyRateSpecific" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRExchangeRateBy" minOccurs="0"/>
 *         &lt;element name="SellRateSpecific" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRExchangeRateBy" minOccurs="0"/>
 *         &lt;element name="BaseCurrency" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRCurrency" minOccurs="0"/>
 *         &lt;element name="Reciprocal" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRFXRate", propOrder = {
    "fxRateCode",
    "bankingEntity",
    "currency",
    "buyExchangeRate",
    "buyPercentSpread",
    "buySpreadRate",
    "sellExchangeRate",
    "sellPercentSpread",
    "sellSpreadRate",
    "buyRateSpecific",
    "sellRateSpecific",
    "baseCurrency",
    "reciprocal"
})

public class STRFXRate
    extends GatewayStatic
{

    @XmlElement(name = "FxRateCode")
    protected String fxRateCode;
    @XmlElement(name = "BankingEntity")
    protected String bankingEntity;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "BuyExchangeRate")
    protected BigDecimal buyExchangeRate;
    @XmlElement(name = "BuyPercentSpread")
    protected BigDecimal buyPercentSpread;
    @XmlElement(name = "BuySpreadRate")
    protected BigDecimal buySpreadRate;
    @XmlElement(name = "SellExchangeRate")
    protected BigDecimal sellExchangeRate;
    @XmlElement(name = "SellPercentSpread")
    protected BigDecimal sellPercentSpread;
    @XmlElement(name = "SellSpreadRate")
    protected BigDecimal sellSpreadRate;
    @XmlElement(name = "BuyRateSpecific")
    protected GWRExchangeRateBy buyRateSpecific;
    @XmlElement(name = "SellRateSpecific")
    protected GWRExchangeRateBy sellRateSpecific;
    @XmlElement(name = "BaseCurrency")
    protected String baseCurrency;
    @XmlElement(name = "Reciprocal")
    protected EnigmaBoolean reciprocal;

    /**
     * Gets the value of the fxRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxRateCode() {
        return fxRateCode;
    }

    /**
     * Sets the value of the fxRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxRateCode(String value) {
        this.fxRateCode = value;
    }

    /**
     * Gets the value of the bankingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankingEntity() {
        return bankingEntity;
    }

    /**
     * Sets the value of the bankingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankingEntity(String value) {
        this.bankingEntity = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the buyExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuyExchangeRate() {
        return buyExchangeRate;
    }

    /**
     * Sets the value of the buyExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuyExchangeRate(BigDecimal value) {
        this.buyExchangeRate = value;
    }

    /**
     * Gets the value of the buyPercentSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuyPercentSpread() {
        return buyPercentSpread;
    }

    /**
     * Sets the value of the buyPercentSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuyPercentSpread(BigDecimal value) {
        this.buyPercentSpread = value;
    }

    /**
     * Gets the value of the buySpreadRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuySpreadRate() {
        return buySpreadRate;
    }

    /**
     * Sets the value of the buySpreadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuySpreadRate(BigDecimal value) {
        this.buySpreadRate = value;
    }

    /**
     * Gets the value of the sellExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellExchangeRate() {
        return sellExchangeRate;
    }

    /**
     * Sets the value of the sellExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellExchangeRate(BigDecimal value) {
        this.sellExchangeRate = value;
    }

    /**
     * Gets the value of the sellPercentSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellPercentSpread() {
        return sellPercentSpread;
    }

    /**
     * Sets the value of the sellPercentSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellPercentSpread(BigDecimal value) {
        this.sellPercentSpread = value;
    }

    /**
     * Gets the value of the sellSpreadRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellSpreadRate() {
        return sellSpreadRate;
    }

    /**
     * Sets the value of the sellSpreadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellSpreadRate(BigDecimal value) {
        this.sellSpreadRate = value;
    }

    /**
     * Gets the value of the buyRateSpecific property.
     * 
     * @return
     *     possible object is
     *     {@link GWRExchangeRateBy }
     *     
     */
    public GWRExchangeRateBy getBuyRateSpecific() {
        return buyRateSpecific;
    }

    /**
     * Sets the value of the buyRateSpecific property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRExchangeRateBy }
     *     
     */
    public void setBuyRateSpecific(GWRExchangeRateBy value) {
        this.buyRateSpecific = value;
    }

    /**
     * Gets the value of the sellRateSpecific property.
     * 
     * @return
     *     possible object is
     *     {@link GWRExchangeRateBy }
     *     
     */
    public GWRExchangeRateBy getSellRateSpecific() {
        return sellRateSpecific;
    }

    /**
     * Sets the value of the sellRateSpecific property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRExchangeRateBy }
     *     
     */
    public void setSellRateSpecific(GWRExchangeRateBy value) {
        this.sellRateSpecific = value;
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
     * Gets the value of the reciprocal property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getReciprocal() {
        return reciprocal;
    }

    /**
     * Sets the value of the reciprocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setReciprocal(EnigmaBoolean value) {
        this.reciprocal = value;
    }

}