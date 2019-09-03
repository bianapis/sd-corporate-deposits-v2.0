package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementUpdateOutputModel
 */
public class CRCorporateDepositsFulfillmentArrangementUpdateOutputModel   {
  private CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord = null;

  private String corporateDepositsFulfillmentArrangementUpdateActionTaskReference = null;

  private Object corporateDepositsFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return corporateDepositsFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getCorporateDepositsFulfillmentArrangementUpdateActionTaskReference() {
    return corporateDepositsFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCorporateDepositsFulfillmentArrangementUpdateActionTaskReference(String corporateDepositsFulfillmentArrangementUpdateActionTaskReference) {
    this.corporateDepositsFulfillmentArrangementUpdateActionTaskReference = corporateDepositsFulfillmentArrangementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

