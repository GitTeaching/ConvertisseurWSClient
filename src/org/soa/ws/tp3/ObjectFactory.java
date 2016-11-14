
package org.soa.ws.tp3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soa.ws.tp3 package. 
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

    private final static QName _GetDinarFromEuro_QNAME = new QName("http://tp3.ws.soa.org/", "getDinarFromEuro");
    private final static QName _DinarVersEuro_QNAME = new QName("http://tp3.ws.soa.org/", "DinarVersEuro");
    private final static QName _DinarVersEuroResponse_QNAME = new QName("http://tp3.ws.soa.org/", "DinarVersEuroResponse");
    private final static QName _GetDinarFromEuroResponse_QNAME = new QName("http://tp3.ws.soa.org/", "getDinarFromEuroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soa.ws.tp3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDinarFromEuroResponse }
     * 
     */
    public GetDinarFromEuroResponse createGetDinarFromEuroResponse() {
        return new GetDinarFromEuroResponse();
    }

    /**
     * Create an instance of {@link DinarVersEuroResponse }
     * 
     */
    public DinarVersEuroResponse createDinarVersEuroResponse() {
        return new DinarVersEuroResponse();
    }

    /**
     * Create an instance of {@link DinarVersEuro }
     * 
     */
    public DinarVersEuro createDinarVersEuro() {
        return new DinarVersEuro();
    }

    /**
     * Create an instance of {@link GetDinarFromEuro }
     * 
     */
    public GetDinarFromEuro createGetDinarFromEuro() {
        return new GetDinarFromEuro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDinarFromEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp3.ws.soa.org/", name = "getDinarFromEuro")
    public JAXBElement<GetDinarFromEuro> createGetDinarFromEuro(GetDinarFromEuro value) {
        return new JAXBElement<GetDinarFromEuro>(_GetDinarFromEuro_QNAME, GetDinarFromEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DinarVersEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp3.ws.soa.org/", name = "DinarVersEuro")
    public JAXBElement<DinarVersEuro> createDinarVersEuro(DinarVersEuro value) {
        return new JAXBElement<DinarVersEuro>(_DinarVersEuro_QNAME, DinarVersEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DinarVersEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp3.ws.soa.org/", name = "DinarVersEuroResponse")
    public JAXBElement<DinarVersEuroResponse> createDinarVersEuroResponse(DinarVersEuroResponse value) {
        return new JAXBElement<DinarVersEuroResponse>(_DinarVersEuroResponse_QNAME, DinarVersEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDinarFromEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp3.ws.soa.org/", name = "getDinarFromEuroResponse")
    public JAXBElement<GetDinarFromEuroResponse> createGetDinarFromEuroResponse(GetDinarFromEuroResponse value) {
        return new JAXBElement<GetDinarFromEuroResponse>(_GetDinarFromEuroResponse_QNAME, GetDinarFromEuroResponse.class, null, value);
    }

}
