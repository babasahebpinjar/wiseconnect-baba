package com.shorewise.wiseconnect.model;

public class SwiftStatus {
   private String masterRef;
   private String eventRef;
   private String tiReqXml;

   public String getMasterRef() {
      return this.masterRef;
   }

   public void setMasterRef(String masterRef) {
      this.masterRef = masterRef;
   }

   public String getEventRef() {
      return this.eventRef;
   }

   public void setEventRef(String eventRef) {
      this.eventRef = eventRef;
   }

   public String getTiReqXml() {
      return this.tiReqXml;
   }

   public void setTiReqXml(String tiReqXml) {
      this.tiReqXml = tiReqXml;
   }
}
