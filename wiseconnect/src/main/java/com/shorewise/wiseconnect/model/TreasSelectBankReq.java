package com.shorewise.wiseconnect.model;

public class TreasSelectBankReq {
   private String requestType;
   private String msgid;
   private TreasSelectBankReqData data;

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

   public TreasSelectBankReqData getData() {
      return this.data;
   }

   public void setData(TreasSelectBankReqData data) {
      this.data = data;
   }
}
