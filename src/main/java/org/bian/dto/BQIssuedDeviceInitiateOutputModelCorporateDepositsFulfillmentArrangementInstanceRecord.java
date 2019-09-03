package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord
 */
public class BQIssuedDeviceInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord   {
  private BQIssuedDeviceInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations associations = null;

  private CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * Get associations
   * @return associations
  **/

  public BQIssuedDeviceInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(BQIssuedDeviceInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations associations) {
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

