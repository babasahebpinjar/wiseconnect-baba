//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 03:37:05 PM IST 
//


package com.misys.tiplus2.apps.ti.service.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * .
 * 
 * <p>Java class for STRParameterSetMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STRParameterSetMap">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:messages.service.ti.apps.tiplus2.misys.com}GatewaySystemTailoring">
 *       &lt;sequence>
 *         &lt;element name="Branch" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRBranchCode" minOccurs="0"/>
 *         &lt;element name="ParameterSet" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWRParameterSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STRParameterSetMap", propOrder = {
    "branch",
    "parameterSet"
})
public class STRParameterSetMap
    extends GatewaySystemTailoring
{

    @XmlElement(name = "Branch")
    protected String branch;
    @XmlElement(name = "ParameterSet")
    protected String parameterSet;

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the parameterSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterSet() {
        return parameterSet;
    }

    /**
     * Sets the value of the parameterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterSet(String value) {
        this.parameterSet = value;
    }

}
