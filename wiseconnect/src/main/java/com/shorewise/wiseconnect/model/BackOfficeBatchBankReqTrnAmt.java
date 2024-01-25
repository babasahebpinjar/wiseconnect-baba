package com.shorewise.wiseconnect.model;

public class BackOfficeBatchBankReqTrnAmt {
   private String amountValue;
   private String currencyCode;

   public BackOfficeBatchBankReqTrnAmt(String amountValue, String currencyCode) {
      this.amountValue = amountValue;
      this.currencyCode = currencyCode;
   }

   public String getAmountValue() {
      return this.amountValue;
   }

   public void setAmountValue(String amountValue) {
      this.amountValue = amountValue;
   }

   public String getCurrencyCode() {
      return this.currencyCode;
   }

   public void setCurrencyCode(String currencyCode) {
      this.currencyCode = currencyCode;
   }
}
