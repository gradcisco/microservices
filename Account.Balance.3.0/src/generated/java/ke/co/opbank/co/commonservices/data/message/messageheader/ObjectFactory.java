
package ke.co.opbank.co.commonservices.data.message.messageheader;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ke.co.opbank.co.commonservices.data.message.messageheader package. 
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

    private final static QName _ApplicationVersion_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "ApplicationVersion");
    private final static QName _RequestHeader_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "RequestHeader");
    private final static QName _ResponseHeader_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "ResponseHeader");
    private final static QName _FaultTO_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "FaultTO");
    private final static QName _MessageID_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "MessageID");
    private final static QName _ReplyTO_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "ReplyTO");
    private final static QName _Credentials_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "Credentials");
    private final static QName _ElapsedTime_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "ElapsedTime");
    private final static QName _StatusCode_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "StatusCode");
    private final static QName _StatusDescription_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "StatusDescription");
    private final static QName _StatusDescriptionKey_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "StatusDescriptionKey");
    private final static QName _StatusMessages_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "StatusMessages");
    private final static QName _CredentialsTypeSystemCode_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "SystemCode");
    private final static QName _CredentialsTypeUsername_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "Username");
    private final static QName _CredentialsTypePassword_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "Password");
    private final static QName _CredentialsTypeRealm_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", "Realm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ke.co.opbank.co.commonservices.data.message.messageheader
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseHeaderType }
     * 
     */
    public ResponseHeaderType createResponseHeaderType() {
        return new ResponseHeaderType();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link CredentialsType }
     * 
     */
    public CredentialsType createCredentialsType() {
        return new CredentialsType();
    }

    /**
     * Create an instance of {@link StatusMessagesType }
     * 
     */
    public StatusMessagesType createStatusMessagesType() {
        return new StatusMessagesType();
    }

    /**
     * Create an instance of {@link OperationRequest }
     * 
     */
    public OperationRequest createOperationRequest() {
        return new OperationRequest();
    }

    /**
     * Create an instance of {@link Operation1Request }
     * 
     */
    public Operation1Request createOperation1Request() {
        return new Operation1Request();
    }

    /**
     * Create an instance of {@link Operation1Response }
     * 
     */
    public Operation1Response createOperation1Response() {
        return new Operation1Response();
    }

    /**
     * Create an instance of {@link OperationRequest1 }
     * 
     */
    public OperationRequest1 createOperationRequest1() {
        return new OperationRequest1();
    }

    /**
     * Create an instance of {@link OperationResponse }
     * 
     */
    public OperationResponse createOperationResponse() {
        return new OperationResponse();
    }

    /**
     * Create an instance of {@link OperationRequest2 }
     * 
     */
    public OperationRequest2 createOperationRequest2() {
        return new OperationRequest2();
    }

    /**
     * Create an instance of {@link OperationResponse1 }
     * 
     */
    public OperationResponse1 createOperationResponse1() {
        return new OperationResponse1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "ApplicationVersion")
    public JAXBElement<String> createApplicationVersion(String value) {
        return new JAXBElement<String>(_ApplicationVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "RequestHeader")
    public JAXBElement<RequestHeaderType> createRequestHeader(RequestHeaderType value) {
        return new JAXBElement<RequestHeaderType>(_RequestHeader_QNAME, RequestHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseHeaderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseHeaderType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "ResponseHeader")
    public JAXBElement<ResponseHeaderType> createResponseHeader(ResponseHeaderType value) {
        return new JAXBElement<ResponseHeaderType>(_ResponseHeader_QNAME, ResponseHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "FaultTO")
    public JAXBElement<String> createFaultTO(String value) {
        return new JAXBElement<String>(_FaultTO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "MessageID")
    public JAXBElement<String> createMessageID(String value) {
        return new JAXBElement<String>(_MessageID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "ReplyTO")
    public JAXBElement<String> createReplyTO(String value) {
        return new JAXBElement<String>(_ReplyTO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredentialsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CredentialsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "Credentials")
    public JAXBElement<CredentialsType> createCredentials(CredentialsType value) {
        return new JAXBElement<CredentialsType>(_Credentials_QNAME, CredentialsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "ElapsedTime")
    public JAXBElement<Long> createElapsedTime(Long value) {
        return new JAXBElement<Long>(_ElapsedTime_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "StatusCode")
    public JAXBElement<String> createStatusCode(String value) {
        return new JAXBElement<String>(_StatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "StatusDescription")
    public JAXBElement<String> createStatusDescription(String value) {
        return new JAXBElement<String>(_StatusDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "StatusDescriptionKey")
    public JAXBElement<String> createStatusDescriptionKey(String value) {
        return new JAXBElement<String>(_StatusDescriptionKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusMessagesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusMessagesType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "StatusMessages")
    public JAXBElement<StatusMessagesType> createStatusMessages(StatusMessagesType value) {
        return new JAXBElement<StatusMessagesType>(_StatusMessages_QNAME, StatusMessagesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "SystemCode", scope = CredentialsType.class)
    public JAXBElement<String> createCredentialsTypeSystemCode(String value) {
        return new JAXBElement<String>(_CredentialsTypeSystemCode_QNAME, String.class, CredentialsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "Username", scope = CredentialsType.class)
    public JAXBElement<String> createCredentialsTypeUsername(String value) {
        return new JAXBElement<String>(_CredentialsTypeUsername_QNAME, String.class, CredentialsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "Password", scope = CredentialsType.class)
    public JAXBElement<String> createCredentialsTypePassword(String value) {
        return new JAXBElement<String>(_CredentialsTypePassword_QNAME, String.class, CredentialsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", name = "Realm", scope = CredentialsType.class)
    public JAXBElement<String> createCredentialsTypeRealm(String value) {
        return new JAXBElement<String>(_CredentialsTypeRealm_QNAME, String.class, CredentialsType.class, value);
    }

}
