//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.22 at 03:37:05 PM IST 
//


package com.misys.tiplus2.apps.ti.service.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GWRStepStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GWRStepStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="o"/>
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="d"/>
 *     &lt;enumeration value="w"/>
 *     &lt;enumeration value="c"/>
 *     &lt;enumeration value="i"/>
 *     &lt;enumeration value="p"/>
 *     &lt;enumeration value="q"/>
 *     &lt;enumeration value="j"/>
 *     &lt;enumeration value="r"/>
 *     &lt;enumeration value="s"/>
 *     &lt;minLength value="1"/>
 *     &lt;maxLength value="1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GWRStepStatus")
@XmlEnum
public enum GWRStepStatus {

    @XmlEnumValue("o")
    O("o"),
    @XmlEnumValue("a")
    A("a"),
    @XmlEnumValue("d")
    D("d"),
    @XmlEnumValue("w")
    W("w"),
    @XmlEnumValue("c")
    C("c"),
    @XmlEnumValue("i")
    I("i"),
    @XmlEnumValue("p")
    P("p"),
    @XmlEnumValue("q")
    Q("q"),
    @XmlEnumValue("j")
    J("j"),
    @XmlEnumValue("r")
    R("r"),
    @XmlEnumValue("s")
    S("s");
    private final String value;

    GWRStepStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GWRStepStatus fromValue(String v) {
        for (GWRStepStatus c: GWRStepStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
