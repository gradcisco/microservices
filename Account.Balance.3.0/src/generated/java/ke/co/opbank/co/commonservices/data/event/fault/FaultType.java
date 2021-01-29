
package ke.co.opbank.co.commonservices.data.event.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ke.co.opbank.co.commonservices.data.common.PayloadType;
import ke.co.opbank.co.commonservices.data.internal.runtimecontext.RuntimeContextType;
import ke.co.opbank.co.commonservices.data.message.messageheader.ResponseHeaderType;


/**
 * <p>Java class for FaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Event/Fault}FaultHeader"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Event/Fault}Severity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Event/Fault}ExceptionId"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Event/Fault}ExceptionTimestamp"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Event/Fault}ExceptionCode"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Event/Fault}ExceptionName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Event/Fault}ExceptionDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Event/Fault}ExceptionDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Event/Fault}FaultDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext}RuntimeContext" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Common}Payload" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultType", propOrder = {
    "faultHeader",
    "severity",
    "exceptionId",
    "exceptionTimestamp",
    "exceptionCode",
    "exceptionName",
    "exceptionDescription",
    "exceptionDetails",
    "faultDetails",
    "runtimeContext",
    "payload"
})
public class FaultType {

    @XmlElement(name = "FaultHeader", required = true)
    protected ResponseHeaderType faultHeader;
    @XmlElement(name = "Severity")
    protected String severity;
    @XmlElement(name = "ExceptionId", required = true)
    protected String exceptionId;
    @XmlElement(name = "ExceptionTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exceptionTimestamp;
    @XmlElement(name = "ExceptionCode", required = true)
    protected String exceptionCode;
    @XmlElement(name = "ExceptionName")
    protected String exceptionName;
    @XmlElement(name = "ExceptionDescription")
    protected String exceptionDescription;
    @XmlElement(name = "ExceptionDetails")
    protected String exceptionDetails;
    @XmlElement(name = "FaultDetails")
    protected FaultDetailsType faultDetails;
    @XmlElement(name = "RuntimeContext", namespace = "urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext")
    protected RuntimeContextType runtimeContext;
    @XmlElement(name = "Payload", namespace = "urn://co-opbank.co.ke/CommonServices/Data/Common")
    protected PayloadType payload;

    /**
     * Gets the value of the faultHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeaderType }
     *     
     */
    public ResponseHeaderType getFaultHeader() {
        return faultHeader;
    }

    /**
     * Sets the value of the faultHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeaderType }
     *     
     */
    public void setFaultHeader(ResponseHeaderType value) {
        this.faultHeader = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the exceptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionId() {
        return exceptionId;
    }

    /**
     * Sets the value of the exceptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionId(String value) {
        this.exceptionId = value;
    }

    /**
     * Gets the value of the exceptionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExceptionTimestamp() {
        return exceptionTimestamp;
    }

    /**
     * Sets the value of the exceptionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExceptionTimestamp(XMLGregorianCalendar value) {
        this.exceptionTimestamp = value;
    }

    /**
     * Gets the value of the exceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * Sets the value of the exceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionCode(String value) {
        this.exceptionCode = value;
    }

    /**
     * Gets the value of the exceptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionName() {
        return exceptionName;
    }

    /**
     * Sets the value of the exceptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionName(String value) {
        this.exceptionName = value;
    }

    /**
     * Gets the value of the exceptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionDescription() {
        return exceptionDescription;
    }

    /**
     * Sets the value of the exceptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionDescription(String value) {
        this.exceptionDescription = value;
    }

    /**
     * Gets the value of the exceptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionDetails() {
        return exceptionDetails;
    }

    /**
     * Sets the value of the exceptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionDetails(String value) {
        this.exceptionDetails = value;
    }

    /**
     * Gets the value of the faultDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FaultDetailsType }
     *     
     */
    public FaultDetailsType getFaultDetails() {
        return faultDetails;
    }

    /**
     * Sets the value of the faultDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultDetailsType }
     *     
     */
    public void setFaultDetails(FaultDetailsType value) {
        this.faultDetails = value;
    }

    /**
     * Gets the value of the runtimeContext property.
     * 
     * @return
     *     possible object is
     *     {@link RuntimeContextType }
     *     
     */
    public RuntimeContextType getRuntimeContext() {
        return runtimeContext;
    }

    /**
     * Sets the value of the runtimeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuntimeContextType }
     *     
     */
    public void setRuntimeContext(RuntimeContextType value) {
        this.runtimeContext = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link PayloadType }
     *     
     */
    public PayloadType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadType }
     *     
     */
    public void setPayload(PayloadType value) {
        this.payload = value;
    }

}
