package com.shorewise.wiseconnect.model;

public class BackOfficeBatchBankReqAddRequest {
   private BackOfficeBatchBankReqAddRq XferTrnAddRq;
   private BackOfficeBatchBankReqCustomData XferTrnAdd_CustomData;

   public BackOfficeBatchBankReqAddRequest(BackOfficeBatchBankReqAddRq xferTrnAddRq, BackOfficeBatchBankReqCustomData xferTrnAdd_CustomData) {
      this.XferTrnAddRq = xferTrnAddRq;
      this.XferTrnAdd_CustomData = xferTrnAdd_CustomData;
   }

   public BackOfficeBatchBankReqAddRq getXferTrnAddRq() {
      return this.XferTrnAddRq;
   }

   public void setXferTrnAddRq(BackOfficeBatchBankReqAddRq xferTrnAddRq) {
      this.XferTrnAddRq = xferTrnAddRq;
   }

   public BackOfficeBatchBankReqCustomData getXferTrnAdd_CustomData() {
      return this.XferTrnAdd_CustomData;
   }

   public void setXferTrnAdd_CustomData(BackOfficeBatchBankReqCustomData xferTrnAdd_CustomData) {
      this.XferTrnAdd_CustomData = xferTrnAdd_CustomData;
   }
}
