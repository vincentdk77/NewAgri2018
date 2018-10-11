
package com.sinosoft.demo.core.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewAgriPrpallService", targetNamespace = "http://server_second.webservice.indiv.sinosoft.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewAgriPrpallService {


    /**
     * 
     * @param message
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "testWebServiceReturn", targetNamespace = "http://service.webservice.newagriprpall.sinosoft.com")
    @RequestWrapper(localName = "testWebService", targetNamespace = "http://service.webservice.newagriprpall.sinosoft.com", className = "com.sinosoft.demo.core.webservice.TestWebService")
    @ResponseWrapper(localName = "testWebServiceResponse", targetNamespace = "http://service.webservice.newagriprpall.sinosoft.com", className = "com.sinosoft.demo.core.webservice.TestWebServiceResponse")
    public String testWebService(
            @WebParam(name = "message", targetNamespace = "http://service.webservice.newagriprpall.sinosoft.com")
                    String message);

    /**
     * 
     * @param requestXML
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "underwriteSubmitReturn", targetNamespace = "http://service.webservice.newagriprpall.sinosoft.com")
    @RequestWrapper(localName = "underwriteSubmit", targetNamespace = "http://service.webservice.newagriprpall.sinosoft.com", className = "com.sinosoft.demo.core.webservice.UnderwriteSubmit")
    @ResponseWrapper(localName = "underwriteSubmitResponse", targetNamespace = "http://service.webservice.newagriprpall.sinosoft.com", className = "com.sinosoft.demo.core.webservice.UnderwriteSubmitResponse")
    public String underwriteSubmit(
            @WebParam(name = "requestXML", targetNamespace = "http://service.webservice.newagriprpall.sinosoft.com")
                    String requestXML);

}