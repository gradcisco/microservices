
package ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountBalanceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountBalanceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationParameters" type="{urn://co-opbank.co.ke/CommonServices/Data/BFUB/AccountFundsTransfer/3.2}OperationParametersType"/&gt;
 *         &lt;element name="Account" type="{urn://co-opbank.co.ke/CommonServices/Data/BFUB/AccountFundsTransfer/3.2}AccountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBalanceRequest", propOrder = {
    "operationParameters",
    "account"
})
public class AccountBalanceRequest {

    @XmlElement(name = "OperationParameters", required = true)
    protected OperationParametersType operationParameters;
    @XmlElement(name = "Account", required = true)
    protected AccountType account;

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
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount(AccountType value) {
        this.account = value;
    }

}
