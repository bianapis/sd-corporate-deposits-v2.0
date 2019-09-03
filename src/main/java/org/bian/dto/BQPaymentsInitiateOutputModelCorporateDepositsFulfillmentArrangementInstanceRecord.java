package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits;

import javax.validation.Valid;
  
/**
 * BQPaymentsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord
 */
public class BQPaymentsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord   {
  private String taxReference = null;

  private BQPaymentsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations associations = null;

  private CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * Get associations
   * @return associations
  **/

  public BQPaymentsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(BQPaymentsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

