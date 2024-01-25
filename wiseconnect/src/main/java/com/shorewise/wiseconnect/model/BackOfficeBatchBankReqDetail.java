package com.shorewise.wiseconnect.model;

import java.util.List;

public class BackOfficeBatchBankReqDetail {
   private List<BackOfficeBatchBankReqPartTxnRec> PartTrnRec;

   public BackOfficeBatchBankReqDetail(List<BackOfficeBatchBankReqPartTxnRec> partTrnRec) {
      this.PartTrnRec = partTrnRec;
   }

   public List<BackOfficeBatchBankReqPartTxnRec> getPartTrnRec() {
      return this.PartTrnRec;
   }

   public void setPartTrnRec(List<BackOfficeBatchBankReqPartTxnRec> partTrnRec) {
      this.PartTrnRec = partTrnRec;
   }
}
