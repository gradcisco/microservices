
package ke.co.opbank.co.commonservices.data.internal.runtimecontext;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ke.co.opbank.co.commonservices.data.internal.runtimecontext package. 
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

    private final static QName _RuntimeContext_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", "RuntimeContext");
    private final static QName _ServiceName_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", "ServiceName");
    private final static QName _Application_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", "Application");
    private final static QName _ApplicationVersion_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", "ApplicationVersion");
    private final static QName _AppNode_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", "AppNode");
    private final static QName _Hostname_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", "Hostname");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ke.co.opbank.co.commonservices.data.internal.runtimecontext
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RuntimeContextType }
     * 
     */
    public RuntimeContextType createRuntimeContextType() {
        return new RuntimeContextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuntimeContextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RuntimeContextType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", name = "RuntimeContext")
    public JAXBElement<RuntimeContextType> createRuntimeContext(RuntimeContextType value) {
        return new JAXBElement<RuntimeContextType>(_RuntimeContext_QNAME, RuntimeContextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", name = "ServiceName")
    public JAXBElement<String> createServiceName(String value) {
        return new JAXBElement<String>(_ServiceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", name = "Application")
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
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", name = "ApplicationVersion")
    public JAXBElement<String> createApplicationVersion(String value) {
        return new JAXBElement<String>(_ApplicationVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", name = "AppNode")
    public JAXBElement<String> createAppNode(String value) {
        return new JAXBElement<String>(_AppNode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext", name = "Hostname")
    public JAXBElement<String> createHostname(String value) {
        return new JAXBElement<String>(_Hostname_QNAME, String.class, null, value);
    }

}
