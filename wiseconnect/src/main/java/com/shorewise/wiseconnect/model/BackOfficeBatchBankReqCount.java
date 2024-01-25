package com.shorewise.wiseconnect.model;

public class BackOfficeBatchBankReqCount {
   private String CreditCount;
   private String DebitCount;
   private String TotalXferCount;

   public BackOfficeBatchBankReqCount(String creditCount, String debitCount, String totalXferCount) {
      this.CreditCount = creditCount;
      this.DebitCount = debitCount;
      this.TotalXferCount = totalXferCount;
   }

   public String getCreditCount() {
      return this.CreditCount;
   }

   public void setCreditCount(String creditCount) {
      this.CreditCount = creditCount;
   }

   public String getDebitCount() {
      return this.DebitCount;
   }

   public void setDebitCount(String debitCount) {
      this.DebitCount = debitCount;
   }

   public String getTotalXferCount() {
      return this.TotalXferCount;
   }

   public void setTotalXferCount(String totalXferCount) {
      this.TotalXferCount = totalXferCount;
   }
}
