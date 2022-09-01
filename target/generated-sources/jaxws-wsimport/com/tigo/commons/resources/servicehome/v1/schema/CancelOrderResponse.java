
package com.tigo.commons.resources.servicehome.v1.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tigo.commons.generalresponse.v1.schema.GeneralResponseType;


/**
 * <p>Clase Java para CancelOrderResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelOrderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://tigo.com/commons/generalResponse/v1/schema}GeneralResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelOrderResponse", propOrder = {
    "generalResponse"
})
public class CancelOrderResponse {

    @XmlElement(name = "GeneralResponse", namespace = "http://tigo.com/commons/generalResponse/v1/schema", required = true)
    protected GeneralResponseType generalResponse;

    /**
     * Obtiene el valor de la propiedad generalResponse.
     * 
     * @return
     *     possible object is
     *     {@link GeneralResponseType }
     *     
     */
    public GeneralResponseType getGeneralResponse() {
        return generalResponse;
    }

    /**
     * Define el valor de la propiedad generalResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralResponseType }
     *     
     */
    public void setGeneralResponse(GeneralResponseType value) {
        this.generalResponse = value;
    }

}
