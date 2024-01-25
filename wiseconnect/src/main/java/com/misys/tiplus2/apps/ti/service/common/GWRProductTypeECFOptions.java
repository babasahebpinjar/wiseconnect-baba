//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 03:37:05 PM IST 
//


package com.misys.tiplus2.apps.ti.service.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GWRProductTypeECFOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GWRProductTypeECFOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailablePercentage" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRPercentAmount" minOccurs="0"/>
 *         &lt;element name="RoundingAllowed" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GWRProductTypeECFOptions", propOrder = {
    "availablePercentage",
    "roundingAllowed"
})
public class GWRProductTypeECFOptions {

    @XmlElement(name = "AvailablePercentage")
    protected BigDecimal availablePercentage;
    @XmlElement(name = "RoundingAllowed")
    protected EnigmaBoolean roundingAllowed;

    /**
     * Gets the value of the availablePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailablePercentage() {
        return availablePercentage;
    }

    /**
     * Sets the value of the availablePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailablePercentage(BigDecimal value) {
        this.availablePercentage = value;
    }

    /**
     * Gets the value of the roundingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getRoundingAllowed() {
        return roundingAllowed;
    }

    /**
     * Sets the value of the roundingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setRoundingAllowed(EnigmaBoolean value) {
        this.roundingAllowed = value;
    }

}