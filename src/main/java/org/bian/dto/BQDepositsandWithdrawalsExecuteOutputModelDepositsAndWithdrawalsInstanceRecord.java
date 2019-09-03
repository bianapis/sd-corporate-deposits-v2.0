package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction;
import org.bian.dto.BQDepositsandWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecord
 */
public class BQDepositsandWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecord   {
  private BQDepositsandWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction = null;

  private BQDepositsandWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction = null;


  /**
   * Get depositTransaction
   * @return depositTransaction
  **/

  public BQDepositsandWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(BQDepositsandWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
  }


  /**
   * Get withdrawalTransaction
   * @return withdrawalTransaction
  **/

  public BQDepositsandWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(BQDepositsandWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }


}

