
package pe.company.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.company.ws package. 
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

    private final static QName _CalculaIMC_QNAME = new QName("http://ws.company.pe/", "calculaIMC");
    private final static QName _CalculaIMCResponse_QNAME = new QName("http://ws.company.pe/", "calculaIMCResponse");
    private final static QName _CalculaTasaMet_QNAME = new QName("http://ws.company.pe/", "calculaTasaMet");
    private final static QName _CalculaTasaMetResponse_QNAME = new QName("http://ws.company.pe/", "calculaTasaMetResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.company.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculaIMC }
     * 
     */
    public CalculaIMC createCalculaIMC() {
        return new CalculaIMC();
    }

    /**
     * Create an instance of {@link CalculaIMCResponse }
     * 
     */
    public CalculaIMCResponse createCalculaIMCResponse() {
        return new CalculaIMCResponse();
    }

    /**
     * Create an instance of {@link CalculaTasaMet }
     * 
     */
    public CalculaTasaMet createCalculaTasaMet() {
        return new CalculaTasaMet();
    }

    /**
     * Create an instance of {@link CalculaTasaMetResponse }
     * 
     */
    public CalculaTasaMetResponse createCalculaTasaMetResponse() {
        return new CalculaTasaMetResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaIMC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculaIMC }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "calculaIMC")
    public JAXBElement<CalculaIMC> createCalculaIMC(CalculaIMC value) {
        return new JAXBElement<CalculaIMC>(_CalculaIMC_QNAME, CalculaIMC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaIMCResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculaIMCResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "calculaIMCResponse")
    public JAXBElement<CalculaIMCResponse> createCalculaIMCResponse(CalculaIMCResponse value) {
        return new JAXBElement<CalculaIMCResponse>(_CalculaIMCResponse_QNAME, CalculaIMCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaTasaMet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculaTasaMet }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "calculaTasaMet")
    public JAXBElement<CalculaTasaMet> createCalculaTasaMet(CalculaTasaMet value) {
        return new JAXBElement<CalculaTasaMet>(_CalculaTasaMet_QNAME, CalculaTasaMet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaTasaMetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculaTasaMetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "calculaTasaMetResponse")
    public JAXBElement<CalculaTasaMetResponse> createCalculaTasaMetResponse(CalculaTasaMetResponse value) {
        return new JAXBElement<CalculaTasaMetResponse>(_CalculaTasaMetResponse_QNAME, CalculaTasaMetResponse.class, null, value);
    }

}
