
package ke.co.opbank.co.commonservices.data.event.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import ke.co.opbank.co.commonservices.data.message.messageheader.ResponseHeaderType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ke.co.opbank.co.commonservices.data.event.fault package. 
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

    private final static QName _Application_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "Application");
    private final static QName _ExceptionDescription_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "ExceptionDescription");
    private final static QName _ExceptionDetails_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "ExceptionDetails");
    private final static QName _FaultDetails_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "FaultDetails");
    private final static QName _ExceptionId_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "ExceptionId");
    private final static QName _ExceptionCode_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "ExceptionCode");
    private final static QName _ExceptionName_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "ExceptionName");
    private final static QName _ExceptionTimestamp_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "ExceptionTimestamp");
    private final static QName _Fault_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "Fault");
    private final static QName _FaultContext_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "FaultContext");
    private final static QName _FaultHeader_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "FaultHeader");
    private final static QName _Hostname_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "Hostname");
    private final static QName _Instance_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "Instance");
    private final static QName _Severity_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "Severity");
    private final static QName _ValidationFault_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "ValidationFault");
    private final static QName _TechnicalFault_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "TechnicalFault");
    private final static QName _BusinessFault_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "BusinessFault");
    private final static QName _ActivityName_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "ActivityName");
    private final static QName _Msg_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "Msg");
    private final static QName _MsgCode_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "MsgCode");
    private final static QName _ProcessStack_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "ProcessStack");
    private final static QName _StackTrace_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", "StackTrace");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ke.co.opbank.co.commonservices.data.event.fault
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultDetailsType }
     * 
     */
    public FaultDetailsType createFaultDetailsType() {
        return new FaultDetailsType();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link FaultContextType }
     * 
     */
    public FaultContextType createFaultContextType() {
        return new FaultContextType();
    }

    /**
     * Create an instance of {@link FaultListType }
     * 
     */
    public FaultListType createFaultListType() {
        return new FaultListType();
    }

    /**
     * Create an instance of {@link FaultDetailsType.Data }
     * 
     */
    public FaultDetailsType.Data createFaultDetailsTypeData() {
        return new FaultDetailsType.Data();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "Application")
    public JAXBElement<String> createApplication(String value) {
        return new JAXBElement<String>(_Application_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "ExceptionDescription")
    public JAXBElement<String> createExceptionDescription(String value) {
        return new JAXBElement<String>(_ExceptionDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "ExceptionDetails")
    public JAXBElement<String> createExceptionDetails(String value) {
        return new JAXBElement<String>(_ExceptionDetails_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "FaultDetails")
    public JAXBElement<FaultDetailsType> createFaultDetails(FaultDetailsType value) {
        return new JAXBElement<FaultDetailsType>(_FaultDetails_QNAME, FaultDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "ExceptionId")
    public JAXBElement<String> createExceptionId(String value) {
        return new JAXBElement<String>(_ExceptionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "ExceptionCode")
    public JAXBElement<String> createExceptionCode(String value) {
        return new JAXBElement<String>(_ExceptionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "ExceptionName")
    public JAXBElement<String> createExceptionName(String value) {
        return new JAXBElement<String>(_ExceptionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "ExceptionTimestamp")
    public JAXBElement<XMLGregorianCalendar> createExceptionTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExceptionTimestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "Fault")
    public JAXBElement<FaultType> createFault(FaultType value) {
        return new JAXBElement<FaultType>(_Fault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultContextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultContextType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "FaultContext")
    public JAXBElement<FaultContextType> createFaultContext(FaultContextType value) {
        return new JAXBElement<FaultContextType>(_FaultContext_QNAME, FaultContextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseHeaderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseHeaderType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "FaultHeader")
    public JAXBElement<ResponseHeaderType> createFaultHeader(ResponseHeaderType value) {
        return new JAXBElement<ResponseHeaderType>(_FaultHeader_QNAME, ResponseHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "Hostname")
    public JAXBElement<String> createHostname(String value) {
        return new JAXBElement<String>(_Hostname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "Instance")
    public JAXBElement<String> createInstance(String value) {
        return new JAXBElement<String>(_Instance_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "Severity")
    public JAXBElement<String> createSeverity(String value) {
        return new JAXBElement<String>(_Severity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "ValidationFault")
    public JAXBElement<FaultType> createValidationFault(FaultType value) {
        return new JAXBElement<FaultType>(_ValidationFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "TechnicalFault")
    public JAXBElement<FaultType> createTechnicalFault(FaultType value) {
        return new JAXBElement<FaultType>(_TechnicalFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "BusinessFault")
    public JAXBElement<FaultType> createBusinessFault(FaultType value) {
        return new JAXBElement<FaultType>(_BusinessFault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "ActivityName")
    public JAXBElement<String> createActivityName(String value) {
        return new JAXBElement<String>(_ActivityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "Msg")
    public JAXBElement<String> createMsg(String value) {
        return new JAXBElement<String>(_Msg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "MsgCode")
    public JAXBElement<String> createMsgCode(String value) {
        return new JAXBElement<String>(_MsgCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "ProcessStack")
    public JAXBElement<String> createProcessStack(String value) {
        return new JAXBElement<String>(_ProcessStack_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault", name = "StackTrace")
    public JAXBElement<String> createStackTrace(String value) {
        return new JAXBElement<String>(_StackTrace_QNAME, String.class, null, value);
    }

}
