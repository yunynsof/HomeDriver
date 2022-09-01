
package com.tigo.commons.basicrequest.v1.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.commons.basicrequest.v1.schema package. 
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

    private final static QName _BasicRequest_QNAME = new QName("http://tigo.com/commons/basicRequest/v1/schema", "basicRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.commons.basicrequest.v1.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BasicRequestType }
     * 
     */
    public BasicRequestType createBasicRequestType() {
        return new BasicRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/commons/basicRequest/v1/schema", name = "basicRequest")
    public JAXBElement<BasicRequestType> createBasicRequest(BasicRequestType value) {
        return new JAXBElement<BasicRequestType>(_BasicRequest_QNAME, BasicRequestType.class, null, value);
    }

}
