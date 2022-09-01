
package com.tigo.commons.resources.additional.v1.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.commons.resources.additional.v1.schema package. 
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

    private final static QName _Additionals_QNAME = new QName("http://tigo.com/commons/resources/additional/v1/schema", "additionals");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.commons.resources.additional.v1.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdditionalsType }
     * 
     */
    public AdditionalsType createAdditionalsType() {
        return new AdditionalsType();
    }

    /**
     * Create an instance of {@link AdditionalType }
     * 
     */
    public AdditionalType createAdditionalType() {
        return new AdditionalType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/commons/resources/additional/v1/schema", name = "additionals")
    public JAXBElement<AdditionalsType> createAdditionals(AdditionalsType value) {
        return new JAXBElement<AdditionalsType>(_Additionals_QNAME, AdditionalsType.class, null, value);
    }

}
