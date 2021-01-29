
package ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountBalanceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountBalanceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="myreturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBalanceResponse", propOrder = {
    "myreturn"
})
public class AccountBalanceResponse {

    protected String myreturn;

    /**
     * Gets the value of the myreturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyreturn() {
        return myreturn;
    }

    /**
     * Sets the value of the myreturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyreturn(String value) {
        this.myreturn = value;
    }

}
