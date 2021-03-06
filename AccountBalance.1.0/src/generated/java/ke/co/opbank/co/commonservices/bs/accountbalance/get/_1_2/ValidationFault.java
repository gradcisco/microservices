
package ke.co.opbank.co.commonservices.bs.accountbalance.get._1_2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.2
 * 2021-01-29T15:05:21.064+03:00
 * Generated source version: 3.3.2
 */

@WebFault(name = "ValidationFault", targetNamespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault")
public class ValidationFault extends Exception {

    private ke.co.opbank.co.commonservices.data.event.fault.FaultType validationFault;

    public ValidationFault() {
        super();
    }

    public ValidationFault(String message) {
        super(message);
    }

    public ValidationFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ValidationFault(String message, ke.co.opbank.co.commonservices.data.event.fault.FaultType validationFault) {
        super(message);
        this.validationFault = validationFault;
    }

    public ValidationFault(String message, ke.co.opbank.co.commonservices.data.event.fault.FaultType validationFault, java.lang.Throwable cause) {
        super(message, cause);
        this.validationFault = validationFault;
    }

    public ke.co.opbank.co.commonservices.data.event.fault.FaultType getFaultInfo() {
        return this.validationFault;
    }
}
