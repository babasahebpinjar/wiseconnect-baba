package com.shorewise.wiseconnect.model;

public class UidUpdateBankReqData {
   private String Option;
   private String OUTSTANDING_AMOUNT;
   private String UNQ_ID;

   public String getOption() {
      return this.Option;
   }

   public void setOption(String option) {
      this.Option = option;
   }

   public String getOUTSTANDING_AMOUNT() {
      return this.OUTSTANDING_AMOUNT;
   }

   public void setOUTSTANDING_AMOUNT(String oUTSTANDING_AMOUNT) {
      this.OUTSTANDING_AMOUNT = oUTSTANDING_AMOUNT;
   }

   public String getUNQ_ID() {
      return this.UNQ_ID;
   }

   public void setUNQ_ID(String uNQ_ID) {
      this.UNQ_ID = uNQ_ID;
   }
}
