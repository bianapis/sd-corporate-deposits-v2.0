package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsUpdateInputModel
 */
public class BQDepositsandWithdrawalsUpdateInputModel   {
  private String corporateDepositsFulfillmentArrangementInstanceReference = null;

  private String depositsandWithdrawalsInstanceReference = null;

  private BQDepositsandWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord = null;

  private Object depositsandWithdrawalsUpdateActionTaskRecord = null;

  private String depositsandWithdrawalsUpdateActionRequest = null;


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

  public BQDepositsandWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecord getDepositsAndWithdrawalsInstanceRecord() {
    return depositsAndWithdrawalsInstanceRecord;
  }

  public void setDepositsAndWithdrawalsInstanceRecord(BQDepositsandWithdrawalsUpdateInputModelDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositsandWithdrawalsUpdateActionTaskRecord
  **/

  public Object getDepositsandWithdrawalsUpdateActionTaskRecord() {
    return depositsandWithdrawalsUpdateActionTaskRecord;
  }

  public void setDepositsandWithdrawalsUpdateActionTaskRecord(Object depositsandWithdrawalsUpdateActionTaskRecord) {
    this.depositsandWithdrawalsUpdateActionTaskRecord = depositsandWithdrawalsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return depositsandWithdrawalsUpdateActionRequest
  **/

  public String getDepositsandWithdrawalsUpdateActionRequest() {
    return depositsandWithdrawalsUpdateActionRequest;
  }

  public void setDepositsandWithdrawalsUpdateActionRequest(String depositsandWithdrawalsUpdateActionRequest) {
    this.depositsandWithdrawalsUpdateActionRequest = depositsandWithdrawalsUpdateActionRequest;
  }


}

