
package com.tigo.commons.resources.servicehome.v1.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tigo.commons.resources.servicehome.v1.schema package. 
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

    private final static QName _CloseOrderRequest_QNAME = new QName("http://tigo.com/commons/resources/serviceHome/v1/schema", "CloseOrderRequest");
    private final static QName _UninstallOrderRequest_QNAME = new QName("http://tigo.com/commons/resources/serviceHome/v1/schema", "UninstallOrderRequest");
    private final static QName _CancelOrderRequest_QNAME = new QName("http://tigo.com/commons/resources/serviceHome/v1/schema", "CancelOrderRequest");
    private final static QName _CreateOrderResponse_QNAME = new QName("http://tigo.com/commons/resources/serviceHome/v1/schema", "CreateOrderResponse");
    private final static QName _UninstallOrderResponse_QNAME = new QName("http://tigo.com/commons/resources/serviceHome/v1/schema", "UninstallOrderResponse");
    private final static QName _CloseOrderResponse_QNAME = new QName("http://tigo.com/commons/resources/serviceHome/v1/schema", "CloseOrderResponse");
    private final static QName _CancelOrderResponse_QNAME = new QName("http://tigo.com/commons/resources/serviceHome/v1/schema", "CancelOrderResponse");
    private final static QName _CreateOrderRequest_QNAME = new QName("http://tigo.com/commons/resources/serviceHome/v1/schema", "CreateOrderRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tigo.commons.resources.servicehome.v1.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UninstallOrderResponse }
     * 
     */
    public UninstallOrderResponse createUninstallOrderResponse() {
        return new UninstallOrderResponse();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link CancelOrderRequestType }
     * 
     */
    public CancelOrderRequestType createCancelOrderRequestType() {
        return new CancelOrderRequestType();
    }

    /**
     * Create an instance of {@link CancelOrderResponse }
     * 
     */
    public CancelOrderResponse createCancelOrderResponse() {
        return new CancelOrderResponse();
    }

    /**
     * Create an instance of {@link CloseOrderResponse }
     * 
     */
    public CloseOrderResponse createCloseOrderResponse() {
        return new CloseOrderResponse();
    }

    /**
     * Create an instance of {@link CloseOrderRequestType }
     * 
     */
    public CloseOrderRequestType createCloseOrderRequestType() {
        return new CloseOrderRequestType();
    }

    /**
     * Create an instance of {@link UninstallOrderRequestType }
     * 
     */
    public UninstallOrderRequestType createUninstallOrderRequestType() {
        return new UninstallOrderRequestType();
    }

    /**
     * Create an instance of {@link CreateOrderRequestType }
     * 
     */
    public CreateOrderRequestType createCreateOrderRequestType() {
        return new CreateOrderRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseOrderRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/commons/resources/serviceHome/v1/schema", name = "CloseOrderRequest")
    public JAXBElement<CloseOrderRequestType> createCloseOrderRequest(CloseOrderRequestType value) {
        return new JAXBElement<CloseOrderRequestType>(_CloseOrderRequest_QNAME, CloseOrderRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UninstallOrderRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/commons/resources/serviceHome/v1/schema", name = "UninstallOrderRequest")
    public JAXBElement<UninstallOrderRequestType> createUninstallOrderRequest(UninstallOrderRequestType value) {
        return new JAXBElement<UninstallOrderRequestType>(_UninstallOrderRequest_QNAME, UninstallOrderRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelOrderRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/commons/resources/serviceHome/v1/schema", name = "CancelOrderRequest")
    public JAXBElement<CancelOrderRequestType> createCancelOrderRequest(CancelOrderRequestType value) {
        return new JAXBElement<CancelOrderRequestType>(_CancelOrderRequest_QNAME, CancelOrderRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/commons/resources/serviceHome/v1/schema", name = "CreateOrderResponse")
    public JAXBElement<CreateOrderResponse> createCreateOrderResponse(CreateOrderResponse value) {
        return new JAXBElement<CreateOrderResponse>(_CreateOrderResponse_QNAME, CreateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UninstallOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/commons/resources/serviceHome/v1/schema", name = "UninstallOrderResponse")
    public JAXBElement<UninstallOrderResponse> createUninstallOrderResponse(UninstallOrderResponse value) {
        return new JAXBElement<UninstallOrderResponse>(_UninstallOrderResponse_QNAME, UninstallOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/commons/resources/serviceHome/v1/schema", name = "CloseOrderResponse")
    public JAXBElement<CloseOrderResponse> createCloseOrderResponse(CloseOrderResponse value) {
        return new JAXBElement<CloseOrderResponse>(_CloseOrderResponse_QNAME, CloseOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/commons/resources/serviceHome/v1/schema", name = "CancelOrderResponse")
    public JAXBElement<CancelOrderResponse> createCancelOrderResponse(CancelOrderResponse value) {
        return new JAXBElement<CancelOrderResponse>(_CancelOrderResponse_QNAME, CancelOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tigo.com/commons/resources/serviceHome/v1/schema", name = "CreateOrderRequest")
    public JAXBElement<CreateOrderRequestType> createCreateOrderRequest(CreateOrderRequestType value) {
        return new JAXBElement<CreateOrderRequestType>(_CreateOrderRequest_QNAME, CreateOrderRequestType.class, null, value);
    }

}
