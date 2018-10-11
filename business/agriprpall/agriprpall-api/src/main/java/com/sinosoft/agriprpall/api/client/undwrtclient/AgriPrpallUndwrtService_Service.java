
package com.sinosoft.agriprpall.api.client.undwrtclient;

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
@WebServiceClient(name = "AgriPrpallUndwrtService", targetNamespace = "http://server.webservice.indiv.sinosoft.com", wsdlLocation = "http://192.168.0.136:7001/webAgriPrpallService/services/AgriPrpallUndwrtService?wsdl")
public class AgriPrpallUndwrtService_Service
    extends Service
{

    private final static URL AGRIPRPALLUNDWRTSERVICE_WSDL_LOCATION;
    private final static WebServiceException AGRIPRPALLUNDWRTSERVICE_EXCEPTION;
    private final static QName AGRIPRPALLUNDWRTSERVICE_QNAME = new QName("http://server.webservice.indiv.sinosoft.com", "AgriPrpallUndwrtService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.136:7001/webAgriPrpallService/services/AgriPrpallUndwrtService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AGRIPRPALLUNDWRTSERVICE_WSDL_LOCATION = url;
        AGRIPRPALLUNDWRTSERVICE_EXCEPTION = e;
    }

    public AgriPrpallUndwrtService_Service() {
        super(__getWsdlLocation(), AGRIPRPALLUNDWRTSERVICE_QNAME);
    }

    public AgriPrpallUndwrtService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), AGRIPRPALLUNDWRTSERVICE_QNAME, features);
    }

    public AgriPrpallUndwrtService_Service(URL wsdlLocation) {
        super(wsdlLocation, AGRIPRPALLUNDWRTSERVICE_QNAME);
    }

    public AgriPrpallUndwrtService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AGRIPRPALLUNDWRTSERVICE_QNAME, features);
    }

    public AgriPrpallUndwrtService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AgriPrpallUndwrtService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AgriPrpallUndwrtService
     */
    @WebEndpoint(name = "AgriPrpallUndwrtService")
    public AgriPrpallUndwrtService getAgriPrpallUndwrtService() {
        return super.getPort(new QName("http://server.webservice.indiv.sinosoft.com", "AgriPrpallUndwrtService"), AgriPrpallUndwrtService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AgriPrpallUndwrtService
     */
    @WebEndpoint(name = "AgriPrpallUndwrtService")
    public AgriPrpallUndwrtService getAgriPrpallUndwrtService(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.webservice.indiv.sinosoft.com", "AgriPrpallUndwrtService"), AgriPrpallUndwrtService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AGRIPRPALLUNDWRTSERVICE_EXCEPTION!= null) {
            throw AGRIPRPALLUNDWRTSERVICE_EXCEPTION;
        }
        return AGRIPRPALLUNDWRTSERVICE_WSDL_LOCATION;
    }

}
