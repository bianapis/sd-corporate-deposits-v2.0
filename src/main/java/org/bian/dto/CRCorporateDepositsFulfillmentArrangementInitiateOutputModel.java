package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementInitiateOutputModel
 */
public class CRCorporateDepositsFulfillmentArrangementInitiateOutputModel   {
  private String corporateDepositsFulfillmentArrangementInstanceReference = null;

  private String corporateDepositsFulfillmentArrangementInitiateActionReference = null;

  private Object corporateDepositsFulfillmentArrangementInitiateActionRecord = null;

  private String corporateDepositsFulfillmentArrangementInstanceStatus = null;

  private CRCorporateDepositsFulfillmentArrangementInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Corporate Deposits Fulfillment Arrangement instance 
   * @return corporateDepositsFulfillmentArrangementInstanceReference
  **/

  public String getCorporateDepositsFulfillmentArrangementInstanceReference() {
    return corporateDepositsFulfillmentArrangementInstanceReference;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceReference(String corporateDepositsFulfillmentArrangementInstanceReference) {
    this.corporateDepositsFulfillmentArrangementInstanceReference = corporateDepositsFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return corporateDepositsFulfillmentArrangementInitiateActionReference
  **/

  public String getCorporateDepositsFulfillmentArrangementInitiateActionReference() {
    return corporateDepositsFulfillmentArrangementInitiateActionReference;
  }

  public void setCorporateDepositsFulfillmentArrangementInitiateActionReference(String corporateDepositsFulfillmentArrangementInitiateActionReference) {
    this.corporateDepositsFulfillmentArrangementInitiateActionReference = corporateDepositsFulfillmentArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return corporateDepositsFulfillmentArrangementInitiateActionRecord
  **/

  public Object getCorporateDepositsFulfillmentArrangementInitiateActionRecord() {
    return corporateDepositsFulfillmentArrangementInitiateActionRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementInitiateActionRecord(Object corporateDepositsFulfillmentArrangementInitiateActionRecord) {
    this.corporateDepositsFulfillmentArrangementInitiateActionRecord = corporateDepositsFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Corporate Deposits Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return corporateDepositsFulfillmentArrangementInstanceStatus
  **/

  public String getCorporateDepositsFulfillmentArrangementInstanceStatus() {
    return corporateDepositsFulfillmentArrangementInstanceStatus;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceStatus(String corporateDepositsFulfillmentArrangementInstanceStatus) {
    this.corporateDepositsFulfillmentArrangementInstanceStatus = corporateDepositsFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get corporateDepositsFulfillmentArrangementInstanceRecord
   * @return corporateDepositsFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateDepositsFulfillmentArrangementInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord getCorporateDepositsFulfillmentArrangementInstanceRecord() {
    return corporateDepositsFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceRecord(CRCorporateDepositsFulfillmentArrangementInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord) {
    this.corporateDepositsFulfillmentArrangementInstanceRecord = corporateDepositsFulfillmentArrangementInstanceRecord;
  }


}

