
package com.tigo.commons.basicrequest.v1.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para basicRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="basicRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utiReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basicRequestType", propOrder = {
    "externalApplicationID",
    "externalTransactionID",
    "utiReference"
})
public class BasicRequestType {

    protected String externalApplicationID;
    protected String externalTransactionID;
    protected String utiReference;

    /**
     * Obtiene el valor de la propiedad externalApplicationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalApplicationID() {
        return externalApplicationID;
    }

    /**
     * Define el valor de la propiedad externalApplicationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalApplicationID(String value) {
        this.externalApplicationID = value;
    }

    /**
     * Obtiene el valor de la propiedad externalTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTransactionID() {
        return externalTransactionID;
    }

    /**
     * Define el valor de la propiedad externalTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransactionID(String value) {
        this.externalTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad utiReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtiReference() {
        return utiReference;
    }

    /**
     * Define el valor de la propiedad utiReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtiReference(String value) {
        this.utiReference = value;
    }

}
