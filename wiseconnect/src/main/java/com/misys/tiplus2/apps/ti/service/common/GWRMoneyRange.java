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
 * <p>Java class for GWRMoneyRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GWRMoneyRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowerAmount" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRMoneyNew" minOccurs="0"/>
 *         &lt;element name="HigherAmount" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRMoneyNew" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GWRMoneyRange", propOrder = {
    "lowerAmount",
    "higherAmount"
})
public class GWRMoneyRange {

    @XmlElement(name = "LowerAmount")
    protected GWRMoneyNew lowerAmount;
    @XmlElement(name = "HigherAmount")
    protected GWRMoneyNew higherAmount;

    /**
     * Gets the value of the lowerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link GWRMoneyNew }
     *     
     */
    public GWRMoneyNew getLowerAmount() {
        return lowerAmount;
    }

    /**
     * Sets the value of the lowerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRMoneyNew }
     *     
     */
    public void setLowerAmount(GWRMoneyNew value) {
        this.lowerAmount = value;
    }

    /**
     * Gets the value of the higherAmount property.
     * 
     * @return
     *     possible object is
     *     {@link GWRMoneyNew }
     *     
     */
    public GWRMoneyNew getHigherAmount() {
        return higherAmount;
    }

    /**
     * Sets the value of the higherAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRMoneyNew }
     *     
     */
    public void setHigherAmount(GWRMoneyNew value) {
        this.higherAmount = value;
    }

}
