
package org.soa.ws.tp3;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConvertisseurDinarEuro", targetNamespace = "http://tp3.ws.soa.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConvertisseurDinarEuro {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "DinarVersEuro")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DinarVersEuro", targetNamespace = "http://tp3.ws.soa.org/", className = "org.soa.ws.tp3.DinarVersEuro")
    @ResponseWrapper(localName = "DinarVersEuroResponse", targetNamespace = "http://tp3.ws.soa.org/", className = "org.soa.ws.tp3.DinarVersEuroResponse")
    @Action(input = "http://tp3.ws.soa.org/ConvertisseurDinarEuro/DinarVersEuroRequest", output = "http://tp3.ws.soa.org/ConvertisseurDinarEuro/DinarVersEuroResponse")
    public double dinarVersEuro(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param montantEuro
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "montantDinar", targetNamespace = "")
    @RequestWrapper(localName = "getDinarFromEuro", targetNamespace = "http://tp3.ws.soa.org/", className = "org.soa.ws.tp3.GetDinarFromEuro")
    @ResponseWrapper(localName = "getDinarFromEuroResponse", targetNamespace = "http://tp3.ws.soa.org/", className = "org.soa.ws.tp3.GetDinarFromEuroResponse")
    @Action(input = "http://tp3.ws.soa.org/ConvertisseurDinarEuro/getDinarFromEuroRequest", output = "http://tp3.ws.soa.org/ConvertisseurDinarEuro/getDinarFromEuroResponse")
    public double getDinarFromEuro(
        @WebParam(name = "montantEuro", targetNamespace = "")
        double montantEuro);

}
