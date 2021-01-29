package app;





import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3.AccType;
import ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3.AccountBalanceRequest;
import ke.co.opbank.co.commonservices.data.bfub.accountfundstransfer._3.AccountBalanceResponse;
import ke.co.opbank.co.commonservices.data.message.messageheader.RequestHeaderType;
import ke.co.opbank.co.commonservices.data.message.messageheader.ResponseHeaderType;
import ke.co.opbank.co.commonservices.ts.ift.accountfundstransfer.post._3_2.BusinessFault;
import ke.co.opbank.co.commonservices.ts.ift.accountfundstransfer.post._3_2.Fault;
import ke.co.opbank.co.commonservices.ts.ift.accountfundstransfer.post._3_2.TSAccountFundsTransfer;
import ke.co.opbank.co.commonservices.ts.ift.accountfundstransfer.post._3_2.TechnicalFault;
import ke.co.opbank.co.commonservices.ts.ift.accountfundstransfer.post._3_2.ValidationFault;





@Service
public class FTServiceEndpoint implements TSAccountFundsTransfer {

	@Override
	public void tsAccountFundsTransfer(RequestHeaderType header, AccountBalanceRequest body,
			Holder<ResponseHeaderType> header1, Holder<AccountBalanceResponse> body1)
			throws TechnicalFault, ValidationFault, Fault, BusinessFault {
		ResponseHeaderType rhead = new ResponseHeaderType();
		rhead.setCorrelationID("123");
		
		AccountBalanceResponse rbody = new AccountBalanceResponse();
		AccType acdetails = new AccType();
		acdetails.setAccountDescription("Dennis");
		acdetails.setAccountId("12345");
		rbody.setAccountDetails(acdetails);
		
		header1.value = rhead;
		body1.value = rbody;
		// TODO Auto-generated method stub
		
	}

	

	
	

	/*
	 * @Override public Output addition(AdditionInput inputData) { // TODO
	 * Auto-generated method stub System.out.println(inputData); Output out = new
	 * Output(); out.setResult(inputData.getNumber1() + inputData.getNumber2());
	 * return out; }
	 * 
	 * @Override public Output division(DivisionInput inputData) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public Output subtraction(SubtractionInput inputData) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public Output multiplication(MultiplicationInput inputData) { //
	 * TODO Auto-generated method stub return null; }
	 */

	
	
	
	
	

	/*
	 * @Override public ResponseHeaderType tsAccountFundsTransfer(RequestHeaderType
	 * header, AccFundTrRequestType body) throws TechnicalFault, ValidationFault,
	 * Fault, BusinessFault { // TODO Auto-generated method stub
	 * 
	 * System.out.println("Hello friends"); ResponseHeaderType responseHeaderType =
	 * new ResponseHeaderType();
	 * responseHeaderType.setCorrelationID(header.getCorrelationID());
	 * responseHeaderType.setMessageID(header.getMessageID());
	 * responseHeaderType.setStatusCode("0");
	 * responseHeaderType.setStatusDescription("Success");
	 * responseHeaderType.setStatusDescriptionKey("S"); StatusMessagesType status =
	 * new StatusMessagesType(); status.setApplicationID("001");
	 * status.setMessageCode("0"); status.setMessageDescription("Success");
	 * status.setMessageType("S"); responseHeaderType.setStatusMessages(status);
	 * return responseHeaderType; }
	 */
	
}