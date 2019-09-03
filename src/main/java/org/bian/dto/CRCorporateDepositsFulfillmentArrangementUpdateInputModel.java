package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementUpdateInputModel
 */
public class CRCorporateDepositsFulfillmentArrangementUpdateInputModel   {
  private String corporateDepositsServicingSessionReference = null;

  private String corporateDepositsFulfillmentArrangementInstanceReference = null;

  private CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord = null;

  private Object corporateDepositsFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get corporateDepositsFulfillmentArrangementInstanceRecord
   * @return corporateDepositsFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord getCorporateDepositsFulfillmentArrangementInstanceRecord() {
    return corporateDepositsFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceRecord(CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord) {
    this.corporateDepositsFulfillmentArrangementInstanceRecord = corporateDepositsFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return corporateDepositsFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCorporateDepositsFulfillmentArrangementUpdateActionTaskRecord() {
    return corporateDepositsFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementUpdateActionTaskRecord(Object corporateDepositsFulfillmentArrangementUpdateActionTaskRecord) {
    this.corporateDepositsFulfillmentArrangementUpdateActionTaskRecord = corporateDepositsFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

