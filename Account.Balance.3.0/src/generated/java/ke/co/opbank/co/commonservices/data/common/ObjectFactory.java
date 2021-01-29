
package ke.co.opbank.co.commonservices.data.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ke.co.opbank.co.commonservices.data.common package. 
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

    private final static QName _CorrelationId_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Common", "CorrelationId");
    private final static QName _CustomerId_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Common", "CustomerId");
    private final static QName _CreationTimestamp_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Common", "CreationTimestamp");
    private final static QName _CorrelationID_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Common", "CorrelationID");
    private final static QName _MessageID_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Common", "MessageID");
    private final static QName _Payload_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Common", "Payload");
    private final static QName _Domain_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Common", "Domain");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ke.co.opbank.co.commonservices.data.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayloadType }
     * 
     */
    public PayloadType createPayloadType() {
        return new PayloadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Common", name = "CorrelationId")
    public JAXBElement<String> createCorrelationId(String value) {
        return new JAXBElement<String>(_CorrelationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Common", name = "CustomerId")
    public JAXBElement<String> createCustomerId(String value) {
        return new JAXBElement<String>(_CustomerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Common", name = "CreationTimestamp")
    public JAXBElement<XMLGregorianCalendar> createCreationTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreationTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Common", name = "CorrelationID")
    public JAXBElement<String> createCorrelationID(String value) {
        return new JAXBElement<String>(_CorrelationID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Common", name = "MessageID")
    public JAXBElement<String> createMessageID(String value) {
        return new JAXBElement<String>(_MessageID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayloadType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PayloadType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Common", name = "Payload")
    public JAXBElement<PayloadType> createPayload(PayloadType value) {
        return new JAXBElement<PayloadType>(_Payload_QNAME, PayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Common", name = "Domain")
    public JAXBElement<String> createDomain(String value) {
        return new JAXBElement<String>(_Domain_QNAME, String.class, null, value);
    }

}
