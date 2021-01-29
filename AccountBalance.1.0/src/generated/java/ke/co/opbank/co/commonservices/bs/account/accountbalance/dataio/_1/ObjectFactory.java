
package ke.co.opbank.co.commonservices.bs.account.accountbalance.dataio._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ke.co.opbank.co.commonservices.data.message.messageheader.RequestHeaderType;
import ke.co.opbank.co.commonservices.data.message.messageheader.ResponseHeaderType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ke.co.opbank.co.commonservices.bs.account.accountbalance.dataio._1 package. 
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

    private final static QName _DataInput_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/BS/Account/AccountBalance/DataIO/1.2", "DataInput");
    private final static QName _DataOutput_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/BS/Account/AccountBalance/DataIO/1.2", "DataOutput");
    private final static QName _RequestHeader_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/BS/Account/AccountBalance/DataIO/1.2", "RequestHeader");
    private final static QName _ReplyHeader_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/BS/Account/AccountBalance/DataIO/1.2", "ReplyHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ke.co.opbank.co.commonservices.bs.account.accountbalance.dataio._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountBalanceRequest }
     * 
     */
    public AccountBalanceRequest createAccountBalanceRequest() {
        return new AccountBalanceRequest();
    }

    /**
     * Create an instance of {@link AccountBalanceResponse }
     * 
     */
    public AccountBalanceResponse createAccountBalanceResponse() {
        return new AccountBalanceResponse();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link OperationParametersType }
     * 
     */
    public OperationParametersType createOperationParametersType() {
        return new OperationParametersType();
    }

    /**
     * Create an instance of {@link AccType }
     * 
     */
    public AccType createAccType() {
        return new AccType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountBalanceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountBalanceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/BS/Account/AccountBalance/DataIO/1.2", name = "DataInput")
    public JAXBElement<AccountBalanceRequest> createDataInput(AccountBalanceRequest value) {
        return new JAXBElement<AccountBalanceRequest>(_DataInput_QNAME, AccountBalanceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountBalanceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountBalanceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/BS/Account/AccountBalance/DataIO/1.2", name = "DataOutput")
    public JAXBElement<AccountBalanceResponse> createDataOutput(AccountBalanceResponse value) {
        return new JAXBElement<AccountBalanceResponse>(_DataOutput_QNAME, AccountBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/BS/Account/AccountBalance/DataIO/1.2", name = "RequestHeader")
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
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/BS/Account/AccountBalance/DataIO/1.2", name = "ReplyHeader")
    public JAXBElement<ResponseHeaderType> createReplyHeader(ResponseHeaderType value) {
        return new JAXBElement<ResponseHeaderType>(_ReplyHeader_QNAME, ResponseHeaderType.class, null, value);
    }

}
