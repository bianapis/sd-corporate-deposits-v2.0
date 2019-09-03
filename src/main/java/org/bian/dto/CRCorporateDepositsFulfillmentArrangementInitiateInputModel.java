package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementInitiateInputModel
 */
public class CRCorporateDepositsFulfillmentArrangementInitiateInputModel   {
  private String corporateDepositsServicingSessionReference = null;

  private Object corporateDepositsFulfillmentArrangementInitiateActionRecord = null;

  private String corporateDepositsFulfillmentArrangementInstanceStatus = null;

  private CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return corporateDepositsServicingSessionReference
  **/

  public String getCorporateDepositsServicingSessionReference() {
    return corporateDepositsServicingSessionReference;
  }

  public void setCorporateDepositsServicingSessionReference(String corporateDepositsServicingSessionReference) {
    this.corporateDepositsServicingSessionReference = corporateDepositsServicingSessionReference;
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

  public CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord getCorporateDepositsFulfillmentArrangementInstanceRecord() {
    return corporateDepositsFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceRecord(CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord) {
    this.corporateDepositsFulfillmentArrangementInstanceRecord = corporateDepositsFulfillmentArrangementInstanceRecord;
  }


}

