
package ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccFundTrRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccFundTrRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationParameters" type="{urn://co-opbank.co.ke/CommonServices/Data/BFUB/AccountFundsTransfer/3.2}OperationParametersType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionItems" type="{urn://co-opbank.co.ke/CommonServices/Data/BFUB/AccountFundsTransfer/3.2}TransactionItemsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccFundTrRequestType", propOrder = {
    "operationParameters",
    "transactionItems"
})
public class AccFundTrRequestType {

    @XmlElement(name = "OperationParameters")
    protected OperationParametersType operationParameters;
    @XmlElement(name = "TransactionItems", required = true)
    protected TransactionItemsType transactionItems;

    /**
     * Gets the value of the operationParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OperationParametersType }
     *     
     */
    public OperationParametersType getOperationParameters() {
        return operationParameters;
    }

    /**
     * Sets the value of the operationParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationParametersType }
     *     
     */
    public void setOperationParameters(OperationParametersType value) {
        this.operationParameters = value;
    }

    /**
     * Gets the value of the transactionItems property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionItemsType }
     *     
     */
    public TransactionItemsType getTransactionItems() {
        return transactionItems;
    }

    /**
     * Sets the value of the transactionItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionItemsType }
     *     
     */
    public void setTransactionItems(TransactionItemsType value) {
        this.transactionItems = value;
    }

}
