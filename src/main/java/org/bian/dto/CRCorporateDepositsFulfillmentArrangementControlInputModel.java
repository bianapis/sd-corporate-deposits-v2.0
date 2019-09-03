package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementControlInputModelCorporateDepositsFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementControlInputModel
 */
public class CRCorporateDepositsFulfillmentArrangementControlInputModel   {
  private String corporateDepositsServicingSessionReference = null;

  private String corporateDepositsFulfillmentArrangementInstanceReference = null;

  private Object corporateDepositsFulfillmentArrangementControlActionTaskRecord = null;

  private CRCorporateDepositsFulfillmentArrangementControlInputModelCorporateDepositsFulfillmentArrangementControlActionRequest corporateDepositsFulfillmentArrangementControlActionRequest = null;


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
   * Get corporateDepositsFulfillmentArrangementControlActionRequest
   * @return corporateDepositsFulfillmentArrangementControlActionRequest
  **/

  public CRCorporateDepositsFulfillmentArrangementControlInputModelCorporateDepositsFulfillmentArrangementControlActionRequest getCorporateDepositsFulfillmentArrangementControlActionRequest() {
    return corporateDepositsFulfillmentArrangementControlActionRequest;
  }

  public void setCorporateDepositsFulfillmentArrangementControlActionRequest(CRCorporateDepositsFulfillmentArrangementControlInputModelCorporateDepositsFulfillmentArrangementControlActionRequest corporateDepositsFulfillmentArrangementControlActionRequest) {
    this.corporateDepositsFulfillmentArrangementControlActionRequest = corporateDepositsFulfillmentArrangementControlActionRequest;
  }


}

