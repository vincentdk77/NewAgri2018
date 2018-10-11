
package com.sinosoft.agriclaim.core.common.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UIClaimPayService", targetNamespace = "http://server.webservice.indiv.sinosoft.com", wsdlLocation = "http://192.168.0.2:7701/webAgriPrpallService/services/UIClaimPayService?wsdl")
public class UIClaimPayService_Service
    extends Service
{

    private final static URL UICLAIMPAYSERVICE_WSDL_LOCATION;
    private final static WebServiceException UICLAIMPAYSERVICE_EXCEPTION;
    private final static QName UICLAIMPAYSERVICE_QNAME = new QName("http://server.webservice.indiv.sinosoft.com", "UIClaimPayService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.2:7701/webAgriPrpallService/services/UIClaimPayService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UICLAIMPAYSERVICE_WSDL_LOCATION = url;
        UICLAIMPAYSERVICE_EXCEPTION = e;
    }

    public UIClaimPayService_Service() {
        super(__getWsdlLocation(), UICLAIMPAYSERVICE_QNAME);
    }

    public UIClaimPayService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), UICLAIMPAYSERVICE_QNAME, features);
    }

    public UIClaimPayService_Service(URL wsdlLocation) {
        super(wsdlLocation, UICLAIMPAYSERVICE_QNAME);
    }

    public UIClaimPayService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UICLAIMPAYSERVICE_QNAME, features);
    }

    public UIClaimPayService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UIClaimPayService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UIClaimPayService
     */
    @WebEndpoint(name = "UIClaimPayService")
    public UIClaimPayService getUIClaimPayService() {
        return super.getPort(new QName("http://server.webservice.indiv.sinosoft.com", "UIClaimPayService"), UIClaimPayService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UIClaimPayService
     */
    @WebEndpoint(name = "UIClaimPayService")
    public UIClaimPayService getUIClaimPayService(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.webservice.indiv.sinosoft.com", "UIClaimPayService"), UIClaimPayService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UICLAIMPAYSERVICE_EXCEPTION!= null) {
            throw UICLAIMPAYSERVICE_EXCEPTION;
        }
        return UICLAIMPAYSERVICE_WSDL_LOCATION;
    }

}
