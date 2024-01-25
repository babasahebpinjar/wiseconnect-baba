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


/**
 * .
 * 
 * <p>Java class for STROrchestrationTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STROrchestrationTemplate">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:messages.service.ti.apps.tiplus2.misys.com}GatewaySystemTailoring">
 *       &lt;sequence>
 *         &lt;element name="OrchestrationTemplateID" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWROrchestrationTemplateID" minOccurs="0"/>
 *         &lt;element name="OrchestrationTemplateDescription" type="{urn:common.service.ti.apps.tiplus2.misys.com}GWROrchestrationTemplateDescription" minOccurs="0"/>
 *         &lt;element name="OrchestrationTemplateStepDetailss" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrchestrationTemplateStepDetails" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EventOrchestrationID" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="StepPhase" type="{urn:messages.service.ti.apps.tiplus2.misys.com}STROrchestrationTemplate_OrchestrationTemplateStepDetails_StepPhase" minOccurs="0"/>
 *                             &lt;element name="NextEventOrchestrationID" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CreatedFromEventOrchestrationID" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="BranchType" type="{urn:messages.service.ti.apps.tiplus2.misys.com}STROrchestrationTemplate_OrchestrationTemplateStepDetails_BranchType" minOccurs="0"/>
 *                             &lt;element name="BranchLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STROrchestrationTemplate", propOrder = {
    "orchestrationTemplateID",
    "orchestrationTemplateDescription",
    "orchestrationTemplateStepDetailss"
})
public class STROrchestrationTemplate
    extends GatewaySystemTailoring
{

    @XmlElement(name = "OrchestrationTemplateID")
    protected String orchestrationTemplateID;
    @XmlElement(name = "OrchestrationTemplateDescription")
    protected String orchestrationTemplateDescription;
    @XmlElement(name = "OrchestrationTemplateStepDetailss")
    protected STROrchestrationTemplate.OrchestrationTemplateStepDetailss orchestrationTemplateStepDetailss;

    /**
     * Gets the value of the orchestrationTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrchestrationTemplateID() {
        return orchestrationTemplateID;
    }

    /**
     * Sets the value of the orchestrationTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrchestrationTemplateID(String value) {
        this.orchestrationTemplateID = value;
    }

    /**
     * Gets the value of the orchestrationTemplateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrchestrationTemplateDescription() {
        return orchestrationTemplateDescription;
    }

    /**
     * Sets the value of the orchestrationTemplateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrchestrationTemplateDescription(String value) {
        this.orchestrationTemplateDescription = value;
    }

    /**
     * Gets the value of the orchestrationTemplateStepDetailss property.
     * 
     * @return
     *     possible object is
     *     {@link STROrchestrationTemplate.OrchestrationTemplateStepDetailss }
     *     
     */
    public STROrchestrationTemplate.OrchestrationTemplateStepDetailss getOrchestrationTemplateStepDetailss() {
        return orchestrationTemplateStepDetailss;
    }

    /**
     * Sets the value of the orchestrationTemplateStepDetailss property.
     * 
     * @param value
     *     allowed object is
     *     {@link STROrchestrationTemplate.OrchestrationTemplateStepDetailss }
     *     
     */
    public void setOrchestrationTemplateStepDetailss(STROrchestrationTemplate.OrchestrationTemplateStepDetailss value) {
        this.orchestrationTemplateStepDetailss = value;
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
     *         &lt;element name="OrchestrationTemplateStepDetails" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EventOrchestrationID" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="StepPhase" type="{urn:messages.service.ti.apps.tiplus2.misys.com}STROrchestrationTemplate_OrchestrationTemplateStepDetails_StepPhase" minOccurs="0"/>
     *                   &lt;element name="NextEventOrchestrationID" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CreatedFromEventOrchestrationID" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="BranchType" type="{urn:messages.service.ti.apps.tiplus2.misys.com}STROrchestrationTemplate_OrchestrationTemplateStepDetails_BranchType" minOccurs="0"/>
     *                   &lt;element name="BranchLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "orchestrationTemplateStepDetails"
    })
    public static class OrchestrationTemplateStepDetailss {

        @XmlElement(name = "OrchestrationTemplateStepDetails", required = true)
        protected List<STROrchestrationTemplate.OrchestrationTemplateStepDetailss.OrchestrationTemplateStepDetails> orchestrationTemplateStepDetails;

        /**
         * Gets the value of the orchestrationTemplateStepDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orchestrationTemplateStepDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrchestrationTemplateStepDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link STROrchestrationTemplate.OrchestrationTemplateStepDetailss.OrchestrationTemplateStepDetails }
         * 
         * 
         */
        public List<STROrchestrationTemplate.OrchestrationTemplateStepDetailss.OrchestrationTemplateStepDetails> getOrchestrationTemplateStepDetails() {
            if (orchestrationTemplateStepDetails == null) {
                orchestrationTemplateStepDetails = new ArrayList<STROrchestrationTemplate.OrchestrationTemplateStepDetailss.OrchestrationTemplateStepDetails>();
            }
            return this.orchestrationTemplateStepDetails;
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
         *         &lt;element name="EventOrchestrationID" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="15"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="StepPhase" type="{urn:messages.service.ti.apps.tiplus2.misys.com}STROrchestrationTemplate_OrchestrationTemplateStepDetails_StepPhase" minOccurs="0"/>
         *         &lt;element name="NextEventOrchestrationID" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="15"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CreatedFromEventOrchestrationID" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="15"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="BranchType" type="{urn:messages.service.ti.apps.tiplus2.misys.com}STROrchestrationTemplate_OrchestrationTemplateStepDetails_BranchType" minOccurs="0"/>
         *         &lt;element name="BranchLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "eventOrchestrationID",
            "stepPhase",
            "nextEventOrchestrationID",
            "createdFromEventOrchestrationID",
            "branchType",
            "branchLevel"
        })
        public static class OrchestrationTemplateStepDetails {

            @XmlElementRef(name = "EventOrchestrationID", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
            protected JAXBElement<String> eventOrchestrationID;
            @XmlElement(name = "StepPhase")
            protected STROrchestrationTemplateOrchestrationTemplateStepDetailsStepPhase stepPhase;
            @XmlElementRef(name = "NextEventOrchestrationID", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
            protected JAXBElement<String> nextEventOrchestrationID;
            @XmlElementRef(name = "CreatedFromEventOrchestrationID", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
            protected JAXBElement<String> createdFromEventOrchestrationID;
            @XmlElement(name = "BranchType")
            protected STROrchestrationTemplateOrchestrationTemplateStepDetailsBranchType branchType;
            @XmlElementRef(name = "BranchLevel", namespace = "urn:messages.service.ti.apps.tiplus2.misys.com", type = JAXBElement.class)
            protected JAXBElement<Integer> branchLevel;

            /**
             * Gets the value of the eventOrchestrationID property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getEventOrchestrationID() {
                return eventOrchestrationID;
            }

            /**
             * Sets the value of the eventOrchestrationID property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setEventOrchestrationID(JAXBElement<String> value) {
                this.eventOrchestrationID = ((JAXBElement<String> ) value);
            }

            /**
             * Gets the value of the stepPhase property.
             * 
             * @return
             *     possible object is
             *     {@link STROrchestrationTemplateOrchestrationTemplateStepDetailsStepPhase }
             *     
             */
            public STROrchestrationTemplateOrchestrationTemplateStepDetailsStepPhase getStepPhase() {
                return stepPhase;
            }

            /**
             * Sets the value of the stepPhase property.
             * 
             * @param value
             *     allowed object is
             *     {@link STROrchestrationTemplateOrchestrationTemplateStepDetailsStepPhase }
             *     
             */
            public void setStepPhase(STROrchestrationTemplateOrchestrationTemplateStepDetailsStepPhase value) {
                this.stepPhase = value;
            }

            /**
             * Gets the value of the nextEventOrchestrationID property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getNextEventOrchestrationID() {
                return nextEventOrchestrationID;
            }

            /**
             * Sets the value of the nextEventOrchestrationID property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setNextEventOrchestrationID(JAXBElement<String> value) {
                this.nextEventOrchestrationID = ((JAXBElement<String> ) value);
            }

            /**
             * Gets the value of the createdFromEventOrchestrationID property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCreatedFromEventOrchestrationID() {
                return createdFromEventOrchestrationID;
            }

            /**
             * Sets the value of the createdFromEventOrchestrationID property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCreatedFromEventOrchestrationID(JAXBElement<String> value) {
                this.createdFromEventOrchestrationID = ((JAXBElement<String> ) value);
            }

            /**
             * Gets the value of the branchType property.
             * 
             * @return
             *     possible object is
             *     {@link STROrchestrationTemplateOrchestrationTemplateStepDetailsBranchType }
             *     
             */
            public STROrchestrationTemplateOrchestrationTemplateStepDetailsBranchType getBranchType() {
                return branchType;
            }

            /**
             * Sets the value of the branchType property.
             * 
             * @param value
             *     allowed object is
             *     {@link STROrchestrationTemplateOrchestrationTemplateStepDetailsBranchType }
             *     
             */
            public void setBranchType(STROrchestrationTemplateOrchestrationTemplateStepDetailsBranchType value) {
                this.branchType = value;
            }

            /**
             * Gets the value of the branchLevel property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public JAXBElement<Integer> getBranchLevel() {
                return branchLevel;
            }

            /**
             * Sets the value of the branchLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setBranchLevel(JAXBElement<Integer> value) {
                this.branchLevel = ((JAXBElement<Integer> ) value);
            }

        }

    }

}