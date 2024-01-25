package com.shorewise.wiseconnect.model;

public class BackOfficeBatchBankReqCustomData {
   private String INITSOLID;

   public BackOfficeBatchBankReqCustomData(String iNITSOLID) {
      this.INITSOLID = iNITSOLID;
   }

   public String getINITSOLID() {
      return this.INITSOLID;
   }

   public void setINITSOLID(String iNITSOLID) {
      this.INITSOLID = iNITSOLID;
   }
}
