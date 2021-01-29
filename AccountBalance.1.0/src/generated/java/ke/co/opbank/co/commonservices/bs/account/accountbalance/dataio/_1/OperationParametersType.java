
package ke.co.opbank.co.commonservices.bs.account.accountbalance.dataio._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BalanceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AveragePeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationParametersType", propOrder = {
    "balanceType",
    "averagePeriod"
})
public class OperationParametersType {

    @XmlElement(name = "BalanceType", required = true)
    protected String balanceType;
    @XmlElement(name = "AveragePeriod")
    protected Integer averagePeriod;

    /**
     * Gets the value of the balanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * Sets the value of the balanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    /**
     * Gets the value of the averagePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAveragePeriod() {
        return averagePeriod;
    }

    /**
     * Sets the value of the averagePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAveragePeriod(Integer value) {
        this.averagePeriod = value;
    }

}
