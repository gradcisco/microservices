
package ke.co.opbank.co.commonservices.data.internal.runtimecontext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuntimeContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuntimeContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext}ServiceName"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext}Application"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext}ApplicationVersion"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext}AppNode"/&gt;
 *         &lt;element ref="{urn://co-opbank.co.ke/CommonServices/Data/Internal/RuntimeContext}Hostname"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeContextType", propOrder = {
    "serviceName",
    "application",
    "applicationVersion",
    "appNode",
    "hostname"
})
public class RuntimeContextType {

    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlElement(name = "Application", required = true)
    protected String application;
    @XmlElement(name = "ApplicationVersion", required = true)
    protected String applicationVersion;
    @XmlElement(name = "AppNode", required = true)
    protected String appNode;
    @XmlElement(name = "Hostname", required = true)
    protected String hostname;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the applicationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * Sets the value of the applicationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationVersion(String value) {
        this.applicationVersion = value;
    }

    /**
     * Gets the value of the appNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppNode() {
        return appNode;
    }

    /**
     * Sets the value of the appNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppNode(String value) {
        this.appNode = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

}
