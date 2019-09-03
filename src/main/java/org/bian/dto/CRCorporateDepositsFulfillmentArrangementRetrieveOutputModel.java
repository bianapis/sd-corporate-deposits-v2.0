package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementRetrieveOutputModel
 */
public class CRCorporateDepositsFulfillmentArrangementRetrieveOutputModel   {
  private CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord = null;

  private String corporateDepositsFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object corporateDepositsFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String corporateDepositsFulfillmentArrangementRetrieveActionResponse = null;

  private CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord corporateDepositsFulfillmentArrangementInstanceReportRecord = null;

  private CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis corporateDepositsFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get corporateDepositsFulfillmentArrangementInstanceRecord
   * @return corporateDepositsFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord getCorporateDepositsFulfillmentArrangementInstanceRecord() {
    return corporateDepositsFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceRecord(CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord corporateDepositsFulfillmentArrangementInstanceRecord) {
    this.corporateDepositsFulfillmentArrangementInstanceRecord = corporateDepositsFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Deposits Fulfillment Arrangement instance retrieve service call 
   * @return corporateDepositsFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getCorporateDepositsFulfillmentArrangementRetrieveActionTaskReference() {
    return corporateDepositsFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setCorporateDepositsFulfillmentArrangementRetrieveActionTaskReference(String corporateDepositsFulfillmentArrangementRetrieveActionTaskReference) {
    this.corporateDepositsFulfillmentArrangementRetrieveActionTaskReference = corporateDepositsFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return corporateDepositsFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getCorporateDepositsFulfillmentArrangementRetrieveActionTaskRecord() {
    return corporateDepositsFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementRetrieveActionTaskRecord(Object corporateDepositsFulfillmentArrangementRetrieveActionTaskRecord) {
    this.corporateDepositsFulfillmentArrangementRetrieveActionTaskRecord = corporateDepositsFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return corporateDepositsFulfillmentArrangementRetrieveActionResponse
  **/

  public String getCorporateDepositsFulfillmentArrangementRetrieveActionResponse() {
    return corporateDepositsFulfillmentArrangementRetrieveActionResponse;
  }

  public void setCorporateDepositsFulfillmentArrangementRetrieveActionResponse(String corporateDepositsFulfillmentArrangementRetrieveActionResponse) {
    this.corporateDepositsFulfillmentArrangementRetrieveActionResponse = corporateDepositsFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get corporateDepositsFulfillmentArrangementInstanceReportRecord
   * @return corporateDepositsFulfillmentArrangementInstanceReportRecord
  **/

  public CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord getCorporateDepositsFulfillmentArrangementInstanceReportRecord() {
    return corporateDepositsFulfillmentArrangementInstanceReportRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceReportRecord(CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord corporateDepositsFulfillmentArrangementInstanceReportRecord) {
    this.corporateDepositsFulfillmentArrangementInstanceReportRecord = corporateDepositsFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get corporateDepositsFulfillmentArrangementInstanceAnalysis
   * @return corporateDepositsFulfillmentArrangementInstanceAnalysis
  **/

  public CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis getCorporateDepositsFulfillmentArrangementInstanceAnalysis() {
    return corporateDepositsFulfillmentArrangementInstanceAnalysis;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceAnalysis(CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis corporateDepositsFulfillmentArrangementInstanceAnalysis) {
    this.corporateDepositsFulfillmentArrangementInstanceAnalysis = corporateDepositsFulfillmentArrangementInstanceAnalysis;
  }


}

