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
import com.misys.tiplus2.apps.ti.service.common.GWRApplicantOrBeneficiary;
import com.misys.tiplus2.apps.ti.service.common.GWRFreight;


/**
 * .
 * 
 * <p>Java class for STRIncoterms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRIncoterms">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:messages.service.ti.apps.tiplus2.misys.com}GatewayStatic">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRIncotermCode" minOccurs="0"/>
 *         &lt;element name="Incoterm" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRIncotermDescription" minOccurs="0"/>
 *         &lt;element name="Freight" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRFreight" minOccurs="0"/>
 *         &lt;element name="InsuranceCoveredBy" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRApplicantOrBeneficiary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRIncoterms", propOrder = {
    "code",
    "incoterm",
    "freight",
    "insuranceCoveredBy"
})
public class STRIncoterms
    extends GatewayStatic
{

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Incoterm")
    protected String incoterm;
    @XmlElementRef(name = "Freight", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<GWRFreight> freight;
    @XmlElementRef(name = "InsuranceCoveredBy", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<GWRApplicantOrBeneficiary> insuranceCoveredBy;

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
     * Gets the value of the incoterm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoterm() {
        return incoterm;
    }

    /**
     * Sets the value of the incoterm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoterm(String value) {
        this.incoterm = value;
    }

    /**
     * Gets the value of the freight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GWRFreight }{@code >}
     *     
     */
    public JAXBElement<GWRFreight> getFreight() {
        return freight;
    }

    /**
     * Sets the value of the freight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GWRFreight }{@code >}
     *     
     */
    public void setFreight(JAXBElement<GWRFreight> value) {
        this.freight = ((JAXBElement<GWRFreight> ) value);
    }

    /**
     * Gets the value of the insuranceCoveredBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GWRApplicantOrBeneficiary }{@code >}
     *     
     */
    public JAXBElement<GWRApplicantOrBeneficiary> getInsuranceCoveredBy() {
        return insuranceCoveredBy;
    }

    /**
     * Sets the value of the insuranceCoveredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GWRApplicantOrBeneficiary }{@code >}
     *     
     */
    public void setInsuranceCoveredBy(JAXBElement<GWRApplicantOrBeneficiary> value) {
        this.insuranceCoveredBy = ((JAXBElement<GWRApplicantOrBeneficiary> ) value);
    }

}
