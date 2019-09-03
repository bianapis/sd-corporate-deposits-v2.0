package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementRetrieveInputModel
 */
public class CRCorporateDepositsFulfillmentArrangementRetrieveInputModel   {
  private Object corporateDepositsFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String corporateDepositsFulfillmentArrangementRetrieveActionRequest = null;

  private CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord corporateDepositsFulfillmentArrangementInstanceReportRecord = null;

  private CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis corporateDepositsFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return corporateDepositsFulfillmentArrangementRetrieveActionRequest
  **/

  public String getCorporateDepositsFulfillmentArrangementRetrieveActionRequest() {
    return corporateDepositsFulfillmentArrangementRetrieveActionRequest;
  }

  public void setCorporateDepositsFulfillmentArrangementRetrieveActionRequest(String corporateDepositsFulfillmentArrangementRetrieveActionRequest) {
    this.corporateDepositsFulfillmentArrangementRetrieveActionRequest = corporateDepositsFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get corporateDepositsFulfillmentArrangementInstanceReportRecord
   * @return corporateDepositsFulfillmentArrangementInstanceReportRecord
  **/

  public CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord getCorporateDepositsFulfillmentArrangementInstanceReportRecord() {
    return corporateDepositsFulfillmentArrangementInstanceReportRecord;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceReportRecord(CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord corporateDepositsFulfillmentArrangementInstanceReportRecord) {
    this.corporateDepositsFulfillmentArrangementInstanceReportRecord = corporateDepositsFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get corporateDepositsFulfillmentArrangementInstanceAnalysis
   * @return corporateDepositsFulfillmentArrangementInstanceAnalysis
  **/

  public CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis getCorporateDepositsFulfillmentArrangementInstanceAnalysis() {
    return corporateDepositsFulfillmentArrangementInstanceAnalysis;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceAnalysis(CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis corporateDepositsFulfillmentArrangementInstanceAnalysis) {
    this.corporateDepositsFulfillmentArrangementInstanceAnalysis = corporateDepositsFulfillmentArrangementInstanceAnalysis;
  }


}

