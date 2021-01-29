
package ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="MessageReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NoOfElements" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallBackUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransferType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExchangeRateDetails" type="{urn://co-opbank.co.ke/CommonServices/Data/BFUB/AccountFundsTransfer/3.2}ExchangeRateDetailsType" minOccurs="0"/&gt;
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
    "messageReference",
    "messageType",
    "channelID",
    "userID",
    "messageDateTime",
    "valueDate",
    "noOfElements",
    "customerNumber",
    "callBackUrl",
    "operationId",
    "transferType",
    "exchangeRateDetails"
})
public class OperationParametersType {

    @XmlElement(name = "MessageReference")
    protected String messageReference;
    @XmlElement(name = "MessageType")
    protected String messageType;
    @XmlElement(name = "ChannelID")
    protected String channelID;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "MessageDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageDateTime;
    @XmlElement(name = "ValueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valueDate;
    @XmlElement(name = "NoOfElements")
    protected Integer noOfElements;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "CallBackUrl")
    protected String callBackUrl;
    @XmlElement(name = "OperationId", required = true)
    protected String operationId;
    @XmlElement(name = "TransferType", required = true)
    protected String transferType;
    @XmlElement(name = "ExchangeRateDetails")
    protected ExchangeRateDetailsType exchangeRateDetails;

    /**
     * Gets the value of the messageReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageReference() {
        return messageReference;
    }

    /**
     * Sets the value of the messageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageReference(String value) {
        this.messageReference = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the channelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * Sets the value of the channelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelID(String value) {
        this.channelID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the messageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageDateTime() {
        return messageDateTime;
    }

    /**
     * Sets the value of the messageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageDateTime(XMLGregorianCalendar value) {
        this.messageDateTime = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the noOfElements property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfElements() {
        return noOfElements;
    }

    /**
     * Sets the value of the noOfElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfElements(Integer value) {
        this.noOfElements = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the callBackUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBackUrl() {
        return callBackUrl;
    }

    /**
     * Sets the value of the callBackUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBackUrl(String value) {
        this.callBackUrl = value;
    }

    /**
     * Gets the value of the operationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * Sets the value of the operationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationId(String value) {
        this.operationId = value;
    }

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferType(String value) {
        this.transferType = value;
    }

    /**
     * Gets the value of the exchangeRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDetailsType }
     *     
     */
    public ExchangeRateDetailsType getExchangeRateDetails() {
        return exchangeRateDetails;
    }

    /**
     * Sets the value of the exchangeRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDetailsType }
     *     
     */
    public void setExchangeRateDetails(ExchangeRateDetailsType value) {
        this.exchangeRateDetails = value;
    }

}
