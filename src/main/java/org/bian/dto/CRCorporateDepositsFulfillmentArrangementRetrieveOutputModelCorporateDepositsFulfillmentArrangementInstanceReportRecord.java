package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord
 */
public class CRCorporateDepositsFulfillmentArrangementRetrieveOutputModelCorporateDepositsFulfillmentArrangementInstanceReportRecord   {
  private String corporateDepositsFulfillmentArrangementInstanceReportData = null;

  private String corporateDepositsFulfillmentArrangementInstanceReportType = null;

  private Object corporateDepositsFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return corporateDepositsFulfillmentArrangementInstanceReportData
  **/

  public String getCorporateDepositsFulfillmentArrangementInstanceReportData() {
    return corporateDepositsFulfillmentArrangementInstanceReportData;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceReportData(String corporateDepositsFulfillmentArrangementInstanceReportData) {
    this.corporateDepositsFulfillmentArrangementInstanceReportData = corporateDepositsFulfillmentArrangementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return corporateDepositsFulfillmentArrangementInstanceReport
  **/

  public Object getCorporateDepositsFulfillmentArrangementInstanceReport() {
    return corporateDepositsFulfillmentArrangementInstanceReport;
  }

  public void setCorporateDepositsFulfillmentArrangementInstanceReport(Object corporateDepositsFulfillmentArrangementInstanceReport) {
    this.corporateDepositsFulfillmentArrangementInstanceReport = corporateDepositsFulfillmentArrangementInstanceReport;
  }


}

