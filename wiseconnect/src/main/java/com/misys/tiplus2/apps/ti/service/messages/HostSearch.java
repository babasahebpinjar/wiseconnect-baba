//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 03:37:05 PM IST 
//


package com.misys.tiplus2.apps.ti.service.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.misys.tiplus2.apps.ti.service.common.ExpectedColumns;
import com.misys.tiplus2.apps.ti.service.common.HostSearchSecurityFilters;


/**
 * .
 * 
 * <p>Java class for HostSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Ac"/>
 *               &lt;enumeration value="Cu"/>
 *               &lt;enumeration value="Fa"/>
 *               &lt;enumeration value="Si"/>
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Filters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Filter" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NumResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpectedColumns" type="{urn:common.service.ti.apps.tiplus2.misys.com}ExpectedColumns" minOccurs="0"/>
 *         &lt;element name="SortOn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SecurityFilters" type="{urn:common.service.ti.apps.tiplus2.misys.com}HostSearchSecurityFilters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSearch", propOrder = {
    "type",
    "filters",
    "numResults",
    "expectedColumns",
    "sortOn",
    "securityFilters"
})
public class HostSearch {

    @XmlElementRef(name = "Type", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<String> type;
    @XmlElement(name = "Filters")
    protected HostSearch.Filters filters;
    @XmlElementRef(name = "NumResults", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<Integer> numResults;
    @XmlElement(name = "ExpectedColumns")
    protected ExpectedColumns expectedColumns;
    @XmlElementRef(name = "SortOn", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
    protected JAXBElement<String> sortOn;
    @XmlElement(name = "SecurityFilters")
    protected HostSearchSecurityFilters securityFilters;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link HostSearch.Filters }
     *     
     */
    public HostSearch.Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSearch.Filters }
     *     
     */
    public void setFilters(HostSearch.Filters value) {
        this.filters = value;
    }

    /**
     * Gets the value of the numResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumResults() {
        return numResults;
    }

    /**
     * Sets the value of the numResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumResults(JAXBElement<Integer> value) {
        this.numResults = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the expectedColumns property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedColumns }
     *     
     */
    public ExpectedColumns getExpectedColumns() {
        return expectedColumns;
    }

    /**
     * Sets the value of the expectedColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedColumns }
     *     
     */
    public void setExpectedColumns(ExpectedColumns value) {
        this.expectedColumns = value;
    }

    /**
     * Gets the value of the sortOn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSortOn() {
        return sortOn;
    }

    /**
     * Sets the value of the sortOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSortOn(JAXBElement<String> value) {
        this.sortOn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the securityFilters property.
     * 
     * @return
     *     possible object is
     *     {@link HostSearchSecurityFilters }
     *     
     */
    public HostSearchSecurityFilters getSecurityFilters() {
        return securityFilters;
    }

    /**
     * Sets the value of the securityFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostSearchSecurityFilters }
     *     
     */
    public void setSecurityFilters(HostSearchSecurityFilters value) {
        this.securityFilters = value;
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
     *         &lt;element name="Filter" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "filter"
    })
    public static class Filters {

        @XmlElement(name = "Filter", required = true)
        protected List<HostSearch.Filters.Filter> filter;

        /**
         * Gets the value of the filter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the filter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFilter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HostSearch.Filters.Filter }
         * 
         * 
         */
        public List<HostSearch.Filters.Filter> getFilter() {
            if (filter == null) {
                filter = new ArrayList<HostSearch.Filters.Filter>();
            }
            return this.filter;
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
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "name",
            "value"
        })
        public static class Filter {

            @XmlElement(name = "Name")
            protected String name;
            @XmlElement(name = "Value")
            protected String value;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}