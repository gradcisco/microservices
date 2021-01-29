
package ke.co.opbank.co.commonservices.data.message.messageheader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Common}CreationTimestamp" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Common}CorrelationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader}FaultTO" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader}MessageID"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader}ReplyTO" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader}Credentials" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeaderType", propOrder = {
    "creationTimestamp",
    "correlationID",
    "faultTO",
    "messageID",
    "replyTO",
    "credentials"
})
public class RequestHeaderType {

    @XmlElement(name = "CreationTimestamp", namespace = "urn://co-opbank.co.ke/CommonServices/Data/Common")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimestamp;
    @XmlElement(name = "CorrelationID", namespace = "urn://co-opbank.co.ke/CommonServices/Data/Common")
    protected String correlationID;
    @XmlElement(name = "FaultTO")
    protected String faultTO;
    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(name = "ReplyTO")
    protected String replyTO;
    @XmlElement(name = "Credentials")
    protected CredentialsType credentials;

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTimestamp(XMLGregorianCalendar value) {
        this.creationTimestamp = value;
    }

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
     * Gets the value of the faultTO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultTO() {
        return faultTO;
    }

    /**
     * Sets the value of the faultTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultTO(String value) {
        this.faultTO = value;
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
     * Gets the value of the replyTO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyTO() {
        return replyTO;
    }

    /**
     * Sets the value of the replyTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyTO(String value) {
        this.replyTO = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialsType }
     *     
     */
    public CredentialsType getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialsType }
     *     
     */
    public void setCredentials(CredentialsType value) {
        this.credentials = value;
    }

}
