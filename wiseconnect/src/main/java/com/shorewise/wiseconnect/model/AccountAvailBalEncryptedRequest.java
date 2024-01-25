package com.shorewise.wiseconnect.model;

public class AccountAvailBalEncryptedRequest {
   String reqdata;
   String msgid;

   public AccountAvailBalEncryptedRequest(String reqData, String msgId) {
      this.msgid = msgId;
      this.reqdata = reqData;
   }
}
