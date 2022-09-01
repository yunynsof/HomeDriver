
package com.tigo.commons.generalresponse.v1.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.commons.generalresponse.v1.schema package. 
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

    private final static QName _GeneralResponse_QNAME = new QName("http://tigo.com/commons/generalResponse/v1/schema", "GeneralResponse");
    private final static QName _GeneralResponseTypeMessage_QNAME = new QName("", "message");
    private final static QName _GeneralResponseTypeStatus_QNAME = new QName("", "status");
    private final static QName _GeneralResponseTypeUti_QNAME = new QName("", "uti");
    private final static QName _GeneralResponseTypeCode_QNAME = new QName("", "code");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.commons.generalresponse.v1.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeneralResponseType }
     * 
     */
    public GeneralResponseType createGeneralResponseType() {
        return new GeneralResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/commons/generalResponse/v1/schema", name = "GeneralResponse")
    public JAXBElement<GeneralResponseType> createGeneralResponse(GeneralResponseType value) {
        return new JAXBElement<GeneralResponseType>(_GeneralResponse_QNAME, GeneralResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "message", scope = GeneralResponseType.class)
    public JAXBElement<String> createGeneralResponseTypeMessage(String value) {
        return new JAXBElement<String>(_GeneralResponseTypeMessage_QNAME, String.class, GeneralResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "status", scope = GeneralResponseType.class)
    public JAXBElement<String> createGeneralResponseTypeStatus(String value) {
        return new JAXBElement<String>(_GeneralResponseTypeStatus_QNAME, String.class, GeneralResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uti", scope = GeneralResponseType.class)
    public JAXBElement<String> createGeneralResponseTypeUti(String value) {
        return new JAXBElement<String>(_GeneralResponseTypeUti_QNAME, String.class, GeneralResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "code", scope = GeneralResponseType.class)
    public JAXBElement<String> createGeneralResponseTypeCode(String value) {
        return new JAXBElement<String>(_GeneralResponseTypeCode_QNAME, String.class, GeneralResponseType.class, value);
    }

}
