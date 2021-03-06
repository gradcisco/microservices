
package ke.co.opbank.co.commonservices.ts.ift.accountfundstransfer.post._3_2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-11-13T10:16:14.236+03:00
 * Generated source version: 3.3.2
 */

@WebFault(name = "Fault", targetNamespace = "urn://co-opbank.co.ke/CommonServices/Data/Event/Fault")
public class Fault extends Exception {

    private ke.co.opbank.co.commonservices.data.event.fault.FaultType fault;

    public Fault() {
        super();
    }

    public Fault(String message) {
        super(message);
    }

    public Fault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Fault(String message, ke.co.opbank.co.commonservices.data.event.fault.FaultType fault) {
        super(message);
        this.fault = fault;
    }

    public Fault(String message, ke.co.opbank.co.commonservices.data.event.fault.FaultType fault, java.lang.Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public ke.co.opbank.co.commonservices.data.event.fault.FaultType getFaultInfo() {
        return this.fault;
    }
}
