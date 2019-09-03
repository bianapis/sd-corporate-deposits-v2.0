package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord;
import org.bian.dto.BQServiceFeesExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsExecuteInputModel
 */
public class BQDepositsandWithdrawalsExecuteInputModel   {
  private String corporateDepositsFulfillmentArrangementInstanceReference = null;

  private String depositsandWithdrawalsInstanceReference = null;

  private BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord = null;

  private Object depositsandWithdrawalsExecuteActionTaskRecord = null;

  private BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Corporate Deposits Fulfillment Arrangement instance 
   * @return corporateDepositsFulfillmentArrangementInstanceReference
  **/

  public String getCorporateDepositsFulfillmentArrangementInstanceReference() {
    return corporateDepositsFulfillmentArrangementInstanceReference;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceReference(String corporateDepositsFulfillmentArrangementInstanceReference) {
    this.corporateDepositsFulfillmentArrangementInstanceReference = corporateDepositsFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits and Withdrawals instance 
   * @return depositsandWithdrawalsInstanceReference
  **/

  public String getDepositsandWithdrawalsInstanceReference() {
    return depositsandWithdrawalsInstanceReference;
  }

  public void setDepositsandWithdrawalsInstanceReference(String depositsandWithdrawalsInstanceReference) {
    this.depositsandWithdrawalsInstanceReference = depositsandWithdrawalsInstanceReference;
  }


  /**
   * Get depositsAndWithdrawalsInstanceRecord
   * @return depositsAndWithdrawalsInstanceRecord
  **/

  public BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord getDepositsAndWithdrawalsInstanceRecord() {
    return depositsAndWithdrawalsInstanceRecord;
  }

  public void setDepositsAndWithdrawalsInstanceRecord(BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return depositsandWithdrawalsExecuteActionTaskRecord
  **/

  public Object getDepositsandWithdrawalsExecuteActionTaskRecord() {
    return depositsandWithdrawalsExecuteActionTaskRecord;
  }

  public void setDepositsandWithdrawalsExecuteActionTaskRecord(Object depositsandWithdrawalsExecuteActionTaskRecord) {
    this.depositsandWithdrawalsExecuteActionTaskRecord = depositsandWithdrawalsExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQServiceFeesExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

