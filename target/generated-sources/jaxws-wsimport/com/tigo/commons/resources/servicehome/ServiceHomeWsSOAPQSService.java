
package com.tigo.commons.resources.servicehome;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * OSB Service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceHome_wsSOAPQSService", targetNamespace = "http://tigo.com/commons/resources/serviceHome", wsdlLocation = "http://192.168.105.47:8003/home/tigo/hn/digital/homeotcreator/v1?wsdl")
public class ServiceHomeWsSOAPQSService
    extends Service
{

    private final static URL SERVICEHOMEWSSOAPQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEHOMEWSSOAPQSSERVICE_EXCEPTION;
    private final static QName SERVICEHOMEWSSOAPQSSERVICE_QNAME = new QName("http://tigo.com/commons/resources/serviceHome", "ServiceHome_wsSOAPQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.105.47:8003/home/tigo/hn/digital/homeotcreator/v1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEHOMEWSSOAPQSSERVICE_WSDL_LOCATION = url;
        SERVICEHOMEWSSOAPQSSERVICE_EXCEPTION = e;
    }

    public ServiceHomeWsSOAPQSService() {
        super(__getWsdlLocation(), SERVICEHOMEWSSOAPQSSERVICE_QNAME);
    }

    public ServiceHomeWsSOAPQSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEHOMEWSSOAPQSSERVICE_QNAME, features);
    }

    public ServiceHomeWsSOAPQSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEHOMEWSSOAPQSSERVICE_QNAME);
    }

    public ServiceHomeWsSOAPQSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEHOMEWSSOAPQSSERVICE_QNAME, features);
    }

    public ServiceHomeWsSOAPQSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceHomeWsSOAPQSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceHomePort
     */
    @WebEndpoint(name = "ServiceHome_wsSOAPQSPort")
    public ServiceHomePort getServiceHomeWsSOAPQSPort() {
        return super.getPort(new QName("http://tigo.com/commons/resources/serviceHome", "ServiceHome_wsSOAPQSPort"), ServiceHomePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceHomePort
     */
    @WebEndpoint(name = "ServiceHome_wsSOAPQSPort")
    public ServiceHomePort getServiceHomeWsSOAPQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tigo.com/commons/resources/serviceHome", "ServiceHome_wsSOAPQSPort"), ServiceHomePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEHOMEWSSOAPQSSERVICE_EXCEPTION!= null) {
            throw SERVICEHOMEWSSOAPQSSERVICE_EXCEPTION;
        }
        return SERVICEHOMEWSSOAPQSSERVICE_WSDL_LOCATION;
    }

}
