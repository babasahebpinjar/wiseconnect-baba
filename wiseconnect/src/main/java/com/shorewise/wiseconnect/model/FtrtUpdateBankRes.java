package com.shorewise.wiseconnect.model;

public class FtrtUpdateBankRes {
   private FtrtUpdateBankResData data;
   private String msgrrn;
   private String msgtime;
   private String msgid;
   private String channelName;
   private String status;
   private String errorMsg;

   public FtrtUpdateBankResData getData() {
      return this.data;
   }

   public void setData(FtrtUpdateBankResData data) {
      this.data = data;
   }

   public String getMsgrrn() {
      return this.msgrrn;
   }

   public void setMsgrrn(String msgrrn) {
      this.msgrrn = msgrrn;
   }

   public String getMsgtime() {
      return this.msgtime;
   }

   public void setMsgtime(String msgtime) {
      this.msgtime = msgtime;
   }

   public String getMsgid() {
      return this.msgid;
   }

   public void setMsgid(String msgid) {
      this.msgid = msgid;
   }

   public String getChannelName() {
      return this.channelName;
   }

   public void setChannelName(String channelName) {
      this.channelName = channelName;
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getErrorMsg() {
      return this.errorMsg;
   }

   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }
}
