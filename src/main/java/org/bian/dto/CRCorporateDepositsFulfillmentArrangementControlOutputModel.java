package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementControlOutputModel
 */
public class CRCorporateDepositsFulfillmentArrangementControlOutputModel   {
  private String corporateDepositsFulfillmentArrangementControlActionTaskReference = null;

  private Object corporateDepositsFulfillmentArrangementControlActionTaskRecord = null;

  private String corporateDepositsFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Deposits Fulfillment Arrangement instance control processing service call 
   * @return corporateDepositsFulfillmentArrangementControlActionTaskReference
  **/

  public String getCorporateDepositsFulfillmentArrangementControlActionTaskReference() {
    return corporateDepositsFulfillmentArrangementControlActionTaskReference;
  }

  public void setCorporateDepositsFulfillmentArrangementControlActionTaskReference(String corporateDepositsFulfillmentArrangementControlActionTaskReference) {
    this.corporateDepositsFulfillmentArrangementControlActionTaskReference = corporateDepositsFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return corporateDepositsFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCorporateDepositsFulfillmentArrangementControlActionTaskRecord() {
    return corporateDepositsFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementControlActionTaskRecord(Object corporateDepositsFulfillmentArrangementControlActionTaskRecord) {
    this.corporateDepositsFulfillmentArrangementControlActionTaskRecord = corporateDepositsFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return corporateDepositsFulfillmentArrangementControlActionResponse
  **/

  public String getCorporateDepositsFulfillmentArrangementControlActionResponse() {
    return corporateDepositsFulfillmentArrangementControlActionResponse;
  }

  public void setCorporateDepositsFulfillmentArrangementControlActionResponse(String corporateDepositsFulfillmentArrangementControlActionResponse) {
    this.corporateDepositsFulfillmentArrangementControlActionResponse = corporateDepositsFulfillmentArrangementControlActionResponse;
  }


}

