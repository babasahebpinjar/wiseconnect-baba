package com.shorewise.wiseconnect.model;

public class UidSelectBankResCustomData {
   private String Message;
   private String successorfailure;
   private UidSelectBankResCustomDataDetails StatementTransactionDetail;

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

   public UidSelectBankResCustomDataDetails getStatementTransactionDetail() {
      return this.StatementTransactionDetail;
   }

   public void setStatementTransactionDetail(UidSelectBankResCustomDataDetails statementTransactionDetail) {
      this.StatementTransactionDetail = statementTransactionDetail;
   }
}
