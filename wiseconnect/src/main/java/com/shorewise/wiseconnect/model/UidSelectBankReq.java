package com.shorewise.wiseconnect.model;

public class UidSelectBankReq {
   private String requestType;
   private String msgid;
   private UidSelectBankReqData data;

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

   public UidSelectBankReqData getData() {
      return this.data;
   }

   public void setData(UidSelectBankReqData data) {
      this.data = data;
   }
}
