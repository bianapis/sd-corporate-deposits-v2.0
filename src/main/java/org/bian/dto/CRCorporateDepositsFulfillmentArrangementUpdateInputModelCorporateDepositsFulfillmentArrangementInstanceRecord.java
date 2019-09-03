package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordLinkedAccounts;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordStatementsSchedule;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits;
import org.bian.dto.CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations;

import javax.validation.Valid;
  
/**
 * CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord
 */
public class CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String corporateDepositAccountNumber = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String accountType = null;

  private String accountCurrency = null;

  private String taxReference = null;

  private String entitlementOptionDefinition = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionDefinition = null;

  private String restrictionOptionSetting = null;

  private CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations associations = null;

  private CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts = null;

  private CRCorporateDepositsFulfillmentArrangementInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordDateType dateType = null;

  private CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordStatementsSchedule statementsSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the corporate deposit account product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated account number in any suitable format (e.g. IBAN) 
   * @return corporateDepositAccountNumber
  **/

  public String getCorporateDepositAccountNumber() {
    return corporateDepositAccountNumber;
  }

  public void setCorporateDepositAccountNumber(String corporateDepositAccountNumber) {
    this.corporateDepositAccountNumber = corporateDepositAccountNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the account for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of corporate deposit account (e.g. checking, student, small business) 
   * @return accountType
  **/

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The primary account currency 
   * @return accountCurrency
  **/

  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option 
   * @return entitlementOptionDefinition
  **/

  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option 
   * @return entitlementOptionSetting
  **/

  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option 
   * @return restrictionOptionDefinition
  **/

  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  **/

  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }


  /**
   * Get associations
   * @return associations
  **/

  public CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(CRCorporateDepositsFulfillmentArrangementUpdateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }


  /**
   * Get linkedAccounts
   * @return linkedAccounts
  **/

  public CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordLinkedAccounts getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public CRCorporateDepositsFulfillmentArrangementInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CRCorporateDepositsFulfillmentArrangementInitiateOutputModelCorporateDepositsFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
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


  /**
   * Get statementsSchedule
   * @return statementsSchedule
  **/

  public CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordStatementsSchedule getStatementsSchedule() {
    return statementsSchedule;
  }

  public void setStatementsSchedule(CRCorporateDepositsFulfillmentArrangementInitiateInputModelCorporateDepositsFulfillmentArrangementInstanceRecordStatementsSchedule statementsSchedule) {
    this.statementsSchedule = statementsSchedule;
  }


}

