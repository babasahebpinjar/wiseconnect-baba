package com.shorewise.wiseconnect.model;

public class TreasSelectBankResCustomData {
   private String Message;
   private String successorfailure;
   private TreasSelectBankResCustomDataDetails StatementTransactionDetail;

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

   public TreasSelectBankResCustomDataDetails getStatementTransactionDetail() {
      return this.StatementTransactionDetail;
   }

   public void setStatementTransactionDetail(TreasSelectBankResCustomDataDetails statementTransactionDetail) {
      this.StatementTransactionDetail = statementTransactionDetail;
   }
}
