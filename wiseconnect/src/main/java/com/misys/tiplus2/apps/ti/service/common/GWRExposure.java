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
 * <p>Java class for GWRExposure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GWRExposure">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:common.service.ti.apps.tiplus2.misys.com}GWRReservation">
 *       &lt;sequence>
 *         &lt;element name="ReservationIdentifier" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRReservationID" minOccurs="0"/>
 *         &lt;element name="ReservationSequence" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRReservationSequence" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GWRExposure", propOrder = {
    "reservationIdentifier",
    "reservationSequence"
})
public class GWRExposure
    extends GWRReservation
{

    @XmlElement(name = "ReservationIdentifier")
    protected String reservationIdentifier;
    @XmlElement(name = "ReservationSequence")
    protected String reservationSequence;

    /**
     * Gets the value of the reservationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationIdentifier() {
        return reservationIdentifier;
    }

    /**
     * Sets the value of the reservationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationIdentifier(String value) {
        this.reservationIdentifier = value;
    }

    /**
     * Gets the value of the reservationSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationSequence() {
        return reservationSequence;
    }

    /**
     * Sets the value of the reservationSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationSequence(String value) {
        this.reservationSequence = value;
    }

}