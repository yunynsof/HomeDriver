
package com.tigo.commons.resources.servicehome.v1.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tigo.commons.basicrequest.v1.schema.BasicRequestType;
import com.tigo.commons.resources.additional.v1.schema.AdditionalsType;


/**
 * <p>Clase Java para CreateOrderRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateOrderRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://tigo.com/commons/basicRequest/v1/schema}basicRequest"/>
 *         &lt;element ref="{http://tigo.com/commons/resources/additional/v1/schema}additionals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderRequestType", propOrder = {
    "basicRequest",
    "additionals"
})
public class CreateOrderRequestType {

    @XmlElement(namespace = "http://tigo.com/commons/basicRequest/v1/schema", required = true)
    protected BasicRequestType basicRequest;
    @XmlElement(namespace = "http://tigo.com/commons/resources/additional/v1/schema", nillable = true)
    protected AdditionalsType additionals;

    /**
     * Obtiene el valor de la propiedad basicRequest.
     * 
     * @return
     *     possible object is
     *     {@link BasicRequestType }
     *     
     */
    public BasicRequestType getBasicRequest() {
        return basicRequest;
    }

    /**
     * Define el valor de la propiedad basicRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicRequestType }
     *     
     */
    public void setBasicRequest(BasicRequestType value) {
        this.basicRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad additionals.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalsType }
     *     
     */
    public AdditionalsType getAdditionals() {
        return additionals;
    }

    /**
     * Define el valor de la propiedad additionals.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalsType }
     *     
     */
    public void setAdditionals(AdditionalsType value) {
        this.additionals = value;
    }

}
