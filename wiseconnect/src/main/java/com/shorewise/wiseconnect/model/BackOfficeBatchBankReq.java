package com.shorewise.wiseconnect.model;

public class BackOfficeBatchBankReq {
   String reqdata;
   String msgid;

   public BackOfficeBatchBankReq(String reqData, String msgId) {
      this.msgid = msgId;
      this.reqdata = reqData;
   }
}
