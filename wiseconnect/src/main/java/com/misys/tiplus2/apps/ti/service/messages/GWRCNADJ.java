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


/**
 * .
 * 
 * <p>Java class for GWRCNADJ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GWRCNADJ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:messages.service.ti.apps.tiplus2.misys.com}GatewayRCreditNoteBaseDefine">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentDate" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRDate" minOccurs="0"/>
 *         &lt;element name="AdjustmentNarrative" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRText6x35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GWRCNADJ", propOrder = {
    "adjustmentDate",
    "adjustmentNarrative"
})
@XmlSeeAlso({
    TFCRNADJ.class
})
public class GWRCNADJ
    extends GatewayRCreditNoteBaseDefine
{

    @XmlElementRef(name = "AdjustmentDate", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> adjustmentDate;
    @XmlElement(name = "AdjustmentNarrative")
    protected String adjustmentNarrative;

    /**
     * Gets the value of the adjustmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAdjustmentDate() {
        return adjustmentDate;
    }

    /**
     * Sets the value of the adjustmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAdjustmentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.adjustmentDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the adjustmentNarrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentNarrative() {
        return adjustmentNarrative;
    }

    /**
     * Sets the value of the adjustmentNarrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentNarrative(String value) {
        this.adjustmentNarrative = value;
    }

}
