//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 10:30:31 AM BRT 
//


package br.com.centralit.citsmart.rest.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CtLoginResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CtLoginResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Error" type="{}CtError"/>
 *           &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CtLoginResp", propOrder = {
    "error",
    "sessionID"
})
public class CtLoginResp {

    @XmlElement(name = "Error")
    protected CtError error;
    @XmlElement(name = "SessionID")
    protected String sessionID;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link CtError }
     *     
     */
    public CtError getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtError }
     *     
     */
    public void setError(CtError value) {
        this.error = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

}