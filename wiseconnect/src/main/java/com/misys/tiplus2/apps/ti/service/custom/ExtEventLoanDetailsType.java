//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.16 at 03:54:00 PM IST 
//


package com.misys.tiplus2.apps.ti.service.custom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Loan Details
 * 
 * <p>Java class for ExtEventLoanDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtEventLoanDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DEALREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VALDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtEventLoanDetailsType", propOrder = {
    "dealref",
    "reamount",
    "valdate"
})
public class ExtEventLoanDetailsType {

    @XmlElement(name = "DEALREF")
    protected String dealref;
    @XmlElement(name = "REAMOUNT")
    protected String reamount;
    @XmlElement(name = "VALDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdate;

    /**
     * Gets the value of the dealref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEALREF() {
        return dealref;
    }

    /**
     * Sets the value of the dealref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEALREF(String value) {
        this.dealref = value;
    }

    /**
     * Gets the value of the reamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREAMOUNT() {
        return reamount;
    }

    /**
     * Sets the value of the reamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREAMOUNT(String value) {
        this.reamount = value;
    }

    /**
     * Gets the value of the valdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVALDATE() {
        return valdate;
    }

    /**
     * Sets the value of the valdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVALDATE(XMLGregorianCalendar value) {
        this.valdate = value;
    }

}
