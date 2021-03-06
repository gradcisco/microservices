package ke.co.opbank.co.commonservices.ts.ift.accountfundstransfer.post._3_2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2021-01-29T12:29:06.262+03:00
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "urn://co-opbank.co.ke/CommonServices/TS/IFT/AccountFundsTransfer/post/3.2", name = "TSAccountFundsTransfer")
@XmlSeeAlso({ke.co.opbank.co.commonservices.data.internal.runtimecontext.ObjectFactory.class, ke.co.opbank.co.commonservices.data.common.ObjectFactory.class, ke.co.opbank.co.commonservices.data.message.messageheader.ObjectFactory.class, ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3.ObjectFactory.class, ke.co.opbank.co.commonservices.data.event.fault.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TSAccountFundsTransfer {

    @WebMethod(operationName = "TSAccountFundsTransfer", action = "TSAccountFundsTransfer")
    public void tsAccountFundsTransfer(

        @WebParam(partName = "header", name = "RequestHeader", targetNamespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader", header = true)
        ke.co.opbank.co.commonservices.data.message.messageheader.RequestHeaderType header,
        @WebParam(partName = "body", mode = WebParam.Mode.INOUT, name = "DataOutput", targetNamespace = "urn://co-opbank.co.ke/CommonServices/Data/BFUB/AccountFundsTransfer/3.2")
        javax.xml.ws.Holder<ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3.AccountBalanceRequest> body,
        @WebParam(partName = "header1", mode = WebParam.Mode.OUT, name = "ResponseHeader", targetNamespace = "urn://co-opbank.co.ke/CommonServices/Data/Message/MessageHeader")
        javax.xml.ws.Holder<ke.co.opbank.co.commonservices.data.message.messageheader.ResponseHeaderType> header1
    ) throws TechnicalFault, ValidationFault, Fault, BusinessFault;
}
