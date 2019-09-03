/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CorporateDepositsApiServiceImpl implements CorporateDepositsApiService {

	public SDCorporateDepositsActivateOutputModel activate(SDCorporateDepositsActivateInputModel request){
		return JsonReader.read("activate-SDCorporateDepositsActivateOutputModel.json",new TypeReference<SDCorporateDepositsActivateOutputModel>(){});
	}
	
	public SDCorporateDepositsConfigureOutputModel configure(String sdReferenceId, SDCorporateDepositsConfigureInputModel request){
		return JsonReader.read("configure-SDCorporateDepositsConfigureOutputModel.json",new TypeReference<SDCorporateDepositsConfigureOutputModel>(){});
	}
	
	public CRCorporateDepositsFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorporateDepositsFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRCorporateDepositsFulfillmentArrangementControlOutputModel.json",new TypeReference<CRCorporateDepositsFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQAccountLienExchangeOutputModel exchangeAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienExchangeInputModel request){
		return JsonReader.read("exchange-BQAccountLienExchangeOutputModel.json",new TypeReference<BQAccountLienExchangeOutputModel>(){});
	}
	
	public BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request){
		return JsonReader.read("exchange-BQPaymentsExchangeOutputModel.json",new TypeReference<BQPaymentsExchangeOutputModel>(){});
	}
	
	public BQAccountSweepExecuteOutputModel executeAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepExecuteInputModel request){
		return JsonReader.read("execute-BQAccountSweepExecuteOutputModel.json",new TypeReference<BQAccountSweepExecuteOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsExecuteOutputModel executeDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsExecuteInputModel request){
		return JsonReader.read("execute-BQDepositsandWithdrawalsExecuteOutputModel.json",new TypeReference<BQDepositsandWithdrawalsExecuteOutputModel>(){});
	}
	
	public BQPaymentsExecuteOutputModel executePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExecuteInputModel request){
		return JsonReader.read("execute-BQPaymentsExecuteOutputModel.json",new TypeReference<BQPaymentsExecuteOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public SDCorporateDepositsFeedbackOutputModel feedback(String sdReferenceId, SDCorporateDepositsFeedbackInputModel request){
		return JsonReader.read("feedback-SDCorporateDepositsFeedbackOutputModel.json",new TypeReference<SDCorporateDepositsFeedbackOutputModel>(){});
	}
	
	public CRCorporateDepositsFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCorporateDepositsFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRCorporateDepositsFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRCorporateDepositsFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQAccountLienInitiateOutputModel initiateAccountlien(String sdReferenceId, String crReferenceId, BQAccountLienInitiateInputModel request){
		return JsonReader.read("initiate-BQAccountLienInitiateOutputModel.json",new TypeReference<BQAccountLienInitiateOutputModel>(){});
	}
	
	public BQAccountSweepInitiateOutputModel initiateAccountsweep(String sdReferenceId, String crReferenceId, BQAccountSweepInitiateInputModel request){
		return JsonReader.read("initiate-BQAccountSweepInitiateOutputModel.json",new TypeReference<BQAccountSweepInitiateOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsInitiateOutputModel initiateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, BQDepositsandWithdrawalsInitiateInputModel request){
		return JsonReader.read("initiate-BQDepositsandWithdrawalsInitiateOutputModel.json",new TypeReference<BQDepositsandWithdrawalsInitiateOutputModel>(){});
	}
	
	public BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request){
		return JsonReader.read("initiate-BQIssuedDeviceInitiateOutputModel.json",new TypeReference<BQIssuedDeviceInitiateOutputModel>(){});
	}
	
	public BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request){
		return JsonReader.read("initiate-BQPaymentsInitiateOutputModel.json",new TypeReference<BQPaymentsInitiateOutputModel>(){});
	}
	
	public BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request){
		return JsonReader.read("initiate-BQServiceFeesInitiateOutputModel.json",new TypeReference<BQServiceFeesInitiateOutputModel>(){});
	}
	
	public BQIssuedDeviceRequestOutputModel requestIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceRequestInputModel request){
		return JsonReader.read("request-BQIssuedDeviceRequestOutputModel.json",new TypeReference<BQIssuedDeviceRequestOutputModel>(){});
	}
	
	public CRCorporateDepositsFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCorporateDepositsFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRCorporateDepositsFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAccountLienRetrieveOutputModel retrieveAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAccountLienRetrieveOutputModel.json",new TypeReference<BQAccountLienRetrieveOutputModel>(){});
	}
	
	public BQAccountSweepRetrieveOutputModel retrieveAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAccountSweepRetrieveOutputModel.json",new TypeReference<BQAccountSweepRetrieveOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsRetrieveOutputModel retrieveDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDepositsandWithdrawalsRetrieveOutputModel.json",new TypeReference<BQDepositsandWithdrawalsRetrieveOutputModel>(){});
	}
	
	public BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInterestRetrieveOutputModel.json",new TypeReference<BQInterestRetrieveOutputModel>(){});
	}
	
	public BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQIssuedDeviceRetrieveOutputModel.json",new TypeReference<BQIssuedDeviceRetrieveOutputModel>(){});
	}
	
	public BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentsRetrieveOutputModel.json",new TypeReference<BQPaymentsRetrieveOutputModel>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCorporateDepositsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCorporateDepositsRetrieveOutputModel.json",new TypeReference<SDCorporateDepositsRetrieveOutputModel>(){});
	}
	
	public CRCorporateDepositsFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorporateDepositsFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRCorporateDepositsFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRCorporateDepositsFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQAccountLienUpdateOutputModel updateAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienUpdateInputModel request){
		return JsonReader.read("update-BQAccountLienUpdateOutputModel.json",new TypeReference<BQAccountLienUpdateOutputModel>(){});
	}
	
	public BQAccountSweepUpdateOutputModel updateAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepUpdateInputModel request){
		return JsonReader.read("update-BQAccountSweepUpdateOutputModel.json",new TypeReference<BQAccountSweepUpdateOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsUpdateOutputModel updateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsUpdateInputModel request){
		return JsonReader.read("update-BQDepositsandWithdrawalsUpdateOutputModel.json",new TypeReference<BQDepositsandWithdrawalsUpdateOutputModel>(){});
	}
	
	public BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request){
		return JsonReader.read("update-BQIssuedDeviceUpdateOutputModel.json",new TypeReference<BQIssuedDeviceUpdateOutputModel>(){});
	}
	
	public BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request){
		return JsonReader.read("update-BQPaymentsUpdateOutputModel.json",new TypeReference<BQPaymentsUpdateOutputModel>(){});
	}
	
}
