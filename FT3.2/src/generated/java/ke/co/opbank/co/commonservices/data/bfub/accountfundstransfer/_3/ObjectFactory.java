
package ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3 package. 
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

    private final static QName _RequestBodyType_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/BFUB/AccountFundsTransfer/3.2", "RequestBodyType");
    private final static QName _ResponseBodyType_QNAME = new QName("urn://co-opbank.co.ke/CommonServices/Data/BFUB/AccountFundsTransfer/3.2", "ResponseBodyType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccFundTrRequestType }
     * 
     */
    public AccFundTrRequestType createAccFundTrRequestType() {
        return new AccFundTrRequestType();
    }

    /**
     * Create an instance of {@link OperationParametersType }
     * 
     */
    public OperationParametersType createOperationParametersType() {
        return new OperationParametersType();
    }

    /**
     * Create an instance of {@link TransactionItemsType }
     * 
     */
    public TransactionItemsType createTransactionItemsType() {
        return new TransactionItemsType();
    }

    /**
     * Create an instance of {@link TransactionItemType }
     * 
     */
    public TransactionItemType createTransactionItemType() {
        return new TransactionItemType();
    }

    /**
     * Create an instance of {@link ExchangeRateDetailsType }
     * 
     */
    public ExchangeRateDetailsType createExchangeRateDetailsType() {
        return new ExchangeRateDetailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccFundTrRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccFundTrRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/BFUB/AccountFundsTransfer/3.2", name = "RequestBodyType")
    public JAXBElement<AccFundTrRequestType> createRequestBodyType(AccFundTrRequestType value) {
        return new JAXBElement<AccFundTrRequestType>(_RequestBodyType_QNAME, AccFundTrRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn://co-opbank.co.ke/CommonServices/Data/BFUB/AccountFundsTransfer/3.2", name = "ResponseBodyType")
    public JAXBElement<String> createResponseBodyType(String value) {
        return new JAXBElement<String>(_ResponseBodyType_QNAME, String.class, null, value);
    }

}
