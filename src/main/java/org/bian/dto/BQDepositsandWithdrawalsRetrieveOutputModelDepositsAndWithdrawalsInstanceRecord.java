package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction;
import org.bian.dto.BQDepositsandWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord
 */
public class BQDepositsandWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecord   {
  private String depositType = null;

  private String withdrawalType = null;

  private String accountLimitBreachResponse = null;

  private BQDepositsandWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction = null;

  private BQDepositsandWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of deposit transaction that can be applied to the account (e.g. customer deposit, internal credit) 
   * @return depositType
  **/

  public String getDepositType() {
    return depositType;
  }

  public void setDepositType(String depositType) {
    this.depositType = depositType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of withdrawal transaction that can be applied to the account (e.g. customer withdrawal, internal service charge, disbursement) 
   * @return withdrawalType
  **/

  public String getWithdrawalType() {
    return withdrawalType;
  }

  public void setWithdrawalType(String withdrawalType) {
    this.withdrawalType = withdrawalType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The handling options if a withdrawal results in a breach of an account limit 
   * @return accountLimitBreachResponse
  **/

  public String getAccountLimitBreachResponse() {
    return accountLimitBreachResponse;
  }

  public void setAccountLimitBreachResponse(String accountLimitBreachResponse) {
    this.accountLimitBreachResponse = accountLimitBreachResponse;
  }


  /**
   * Get depositTransaction
   * @return depositTransaction
  **/

  public BQDepositsandWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(BQDepositsandWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
  }


  /**
   * Get withdrawalTransaction
   * @return withdrawalTransaction
  **/

  public BQDepositsandWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(BQDepositsandWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }


}

