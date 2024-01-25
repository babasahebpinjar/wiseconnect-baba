package com.shorewise.wiseconnect.model;

public class LimitUnBlockBankReq {
   private String requestType;
   private String msgid;
   private LimitUnBlockBankReqData data;

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

   public LimitUnBlockBankReqData getData() {
      return this.data;
   }

   public void setData(LimitUnBlockBankReqData data) {
      this.data = data;
   }
}
