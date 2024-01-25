//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 03:00:45 PM IST 
//


package com.misys.tiplus2.services.control;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcknowledgementHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Status" type="{urn:control.services.tiplus2.misys.com}StatusEnum"/>
 *                   &lt;element name="TargetSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="CorrelationId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="48"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TargetSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "acknowledgementHeader"
})
@XmlRootElement(name = "Acknowledgement")
public class Acknowledgement {

    @XmlElement(name = "AcknowledgementHeader", required = true)
    protected Acknowledgement.AcknowledgementHeader acknowledgementHeader;

    /**
     * Gets the value of the acknowledgementHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Acknowledgement.AcknowledgementHeader }
     *     
     */
    public Acknowledgement.AcknowledgementHeader getAcknowledgementHeader() {
        return acknowledgementHeader;
    }

    /**
     * Sets the value of the acknowledgementHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acknowledgement.AcknowledgementHeader }
     *     
     */
    public void setAcknowledgementHeader(Acknowledgement.AcknowledgementHeader value) {
        this.acknowledgementHeader = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Status" type="{urn:control.services.tiplus2.misys.com}StatusEnum"/>
     *         &lt;element name="TargetSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="CorrelationId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="48"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TargetSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class AcknowledgementHeader {

        @XmlElementRefs({
            @XmlElementRef(name = "TargetSystem", namespace = "urn:control.services.tiplus2.misys.com", type = JAXBElement.class),
            @XmlElementRef(name = "Message", namespace = "urn:control.services.tiplus2.misys.com", type = JAXBElement.class),
            @XmlElementRef(name = "Status", namespace = "urn:control.services.tiplus2.misys.com", type = JAXBElement.class),
            @XmlElementRef(name = "Operation", namespace = "urn:control.services.tiplus2.misys.com", type = JAXBElement.class),
            @XmlElementRef(name = "Service", namespace = "urn:control.services.tiplus2.misys.com", type = JAXBElement.class),
            @XmlElementRef(name = "CorrelationId", namespace = "urn:control.services.tiplus2.misys.com", type = JAXBElement.class),
            @XmlElementRef(name = "SourceSystem", namespace = "urn:control.services.tiplus2.misys.com", type = JAXBElement.class)
        })
        protected List<JAXBElement<?>> content;

        /**
         * Gets the rest of the content model. 
         * 
         * <p>
         * You are getting this "catch-all" property because of the following reason: 
         * The field name "TargetSystem" is used by two different parts of a schema. See: 
         * line 25 of file:/C:/TI_Plus/TI_Plus_2.5.0/sdk/sdk/resources/schema/com.misys.tiplus2.gen.ti-xsd/control/Acknowledgement.xsd
         * line 15 of file:/C:/TI_Plus/TI_Plus_2.5.0/sdk/sdk/resources/schema/com.misys.tiplus2.gen.ti-xsd/control/Acknowledgement.xsd
         * <p>
         * To get rid of this property, apply a property customization to one 
         * of both of the following declarations to change their names: 
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link StatusEnum }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getContent() {
            if (content == null) {
                content = new ArrayList<JAXBElement<?>>();
            }
            return this.content;
        }

    }

}
