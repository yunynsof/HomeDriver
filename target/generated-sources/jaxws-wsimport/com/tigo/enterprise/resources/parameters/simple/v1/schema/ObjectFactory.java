
package com.tigo.enterprise.resources.parameters.simple.v1.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.enterprise.resources.parameters.simple.v1.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Parameters_QNAME = new QName("http://tigo.com/enterprise/resources/parameters/simple/v1/schema", "parameters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.enterprise.resources.parameters.simple.v1.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParameterArray }
     * 
     */
    public ParameterArray createParameterArray() {
        return new ParameterArray();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/enterprise/resources/parameters/simple/v1/schema", name = "parameters")
    public JAXBElement<ParameterArray> createParameters(ParameterArray value) {
        return new JAXBElement<ParameterArray>(_Parameters_QNAME, ParameterArray.class, null, value);
    }

}
