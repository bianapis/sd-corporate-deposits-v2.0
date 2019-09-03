package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis
 */
public class CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceAnalysis   {
  private String corporateDepositsFulfillmentArrangementInstanceAnalysisReference = null;

  private String corporateDepositsFulfillmentArrangementInstanceAnalysisReportType = null;

  private String corporateDepositsFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return corporateDepositsFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getCorporateDepositsFulfillmentArrangementInstanceAnalysisReference() {
    return corporateDepositsFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceAnalysisReference(String corporateDepositsFulfillmentArrangementInstanceAnalysisReference) {
    this.corporateDepositsFulfillmentArrangementInstanceAnalysisReference = corporateDepositsFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return corporateDepositsFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getCorporateDepositsFulfillmentArrangementInstanceAnalysisParameters() {
    return corporateDepositsFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceAnalysisParameters(String corporateDepositsFulfillmentArrangementInstanceAnalysisParameters) {
    this.corporateDepositsFulfillmentArrangementInstanceAnalysisParameters = corporateDepositsFulfillmentArrangementInstanceAnalysisParameters;
  }


}

