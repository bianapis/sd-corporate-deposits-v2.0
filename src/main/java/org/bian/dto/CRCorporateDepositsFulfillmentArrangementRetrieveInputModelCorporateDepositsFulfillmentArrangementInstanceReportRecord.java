package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord
 */
public class CRCorporateDepositsFulfillmentArrangementRetrieveInputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord   {
  private String corporateDepositsFulfillmentArrangementInstanceReportReference = null;

  private String corporateDepositsFulfillmentArrangementInstanceReportType = null;

  private String corporateDepositsFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return corporateDepositsFulfillmentArrangementInstanceReportReference
  **/

  public String getCorporateDepositsFulfillmentArrangementInstanceReportReference() {
    return corporateDepositsFulfillmentArrangementInstanceReportReference;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceReportReference(String corporateDepositsFulfillmentArrangementInstanceReportReference) {
    this.corporateDepositsFulfillmentArrangementInstanceReportReference = corporateDepositsFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return corporateDepositsFulfillmentArrangementInstanceReportType
  **/

  public String getCorporateDepositsFulfillmentArrangementInstanceReportType() {
    return corporateDepositsFulfillmentArrangementInstanceReportType;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceReportType(String corporateDepositsFulfillmentArrangementInstanceReportType) {
    this.corporateDepositsFulfillmentArrangementInstanceReportType = corporateDepositsFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return corporateDepositsFulfillmentArrangementInstanceReportParameters
  **/

  public String getCorporateDepositsFulfillmentArrangementInstanceReportParameters() {
    return corporateDepositsFulfillmentArrangementInstanceReportParameters;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceReportParameters(String corporateDepositsFulfillmentArrangementInstanceReportParameters) {
    this.corporateDepositsFulfillmentArrangementInstanceReportParameters = corporateDepositsFulfillmentArrangementInstanceReportParameters;
  }


}

