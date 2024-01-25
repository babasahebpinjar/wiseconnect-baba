package com.shorewise.wiseconnect.model;

public class BackOfficeBatchBankRequest {
   private BackOfficeBatchBankReqAddRequest XferTrnAddRequest;
   private String msgid;

   public BackOfficeBatchBankRequest(BackOfficeBatchBankReqAddRequest xferTrnAddRequest, String msgid) {
      this.XferTrnAddRequest = xferTrnAddRequest;
      this.msgid = msgid;
   }

   public BackOfficeBatchBankReqAddRequest getXferTrnAddRequest() {
      return this.XferTrnAddRequest;
   }

   public void setXferTrnAddRequest(BackOfficeBatchBankReqAddRequest xferTrnAddRequest) {
      this.XferTrnAddRequest = xferTrnAddRequest;
   }

   public String getMsgid() {
      return this.msgid;
   }

   public void setMsgid(String msgid) {
      this.msgid = msgid;
   }
}
