package com.shorewise.wiseconnect.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import org.apache.log4j.Logger;



public class ConfigurationUtil {

	private final static Logger logger = Logger.getLogger(ConfigurationUtil.class);
	
	
	public static String getValueFromKey(String key) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String result = null;
		/*System.out.println(" Entering getProperties ");*/
		try {
			con = DatabaseUtility.getThemebridgeConnection();
			String query = "SELECT * FROM Bridgeproperties where key = ?";
			pst = con.prepareStatement(query);
			pst.setString(1, key);
			rs = pst.executeQuery();
			while (rs.next()) {
				result = rs.getString("value").trim();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseUtility.surrenderConnection(con, pst, rs);
		}
		return result;
	}

	public static void main(String args[]) {

		
	}

}
