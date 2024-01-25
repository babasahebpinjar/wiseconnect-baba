package com.shorewise.wiseconnect.model;

public class BackOfficeBatchEncryptedReq {
   String reqdata;
   String msgid;

   public BackOfficeBatchEncryptedReq(String reqData, String msgId) {
      this.msgid = msgId;
      this.reqdata = reqData;
   }
}
