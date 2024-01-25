package com.shorewise.wiseconnect.model;

public class UidUpdateBankReq {
   private String requestType;
   private String msgid;
   private UidUpdateBankReqData data;

   public String getRequestType() {
      return this.requestType;
   }

   public void setRequestType(String requestType) {
      this.requestType = requestType;
   }

   public String getMsgid() {
      return this.msgid;
   }

   public void setMsgid(String msgid) {
      this.msgid = msgid;
   }

   public UidUpdateBankReqData getData() {
      return this.data;
   }

   public void setData(UidUpdateBankReqData data) {
      this.data = data;
   }
}
