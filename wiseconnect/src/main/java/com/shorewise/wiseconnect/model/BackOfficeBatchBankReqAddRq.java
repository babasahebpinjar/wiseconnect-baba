package com.shorewise.wiseconnect.model;

public class BackOfficeBatchBankReqAddRq {
   private BackOfficeBatchBankReqHeader XferTrnHdr;
   private BackOfficeBatchBankReqCount XferCount;
   private BackOfficeBatchBankReqDetail XferTrnDetail;

   public BackOfficeBatchBankReqAddRq(BackOfficeBatchBankReqHeader xferTrnHdr, BackOfficeBatchBankReqCount xferCount, BackOfficeBatchBankReqDetail xferTrnDetail) {
      this.XferTrnHdr = xferTrnHdr;
      this.XferCount = xferCount;
      this.XferTrnDetail = xferTrnDetail;
   }

   public BackOfficeBatchBankReqHeader getXferTrnHdr() {
      return this.XferTrnHdr;
   }

   public void setXferTrnHdr(BackOfficeBatchBankReqHeader xferTrnHdr) {
      this.XferTrnHdr = xferTrnHdr;
   }

   public BackOfficeBatchBankReqCount getXferCount() {
      return this.XferCount;
   }

   public void setXferCount(BackOfficeBatchBankReqCount xferCount) {
      this.XferCount = xferCount;
   }

   public BackOfficeBatchBankReqDetail getXferTrnDetail() {
      return this.XferTrnDetail;
   }

   public void setXferTrnDetail(BackOfficeBatchBankReqDetail xferTrnDetail) {
      this.XferTrnDetail = xferTrnDetail;
   }
}
