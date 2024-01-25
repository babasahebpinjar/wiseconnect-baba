package com.shorewise.wiseconnect.model;

public class BackOfficeBatchBankReqPmtInst {
   private String PmtInstType;

   public BackOfficeBatchBankReqPmtInst(String pmtInstType) {
      this.PmtInstType = pmtInstType;
   }

   public String getPmtInstType() {
      return this.PmtInstType;
   }

   public void setPmtInstType(String pmtInstType) {
      this.PmtInstType = pmtInstType;
   }
}
