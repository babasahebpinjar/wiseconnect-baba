package com.shorewise.wiseconnect.model;

public class LimitUnBlockBankReqData {
   private String custId;
   private String limitPrefix;
   private String limitSuffix;
   private String serial_num;

   public String getCustId() {
      return this.custId;
   }

   public void setCustId(String custId) {
      this.custId = custId;
   }

   public String getLimitPrefix() {
      return this.limitPrefix;
   }

   public void setLimitPrefix(String limitPrefix) {
      this.limitPrefix = limitPrefix;
   }

   public String getLimitSuffix() {
      return this.limitSuffix;
   }

   public void setLimitSuffix(String limitSuffix) {
      this.limitSuffix = limitSuffix;
   }

   public String getSerial_num() {
      return this.serial_num;
   }

   public void setSerial_num(String serial_num) {
      this.serial_num = serial_num;
   }
}
