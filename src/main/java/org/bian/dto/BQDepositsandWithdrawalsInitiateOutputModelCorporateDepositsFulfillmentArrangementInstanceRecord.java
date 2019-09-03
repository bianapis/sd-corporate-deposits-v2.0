package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord
 */
public class BQDepositsandWithdrawalsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecord   {
  private BQDepositsandWithdrawalsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public BQDepositsandWithdrawalsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(BQDepositsandWithdrawalsInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
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

