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
 * Finance Invoice Table
 * 
 * <p>Java class for ExtEventFinanceInvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtEventFinanceInvoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INVOICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FINTENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATDAT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="MATAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtEventFinanceInvoiceType", propOrder = {
    "invoice",
    "finteno",
    "matdat",
    "matamt"
})
public class ExtEventFinanceInvoiceType {

    @XmlElement(name = "INVOICE")
    protected String invoice;
    @XmlElement(name = "FINTENO")
    protected String finteno;
    @XmlElement(name = "MATDAT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar matdat;
    @XmlElement(name = "MATAMT")
    protected String matamt;

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVOICE() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVOICE(String value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the finteno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINTENO() {
        return finteno;
    }

    /**
     * Sets the value of the finteno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINTENO(String value) {
        this.finteno = value;
    }

    /**
     * Gets the value of the matdat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMATDAT() {
        return matdat;
    }

    /**
     * Sets the value of the matdat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMATDAT(XMLGregorianCalendar value) {
        this.matdat = value;
    }

    /**
     * Gets the value of the matamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATAMT() {
        return matamt;
    }

    /**
     * Sets the value of the matamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATAMT(String value) {
        this.matamt = value;
    }

}