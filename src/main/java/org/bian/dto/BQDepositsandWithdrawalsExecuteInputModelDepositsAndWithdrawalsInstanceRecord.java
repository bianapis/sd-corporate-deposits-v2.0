package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction;
import org.bian.dto.BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord
 */
public class BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord   {
  private BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction = null;

  private BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction = null;


  /**
   * Get depositTransaction
   * @return depositTransaction
  **/

  public BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
  }


  /**
   * Get withdrawalTransaction
   * @return withdrawalTransaction
  **/

  public BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(BQDepositsandWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }


}

