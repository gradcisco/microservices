
package ke.co.opbank.co.commonservices.data.message.messageheader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Common}CorrelationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader}ElapsedTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader}MessageID"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader}StatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader}StatusDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader}StatusDescriptionKey" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader}StatusMessages" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeaderType", propOrder = {
    "correlationID",
    "elapsedTime",
    "messageID",
    "statusCode",
    "statusDescription",
    "statusDescriptionKey",
    "statusMessages"
})
public class ResponseHeaderType {

    @XmlElement(name = "CorrelationID", namespace = "urn://co-opbank.co.ke/CommonServices/Data/Common")
    protected String correlationID;
    @XmlElement(name = "ElapsedTime")
    protected Long elapsedTime;
    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "StatusDescriptionKey")
    protected String statusDescriptionKey;
    @XmlElement(name = "StatusMessages")
    protected StatusMessagesType statusMessages;

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the elapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setElapsedTime(Long value) {
        this.elapsedTime = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the statusDescriptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescriptionKey() {
        return statusDescriptionKey;
    }

    /**
     * Sets the value of the statusDescriptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescriptionKey(String value) {
        this.statusDescriptionKey = value;
    }

    /**
     * Gets the value of the statusMessages property.
     * 
     * @return
     *     possible object is
     *     {@link StatusMessagesType }
     *     
     */
    public StatusMessagesType getStatusMessages() {
        return statusMessages;
    }

    /**
     * Sets the value of the statusMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusMessagesType }
     *     
     */
    public void setStatusMessages(StatusMessagesType value) {
        this.statusMessages = value;
    }

}
