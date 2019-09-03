/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorporateDepositsApiService {

	SDCorporateDepositsActivateOutputModel activate(SDCorporateDepositsActivateInputModel request);
	
	SDCorporateDepositsConfigureOutputModel configure(String sdReferenceId, SDCorporateDepositsConfigureInputModel request);
	
	CRCorporateDepositsFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorporateDepositsFulfillmentArrangementControlInputModel request);
	
	BQAccountLienExchangeOutputModel exchangeAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienExchangeInputModel request);
	
	BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request);
	
	BQAccountSweepExecuteOutputModel executeAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepExecuteInputModel request);
	
	BQDepositsandWithdrawalsExecuteOutputModel executeDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsExecuteInputModel request);
	
	BQPaymentsExecuteOutputModel executePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExecuteInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	SDCorporateDepositsFeedbackOutputModel feedback(String sdReferenceId, SDCorporateDepositsFeedbackInputModel request);
	
	CRCorporateDepositsFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCorporateDepositsFulfillmentArrangementInitiateInputModel request);
	
	BQAccountLienInitiateOutputModel initiateAccountlien(String sdReferenceId, String crReferenceId, BQAccountLienInitiateInputModel request);
	
	BQAccountSweepInitiateOutputModel initiateAccountsweep(String sdReferenceId, String crReferenceId, BQAccountSweepInitiateInputModel request);
	
	BQDepositsandWithdrawalsInitiateOutputModel initiateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, BQDepositsandWithdrawalsInitiateInputModel request);
	
	BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request);
	
	BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request);
	
	BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request);
	
	BQIssuedDeviceRequestOutputModel requestIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceRequestInputModel request);
	
	CRCorporateDepositsFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQAccountLienRetrieveOutputModel retrieveAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQAccountSweepRetrieveOutputModel retrieveAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDepositsandWithdrawalsRetrieveOutputModel retrieveDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCorporateDepositsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCorporateDepositsFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorporateDepositsFulfillmentArrangementUpdateInputModel request);
	
	BQAccountLienUpdateOutputModel updateAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienUpdateInputModel request);
	
	BQAccountSweepUpdateOutputModel updateAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepUpdateInputModel request);
	
	BQDepositsandWithdrawalsUpdateOutputModel updateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsUpdateInputModel request);
	
	BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request);
	
	BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request);
	
}
