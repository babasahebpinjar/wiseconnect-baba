package com.shorewise.wiseconnect.util;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CommonMethods {

   public static LinkedHashMap<String, String> TBProperties = new LinkedHashMap<String, String>();
 
   @Autowired
   private JdbcTemplate jdbcTemplate;

   public void getProperties() {
       String query = "SELECT * FROM Bridgeproperties";
       List<Property> properties = jdbcTemplate.query(query, new PropertyRowMapper());

       for (Property property : properties) {
           TBProperties.put(property.getKey(), property.getValue());
       }
   }

   
   private static class Property {
       private String key;
       private String value;

       public Property(String key, String value) {
           this.key = key;
           this.value = value;
       }

       public String getKey() {
           return key;
       }

       public String getValue() {
           return value;
       }
   }

   private static class PropertyRowMapper implements RowMapper<Property> {
       @Override
       public Property mapRow(ResultSet rs, int rowNum) throws SQLException {
           return new Property(rs.getString("key").trim(), rs.getString("value").trim());
       }
   }
   
   
   public static String getBankFinResponse(String bankEncReq, String url) {
      String encResponse = null;
      new StringBuffer();
      PostMethod post = new PostMethod(url);
      System.out.println("Entering getBankFinResponse");

      try {
         StringRequestEntity requestEntity = new StringRequestEntity(bankEncReq, "application/json", "utf-8");
         post.setRequestEntity(requestEntity);
         HttpClient httpclient = new HttpClient();
         int result = httpclient.executeMethod(post);
         if (result != 200) {
            throw new Exception("Server returned code " + result);
         }
         encResponse = post.getResponseBodyAsString();
         System.out.println("Encrypted Response From Bank-->\n" + encResponse);
         System.out.println("Exiting getBankFinResponse");
      } catch (Exception var11) {
         System.out.println("Exception in getBankFinResponse:- " + var11);
         var11.printStackTrace();
      } finally {
         post.releaseConnection();
      }

      return encResponse.trim();
   }

   public static String returnEmptyIfNull(String Value) {
      if (Value == null) {
         Value = "";
      }

      return Value;
   }

   public static String returnZeroIfEmpty(String Value) {
      if (Value == "") {
         Value = "0.00";
      }

      return Value;
   }

   public static String getTiDateFormat(String date) throws ParseException {
      SimpleDateFormat tiFormat = new SimpleDateFormat("yyyy-MM-dd");
      DateFormat jsonFormat = new SimpleDateFormat("dd-MM-yyyy");
      if (date != null && !date.equalsIgnoreCase("")) {
         Date d1 = jsonFormat.parse(date);
         date = tiFormat.format(d1);
      } else {
         date = "";
      }

      return date;
   }
}
