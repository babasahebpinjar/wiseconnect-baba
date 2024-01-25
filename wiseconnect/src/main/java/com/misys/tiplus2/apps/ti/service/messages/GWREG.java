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
import com.misys.tiplus2.apps.ti.service.common.EnigmaBoolean;
import com.misys.tiplus2.apps.ti.service.common.GWRGuaranteeDetails;


/**
 * <p>Java class for GWREG complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GWREG">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:messages.service.ti.apps.tiplus2.misys.com}GWREGS">
 *       &lt;sequence>
 *         &lt;element name="LetterOfIndemnity" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBool" minOccurs="0"/>
 *         &lt;element name="BillNumber" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBillNumber" minOccurs="0"/>
 *         &lt;element name="FlightDetails" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRFlightDetails" minOccurs="0"/>
 *         &lt;element name="FreeFormatInstructionsForSWIFT" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRText460x65" minOccurs="0"/>
 *         &lt;element name="ShipmentAdditionalInformation" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRText6x35" minOccurs="0"/>
 *         &lt;element name="ShippingCompany" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRText65" minOccurs="0"/>
 *         &lt;element name="VesselName" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRText35" minOccurs="0"/>
 *         &lt;element name="GWRGuaranteeDetails" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRGuaranteeDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GWREG", propOrder = {
    "letterOfIndemnity",
    "billNumber",
    "flightDetails",
    "freeFormatInstructionsForSWIFT",
    "shipmentAdditionalInformation",
    "shippingCompany",
    "vesselName",
    "gwrGuaranteeDetails"
})
@XmlSeeAlso({
    GWREGT.class,
    GWREGTNEW.class
})
public class GWREG
    extends GWREGS
{

    @XmlElement(name = "LetterOfIndemnity")
    protected EnigmaBoolean letterOfIndemnity;
    @XmlElementRef(name = "BillNumber", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<String> billNumber;
    @XmlElementRef(name = "FlightDetails", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<String> flightDetails;
    @XmlElement(name = "FreeFormatInstructionsForSWIFT")
    protected String freeFormatInstructionsForSWIFT;
    @XmlElementRef(name = "ShipmentAdditionalInformation", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<String> shipmentAdditionalInformation;
    @XmlElementRef(name = "ShippingCompany", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<String> shippingCompany;
    @XmlElementRef(name = "VesselName", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<String> vesselName;
    @XmlElement(name = "GWRGuaranteeDetails")
    protected GWRGuaranteeDetails gwrGuaranteeDetails;

    /**
     * Gets the value of the letterOfIndemnity property.
     * 
     * @return
     *     possible object is
     *     {@link EnigmaBoolean }
     *     
     */
    public EnigmaBoolean getLetterOfIndemnity() {
        return letterOfIndemnity;
    }

    /**
     * Sets the value of the letterOfIndemnity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnigmaBoolean }
     *     
     */
    public void setLetterOfIndemnity(EnigmaBoolean value) {
        this.letterOfIndemnity = value;
    }

    /**
     * Gets the value of the billNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillNumber() {
        return billNumber;
    }

    /**
     * Sets the value of the billNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillNumber(JAXBElement<String> value) {
        this.billNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightDetails() {
        return flightDetails;
    }

    /**
     * Sets the value of the flightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightDetails(JAXBElement<String> value) {
        this.flightDetails = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the freeFormatInstructionsForSWIFT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFormatInstructionsForSWIFT() {
        return freeFormatInstructionsForSWIFT;
    }

    /**
     * Sets the value of the freeFormatInstructionsForSWIFT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFormatInstructionsForSWIFT(String value) {
        this.freeFormatInstructionsForSWIFT = value;
    }

    /**
     * Gets the value of the shipmentAdditionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShipmentAdditionalInformation() {
        return shipmentAdditionalInformation;
    }

    /**
     * Sets the value of the shipmentAdditionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShipmentAdditionalInformation(JAXBElement<String> value) {
        this.shipmentAdditionalInformation = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shippingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShippingCompany() {
        return shippingCompany;
    }

    /**
     * Sets the value of the shippingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShippingCompany(JAXBElement<String> value) {
        this.shippingCompany = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the vesselName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVesselName() {
        return vesselName;
    }

    /**
     * Sets the value of the vesselName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVesselName(JAXBElement<String> value) {
        this.vesselName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gwrGuaranteeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GWRGuaranteeDetails }
     *     
     */
    public GWRGuaranteeDetails getGWRGuaranteeDetails() {
        return gwrGuaranteeDetails;
    }

    /**
     * Sets the value of the gwrGuaranteeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GWRGuaranteeDetails }
     *     
     */
    public void setGWRGuaranteeDetails(GWRGuaranteeDetails value) {
        this.gwrGuaranteeDetails = value;
    }

}