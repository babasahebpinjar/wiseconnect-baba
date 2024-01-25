package com.shorewise.wiseconnect.model;

public class BackOfficeBatchBankReqHeader {
   private String TrnType;
   private String TrnSubType;

   public BackOfficeBatchBankReqHeader(String trnType, String trnSubType) {
      this.TrnType = trnType;
      this.TrnSubType = trnSubType;
   }

   public String getTrnType() {
      return this.TrnType;
   }

   public void setTrnType(String trnType) {
      this.TrnType = trnType;
   }

   public String getTrnSubType() {
      return this.TrnSubType;
   }

   public void setTrnSubType(String trnSubType) {
      this.TrnSubType = trnSubType;
   }
}
