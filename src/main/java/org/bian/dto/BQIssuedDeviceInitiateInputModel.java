package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateInputModel
 */
public class BQIssuedDeviceInitiateInputModel   {
  private BQIssuedDeviceInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord = null;

  private String corporateDepositsFulfillmentArrangementInstanceReference = null;

  private Object issuedDeviceInitiateActionRecord = null;

  private BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord = null;


  /**
   * Get corporateDepositsFulfillmentArrangementInstanceRecord
   * @return corporateDepositsFulfillmentArrangementInstanceRecord
  **/

  public BQIssuedDeviceInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord getCorporateDepositsFulfillmentArrangementInstanceRecord() {
    return corporateDepositsFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceRecord(BQIssuedDeviceInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord) {
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
   * @return issuedDeviceInitiateActionRecord
  **/

  public Object getIssuedDeviceInitiateActionRecord() {
    return issuedDeviceInitiateActionRecord;
  }

  public void setIssuedDeviceInitiateActionRecord(Object issuedDeviceInitiateActionRecord) {
    this.issuedDeviceInitiateActionRecord = issuedDeviceInitiateActionRecord;
  }


  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  **/

  public BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }


}

