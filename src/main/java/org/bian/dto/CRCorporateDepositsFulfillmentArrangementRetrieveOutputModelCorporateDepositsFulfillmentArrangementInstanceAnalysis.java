package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis
 */
public class CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis   {
  private String corporateDepositsFulfillmentArrangementInstanceAnalysisData = null;

  private String corporateDepositsFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object corporateDepositsFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return corporateDepositsFulfillmentArrangementInstanceAnalysisData
  **/

  public String getCorporateDepositsFulfillmentArrangementInstanceAnalysisData() {
    return corporateDepositsFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceAnalysisData(String corporateDepositsFulfillmentArrangementInstanceAnalysisData) {
    this.corporateDepositsFulfillmentArrangementInstanceAnalysisData = corporateDepositsFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return corporateDepositsFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getCorporateDepositsFulfillmentArrangementInstanceAnalysisReportType() {
    return corporateDepositsFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceAnalysisReportType(String corporateDepositsFulfillmentArrangementInstanceAnalysisReportType) {
    this.corporateDepositsFulfillmentArrangementInstanceAnalysisReportType = corporateDepositsFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return corporateDepositsFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getCorporateDepositsFulfillmentArrangementInstanceAnalysisReport() {
    return corporateDepositsFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceAnalysisReport(Object corporateDepositsFulfillmentArrangementInstanceAnalysisReport) {
    this.corporateDepositsFulfillmentArrangementInstanceAnalysisReport = corporateDepositsFulfillmentArrangementInstanceAnalysisReport;
  }


}

