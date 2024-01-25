package com.shorewise.wiseconnect.model;

public class TreasSelectBankRes {
   private TreasSelectBankResData data;
   private String msgrrn;
   private String msgtime;
   private String msgid;
   private String channelName;
   private String status;

   public TreasSelectBankResData getData() {
      return this.data;
   }

   public void setData(TreasSelectBankResData data) {
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
}
