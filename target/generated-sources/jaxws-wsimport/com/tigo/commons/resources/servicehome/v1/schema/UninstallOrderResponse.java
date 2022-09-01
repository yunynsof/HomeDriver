
package com.tigo.commons.resources.servicehome.v1.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tigo.commons.generalresponse.v1.schema.GeneralResponseType;
import com.tigo.enterprise.resources.parameters.simple.v1.schema.ParameterArray;


/**
 * <p>Clase Java para UninstallOrderResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UninstallOrderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://tigo.com/commons/generalResponse/v1/schema}GeneralResponse"/>
 *         &lt;element ref="{http://tigo.com/enterprise/resources/parameters/simple/v1/schema}parameters"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UninstallOrderResponse", propOrder = {
    "generalResponse",
    "parameters"
})
public class UninstallOrderResponse {

    @XmlElement(name = "GeneralResponse", namespace = "http://tigo.com/commons/generalResponse/v1/schema", required = true)
    protected GeneralResponseType generalResponse;
    @XmlElement(namespace = "http://tigo.com/enterprise/resources/parameters/simple/v1/schema", required = true)
    protected ParameterArray parameters;

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

    /**
     * Obtiene el valor de la propiedad parameters.
     * 
     * @return
     *     possible object is
     *     {@link ParameterArray }
     *     
     */
    public ParameterArray getParameters() {
        return parameters;
    }

    /**
     * Define el valor de la propiedad parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterArray }
     *     
     */
    public void setParameters(ParameterArray value) {
        this.parameters = value;
    }

}
