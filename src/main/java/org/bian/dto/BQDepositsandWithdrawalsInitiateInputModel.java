package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQDepositsandWithdrawalsInitiateInputModelDepositsAndWithdrawalsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsInitiateInputModel
 */
public class BQDepositsandWithdrawalsInitiateInputModel   {
  private BQDepositsandWithdrawalsInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord = null;

  private String corporateDepositsFulfillmentArrangementInstanceReference = null;

  private Object depositsandWithdrawalsInitiateActionRecord = null;

  private BQDepositsandWithdrawalsInitiateInputModelDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord = null;


  /**
   * Get corporateDepositsFulfillmentArrangementInstanceRecord
   * @return corporateDepositsFulfillmentArrangementInstanceRecord
  **/

  public BQDepositsandWithdrawalsInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord getCorporateDepositsFulfillmentArrangementInstanceRecord() {
    return corporateDepositsFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceRecord(BQDepositsandWithdrawalsInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord) {
    this.corporateDepositsFulfillmentArrangementInstanceRecord = corporateDepositsFulfillmentArrangementInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return depositsandWithdrawalsInitiateActionRecord
  **/

  public Object getDepositsandWithdrawalsInitiateActionRecord() {
    return depositsandWithdrawalsInitiateActionRecord;
  }

  public void setDepositsandWithdrawalsInitiateActionRecord(Object depositsandWithdrawalsInitiateActionRecord) {
    this.depositsandWithdrawalsInitiateActionRecord = depositsandWithdrawalsInitiateActionRecord;
  }


  /**
   * Get depositsAndWithdrawalsInstanceRecord
   * @return depositsAndWithdrawalsInstanceRecord
  **/

  public BQDepositsandWithdrawalsInitiateInputModelDepositsAndWithdrawalsInstanceRecord getDepositsAndWithdrawalsInstanceRecord() {
    return depositsAndWithdrawalsInstanceRecord;
  }

  public void setDepositsAndWithdrawalsInstanceRecord(BQDepositsandWithdrawalsInitiateInputModelDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
  }


}

