package com.shorewise.wiseconnect.model;

public class FtrtSelectBankResCustomData {
   private String Message;
   private String successorfailure;
   private FtrtSelectBankResCustomDataDetails StatementTransactionDetail;

   public String getMessage() {
      return this.Message;
   }

   public void setMessage(String message) {
      this.Message = message;
   }

   public String getSuccessorfailure() {
      return this.successorfailure;
   }

   public void setSuccessorfailure(String successorfailure) {
      this.successorfailure = successorfailure;
   }

   public FtrtSelectBankResCustomDataDetails getStatementTransactionDetail() {
      return this.StatementTransactionDetail;
   }

   public void setStatementTransactionDetail(FtrtSelectBankResCustomDataDetails statementTransactionDetail) {
      this.StatementTransactionDetail = statementTransactionDetail;
   }
}
