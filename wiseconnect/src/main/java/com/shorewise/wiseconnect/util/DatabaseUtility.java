package com.shorewise.wiseconnect.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

/**
 * @since 2016-JUN-15
 * @version 1.01
 * @author Prasath Ravicandran
 *
 */
public class DatabaseUtility {

	private final static Logger logger = Logger.getLogger(DatabaseUtility.class);

	public static void main(String args[]) {
			
			String value="ABC";
			String result = value;
			if (value != null && !value.isEmpty()) {
				value = value.replaceAll("['`�~!@#$%^&*(){}\\[\\]:;\"<,>.?/-]", " ");
				value = value.replaceAll("INSERT", " ");
				value = value.replaceAll("DELETE", " ");
				value = value.replaceAll("HREF", " ");
				value = value.replaceAll("CREATE", " ");
				value = value.replaceAll("DROP", " ");
				value = value.replaceAll("SCRIPT", " ");
				value = value.replaceAll("OR", " ");
				result = value;
			System.out.println("ABC->"+result);
		}
	}

	/**
	 * Get <i><b>THEMEBRIDGE</b></i> connection using WAS-JNDI
	 *
	 * @return {@code Themebridge }{@link Connection}
	 */
	public static Connection getThemebridgeConnection() {
		Connection connection = null;
		try {
			Properties param = new Properties();
			
//			//Commented the weblogic and enable the  websphere
			param.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
//			param.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			
			Context initialContext;
			initialContext = new InitialContext(param);
			DataSource dataSource = (DataSource) initialContext.lookup("jdbc/themebridge");
			connection = dataSource.getConnection();

		} catch (NamingException e) {
			logger.error("ThemeBridge JNDI NamingException! " + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			logger.error("ThemeBridge JNDI SQLException! " + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}

	
	/**
	 * Get <i><b>TREASURY</b></i> connection using WAS-JNDI
	 *
	 * @return {@code Treasury }{@link Connection}
	 */
	public static Connection getDBLinkConnection() {
		Connection connection = null;
		try {
			Properties param = new Properties();
			
//			//Commented the weblogic and enable the websphere
			param.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
//			param.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			
			Context initialContext;
			initialContext = new InitialContext(param);
			DataSource dataSource = (DataSource) initialContext.lookup("jdbc/dblink");
			connection = dataSource.getConnection();

		} catch (NamingException e) {
			logger.error("Treasury JNDI NamingException! " + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			logger.error("Treasury JNDI SQLException! " + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}

	
	
	
	/**
	 * Get <b>TIZONE</b> connection using WAS-JNDI
	 *
	 * @return {@code TIZONE }{@link Connection} //
	 */
	public static Connection getTizoneConnection() {
		Connection connection = null;
		try {
			Properties param = new Properties();
//			//Commented the weblogic and enable the websphere
			param.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
//			param.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			Context initialContext = new InitialContext(param);
			DataSource dataSource = (DataSource) initialContext.lookup("jdbc/zone");
			connection = dataSource.getConnection();

		} catch (NamingException e) {
			logger.error("TIZONE JNDI NamingException! " + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			logger.error("TIZONE JNDI SQLException! " + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}
	
	public static Connection getWatchListConnection() {
		Connection connection = null;
		try {
			Properties param = new Properties();
			param.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
			Context initialContext = new InitialContext(param);
			DataSource dataSource = (DataSource) initialContext.lookup("jdbc/watchlist");
			connection = dataSource.getConnection();

		} catch (NamingException e) {
			logger.error("TIZONE JNDI NamingException! " + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			logger.error("TIZONE JNDI SQLException! " + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}


	/**
	 * Get <b>RPTZONE</b> connection using WAS-JNDI
	 *
	 * @return {@code RPTZONE }{@link Connection} //
	 */
	public static Connection getRptzoneConnection() {
		Connection connection = null;
		try {
			Properties param = new Properties();
//			//Commented the weblogic and enable the websphere
			param.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
//			param.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			Context initialContext = new InitialContext(param);
			DataSource dataSource = (DataSource) initialContext.lookup("jdbc/rptzone");
			connection = dataSource.getConnection();

		} catch (NamingException e) {
			logger.error("RPTZONE JNDI NamingException! " + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			logger.error("RPTZONE SQLException! " + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * Get <b>TIGLOBAL</b> connection using WAS-JNDI
	 *
	 * @return {@code TIGLOBAL }{@link Connection}
	 */
	public static Connection getTiglobalConnection() {
		Connection connection = null;
		try {
			Properties param = new Properties();
//			Commented the weblogic and enable the websphere
			param.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
//			param.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			Context initialContext = new InitialContext(param);
			DataSource dataSource = (DataSource) initialContext.lookup("jdbc/global");
			connection = dataSource.getConnection();

		} catch (NamingException e) {
			logger.error("TIGLOBAL JNDI NamingException! " + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			logger.error("TIGLOBAL JNDI SQLException! " + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * Get <i><b>IDB-RATE</b></i> connection using WAS-JNDI
	 *
	 * @return {@code IDB-RATE }{@link Connection}
	 */
	public static Connection getIdbFcConnection() {
		Connection connection = null;
		try {
			Properties param = new Properties();
//			Commented the weblogic and enable the websphere
			param.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
//			param.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			Context initialContext = new InitialContext(param);
			DataSource dataSource = (DataSource) initialContext.lookup("jdbc/idbfc");
			connection = dataSource.getConnection();

		} catch (NamingException e) {
			logger.error("IDB-FC JNDI NamingException! " + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			logger.error("IDB-FC JNDI SQLException! " + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * getIdbtiplusConnection
	 * 
	 * Get <b>IDB-STATICDATA</b> connection using WAS-JNDI
	 *
	 * @return {@code IDB-STATICDATA }{@link Connection}
	 */
	public static Connection getIdbTiplusConnection() {
		Connection connection = null;
		try {
			Properties param = new Properties();
//			Commented the weblogic and enable the websphere
			param.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
//			param.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			Context initialContext = new InitialContext(param);
			DataSource dataSource = (DataSource) initialContext.lookup("jdbc/idbtiplus");
			connection = dataSource.getConnection();

		} catch (NamingException e) {
			logger.error("IDB-TIPLUS JNDI NamingException! " + e.getMessage(), e);
			e.printStackTrace();

		} catch (SQLException e) {
			logger.error("IDB-TIPLUS JNDI SQLException! " + e.getMessage(), e);
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * Get <b>PAYMENT-HUB</b> connection using WAS-JNDI
	 *
	 * @return {@code PAYMENT-HUB }{@link Connection}
	 */
	public static Connection getNeftRtgsConnection() {
		Connection connection = null;
		try {
			Properties param = new Properties();
//			Commented the weblogic and enable the websphere
			param.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
//			param.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			Context initialContext = new InitialContext(param);
			DataSource dataSource = (DataSource) initialContext.lookup("jdbc/neftrtgs");
			connection = dataSource.getConnection();

		} catch (NamingException e) {
			logger.error("PAYMENT-HUB JNDI NamingException! " + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			logger.error("PAYMENT-HUB JNDI SQLException! " + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * Get <b>SMS-HUB</b> connection using WAS-JNDI
	 *
	 * @return {@code SMS-HUB }{@link Connection}
	 */
	public static Connection getSMSConnection() {
		Connection connection = null;
		try {
			Properties param = new Properties();
//			Commented the weblogic and enable the websphere
			param.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
//			param.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			Context initialContext = new InitialContext(param);
			DataSource dataSource = (DataSource) initialContext.lookup("jdbc/smsalert");
			connection = dataSource.getConnection();

		} catch (NamingException e) {
			logger.error("SMS-HUB JNDI NamingException! " + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			logger.error("SMS-HUB JNDI SQLException! " + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * Not used in kotak connection
	 * 
	 * Get <b>IDB-INTERNAL</b> connection using WAS-JNDI
	 *
	 * @return {@code IDB-TEST }{@link Connection}
	 */
	public static Connection getLocalTestConnection() {
		Connection connection = null;
		try {
			Properties param = new Properties();
//			Commented the weblogic and enable the websphere
			param.put(Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
//			param.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			Context initialContext = new InitialContext(param);
			DataSource dataSource = (DataSource) initialContext.lookup("jdbc/idbinternal");
			connection = dataSource.getConnection();

		} catch (NamingException e) {
			logger.error("IDB-INTERNAL JNDI NamingException!" + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			logger.error("IDB-INTERNAL JNDI SQLException!" + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * 
	 * @param conn {@code allows }{@link Connection}
	 * @param stmt {@code allows }{@link Statement}
	 * @param res  {@code allows }{@link ResultSet}
	 */
	public static void surrenderConnection(Connection conn, Statement stmt, ResultSet res) {
		/**
		 * Order to close => Resultset, Statement / PreparedStatement, Connection
		 */
		try {
			if (ValidationsUtil.isValidObject(res))
				res.close();
		} catch (SQLException e) {
			logger.error("Close Resultset Failed! " + e.getMessage());
			e.printStackTrace();
		}
		try {
			if (ValidationsUtil.isValidObject(stmt))
				stmt.close();
		} catch (SQLException e) {
			logger.error("Close Statement Failed! " + e.getMessage());
			e.printStackTrace();
		}
		try {
			if (ValidationsUtil.isValidObject(conn)) {
				conn.close();
			}
		} catch (SQLException e) {
			logger.error("Close Connection Failed! " + e.getMessage());
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param conn       {@code allows }{@link Connection}
	 * @param sStatement {@code allows }{@link PreparedStatement}
	 * @param res        {@code allows }{@link ResultSet}
	 */
	public static void surrenderPrepdConnection(Connection conn, PreparedStatement pstmt, ResultSet res) {
		/**
		 * Order to close => Resultset, Statement / PreparedStatement, Connection
		 */
		try {
			if (ValidationsUtil.isValidObject(res))
				res.close();
		} catch (SQLException e) {
			logger.error("Close Resultset Failed! " + e.getMessage());
			e.printStackTrace();
		}
		try {
			if (ValidationsUtil.isValidObject(pstmt))
				pstmt.close();
		} catch (SQLException e) {
			logger.error("Close PreparedStatement Failed! " + e.getMessage());
			e.printStackTrace();
		}
		try {
			if (ValidationsUtil.isValidObject(conn)) {
				conn.close();
			}
		} catch (SQLException e) {
			logger.error("Close Connection Failed! " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param con        {@code allows }{@link Connection}
	 * @param sStatement {@code allows }{@link CallableStatement}
	 * @param res        {@code allows }{@link ResultSet}
	 */
	public static void surrenderCallableConnection(Connection con, CallableStatement clblStmt, ResultSet res) {
		/**
		 * Order to close => Resultset, Statement / PreparedStatement, Connection
		 */
		try {
			if (ValidationsUtil.isValidObject(res))
				res.close();
		} catch (SQLException e) {
			logger.error("Close Resultset Failed! " + e.getMessage());
			e.printStackTrace();
		}
		try {
			if (ValidationsUtil.isValidObject(clblStmt))
				clblStmt.close();
		} catch (SQLException e) {
			logger.error("Close CallableStatement Failed! " + e.getMessage());
			e.printStackTrace();
		}
		try {
			if (ValidationsUtil.isValidObject(con)) {
				con.close();
			}
		} catch (SQLException e) {
			logger.error("Close Connection Failed! " + e.getMessage());
			e.printStackTrace();
		}

	}
	
	public static Connection getLocalConnection() {
		Connection connection = null;
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection=DriverManager.getConnection("jdbc:oracle:thin:@10.128.230.200:1529:FTRADE", "THEMEBRIDGE", "Cisco123");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			logger.error("JNDI SQLException!" + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}

	/************* Below method are only for local testing *****************/

	/*public static Connection getThemebridgeConnection() {

		Connection con = null;
		try {
			String user = "THEMEBRIDGE";
			String pass = "themebridge_1234";// themebridge_123
			Class.forName("oracle.jdbc.driver.OracleDriver");

//			String MIG_JdbcURL = "jdbc:oracle:thin:@10.10.19.179:1530:orcl";
//			String OLD_JdbcURL = "jdbc:oracle:thin:@10.10.19.179:1528:orcl2";
String UAT3_JdbcURL = "jdbc:oracle:thin:@10.10.19.161:1530:TIUAT";
		//	String SIT_JdbcURL = "jdbc:oracle:thin:@10.10.20.137:1528:orcl1";
//			String WF_JdbcURL = "jdbc:oracle:thin:@10.10.7.116:1530:tiplusdb";
//			String PRE_tipdb_JdbcURL = "jdbc:oracle:thin:@10.10.7.211:1530:tiplusdb";
//			String PRE_tirpt_JdbcURL = "jdbc:oracle:thin:@10.10.7.211:1532:tiproddb";

			// con = DriverManager.getConnection(MIG_JdbcURL, user, "themebridge");
			// con = DriverManager.getConnection(OLD_JdbcURL, user, "themebridge_123");
			con = DriverManager.getConnection(UAT3_JdbcURL, user, "themebridge_123");
			// con = DriverManager.getConnection(SIT_JdbcURL, user, pass);
			// con = DriverManager.getConnection(WF_JdbcURL, user, "themebridge_123");
			// con = DriverManager.getConnection(PRE_tipdb_JdbcURL, user,
			// "themebridge_123");
			// con = DriverManager.getConnection(PRE_tirpt_JdbcURL, user,
			// "themebridge_123");

		} catch (ClassNotFoundException e) {
			System.out.println("EODCustomJobs ThemeBridge ClassNotFoundException!" + e.getMessage());
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("EODCustomJobs ThemeBridge SQLException!" + e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("EODCustomJobs ThemeBridge Exception!" + e.getMessage());
			e.printStackTrace();
		}
		return con;
	}*/

//	public static Connection getTizoneConnection() {
//
//		Connection con = null;
//		try {
//			String user = "TIZONE";
//			String pass = "tizone_1234";// tizone_123
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			// String MIG_JdbcURL = "jdbc:oracle:thin:@10.10.19.179:1530:orcl";
//			// String OLD_JdbcURL = "jdbc:oracle:thin:@10.10.19.179:1528:orcl2";
//			//String UAT3_JdbcURL = "jdbc:oracle:thin:@10.10.20.137:1530:orcl";
//			 String SIT_JdbcURL = "jdbc:oracle:thin:@10.10.19.161:1530:TIUAT";
//			// String WF_JdbcURL = "jdbc:oracle:thin:@10.10.7.116:1530:tiplusdb";
//			// String PRE_tipdb_JdbcURL = "jdbc:oracle:thin:@10.10.7.211:1530:tiplusdb";
//			// String PRE_tirpt_JdbcURL = "jdbc:oracle:thin:@10.10.7.211:1532:tiproddb";
//
//			// con = DriverManager.getConnection(MIG_JdbcURL, user, "tizone_1234");// MIG
//			// con = DriverManager.getConnection(OLD_JdbcURL, user, "TIZONE_123");// OLD
//			con = DriverManager.getConnection(SIT_JdbcURL, user, "tizone_1234");// UAT3
//			// con = DriverManager.getConnection(SIT_JdbcURL, user, "tizone_1234");// SIT
//			// con = DriverManager.getConnection(WF_JdbcURL, user, "tizone_1234");// WF
//			// con = DriverManager.getConnection(PRE_tipdb_JdbcURL, user, "tizone_1234");//
//			// PRE
//			// con = DriverManager.getConnection(PRE_tirpt_JdbcURL, user, "tizone_1234");//
//			// UAT2
//
//		} catch (ClassNotFoundException e) {
//			System.out.println(" ClassNotFoundException!" + e.getMessage());
//			e.printStackTrace();
//
//		} catch (SQLException e) {
//			System.out.println(" SQLException!" + e.getMessage());
//			e.printStackTrace();
//
//		} catch (Exception e) {
//			System.out.println(" Exception!" + e.getMessage());
//			e.printStackTrace();
//		}
//		return con;
//	}

//	public static Connection getTiglobalConnection() {
//
//		Connection con = null;
//		try {
//			String user = "TIGLOBAL";
//			String pass = "tiglobal_1234";// tizone_123
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//
//			String MIG_JdbcURL = "jdbc:oracle:thin:@10.10.19.179:1530:orcl";
//			String OLD_JdbcURL = "jdbc:oracle:thin:@10.10.19.179:1528:orcl2";
//			String UAT3_Jdbc3URL = "jdbc:oracle:thin:@10.10.20.137:1530:orcl";
//			String SIT_JdbcURL = "jdbc:oracle:thin:@10.10.20.137:1528:orcl1";
//			String WF_JdbcURL = "jdbc:oracle:thin:@10.10.7.116:1530:tiplusdb";
//			String PRE_tipdb_JdbcURL = "jdbc:oracle:thin:@10.10.7.211:1530:tiplusdb";
//			String PRE_tirpt_JdbcURL = "jdbc:oracle:thin:@10.10.7.211:1532:tireport";
//
//			con = DriverManager.getConnection(MIG_JdbcURL, user, "tiglobal_1234");// MIG
//			con = DriverManager.getConnection(OLD_JdbcURL, user, "tiglobal_1234");// OLD
//			con = DriverManager.getConnection(UAT3_Jdbc3URL, user, "tiglobal_1234");// UAT3
//			con = DriverManager.getConnection(SIT_JdbcURL, user, "tiglobal_1234");// SIT
//			con = DriverManager.getConnection(WF_JdbcURL, user, "tiglobal_1234");// WF
//			con = DriverManager.getConnection(PRE_tipdb_JdbcURL, user, "tiglobal_1234");// PRE
//			con = DriverManager.getConnection(PRE_tirpt_JdbcURL, user, "tiglobal_1234");// UAT2
//
//		} catch (ClassNotFoundException e) {
//			System.out.println(" ClassNotFoundException!" + e.getMessage());
//			e.printStackTrace();
//
//		} catch (SQLException e) {
//			System.out.println(" SQLException!" + e.getMessage());
//			e.printStackTrace();
//
//		} catch (Exception e) {
//			System.out.println(" Exception!" + e.getMessage());
//			e.printStackTrace();
//		}
//		return con;
//	}

//	 public static Connection getIdbFcConnection() {
//	
//	 Connection connection = null;
//	 try {
//	 Class.forName("oracle.jdbc.driver.OracleDriver");
//	 connection =
//	 DriverManager.getConnection("jdbc:oracle:thin:@10.10.56.174:1521:IDB",
//	 "FC", "fc123");
//	
//	 } catch (ClassNotFoundException e) {
//	 System.out.println("IDB-RATE ClassNotFoundException!" + e.getMessage());
//	 e.printStackTrace();
//	
//	 } catch (SQLException e) {
//	 System.out.println("IDB-RATE SQLException!" + e.getMessage());
//	 e.printStackTrace();
//	
//	 } catch (Exception e) {
//	 System.out.println("IDB-RATE Exception!" + e.getMessage());
//	 e.printStackTrace();
//	 }
//	 return connection;
//	 }

	// public static Connection getIdbTiplusConnection() {
	//
	// Connection connection = null;
	// try {
	// Class.forName("oracle.jdbc.driver.OracleDriver");
	// connection =
	// DriverManager.getConnection("jdbc:oracle:thin:@10.10.56.174:1530:IDB",
	// "TIPLUS", "tiplus");
	//
	// } catch (ClassNotFoundException e) {
	// System.out.println("IDB-STATICDATA ClassNotFoundException!" +
	// e.getMessage());
	// e.printStackTrace();
	//
	// } catch (SQLException e) {
	// System.out.println("IDB-STATICDATA SQLException!" + e.getMessage());
	// e.printStackTrace();
	//
	// } catch (Exception e) {
	// System.out.println("IDB-STATICDATA Exception!" + e.getMessage());
	// e.printStackTrace();
	// }
	// return connection;
	// }

	// public static Connection getNeftRtgsConnection() {
	//
	// Connection connection = null;
	// try {
	// // String neftRtgsDriverUrl =
	// // FileProperties.getFileProperties("NeftRtgsDbDriverUrl");
	// // String NeftRtgsDbUserName =
	// // FileProperties.getFileProperties("NeftRtgsDbUsername");
	// // String NeftRtgsDbEncryptedPassword =
	// // FileProperties.getFileProperties("NeftRtgsDbEncryptedPassword");
	// // String dbDecryptedPassword =
	// // EncryptDecrypt.decrypt(NeftRtgsDbEncryptedPassword);
	// // connection = DriverManager.getConnection(neftRtgsDriverUrl,
	// // NeftRtgsDbUserName, dbDecryptedPassword);
	//
	// Class.forName("oracle.jdbc.driver.OracleDriver");
	// connection =
	// DriverManager.getConnection("jdbc:oracle:thin:@10.10.56.168:1521:BNET",
	// "ep", "pe123");
	//
	// } catch (ClassNotFoundException e) {
	// System.out.println("PAYMENT-HUB ClassNotFoundException!" +
	// e.getMessage());
	// e.printStackTrace();
	//
	// } catch (SQLException e) {
	// System.out.println("PAYMENT-HUB SQLException!" + e.getMessage());
	// e.printStackTrace();
	//
	// } catch (Exception e) {
	// System.out.println("PAYMENT-HUB Exception!" + e.getMessage());
	// e.printStackTrace();
	// }
	// return connection;
	// }
	//
	// public static Connection getSMSConnection() {
	//
	// Connection connection = null;
	// try {
	// Class.forName("oracle.jdbc.driver.OracleDriver");
	// connection =
	// DriverManager.getConnection("jdbc:oracle:thin:@10.10.19.141:10002:finuatdb",
	// "alertuser",
	// "T06ZeBKbKCHebF");
	//
	// } catch (ClassNotFoundException e) {
	// System.out.println("SMS-HUB ClassNotFoundException!" + e.getMessage());
	// e.printStackTrace();
	//
	// } catch (SQLException e) {
	// System.out.println("SMS-HUB SQLException!" + e.getMessage());
	// e.printStackTrace();
	//
	// } catch (Exception e) {
	// System.out.println("SMS-HUB Exception!" + e.getMessage());
	// e.printStackTrace();
	// }
	// return connection;
	// }
	//
	// public static Connection getIdbinternalConnection() {
	//
	// Connection connection = null;
	// try {
	//
	// // System.out.println("dbEncryptedPassword " + dbEncryptedPassword);
	//
	// Class.forName("oracle.jdbc.driver.OracleDriver");
	// connection =
	// DriverManager.getConnection("jdbc:oracle:thin:@10.10.20.137:1528:orcl1",
	// "IDB", "idb");
	//
	// } catch (ClassNotFoundException e) {
	// System.out.println("IDB-INTERNAL ClassNotFoundException!" +
	// e.getMessage());
	// e.printStackTrace();
	//
	// } catch (SQLException e) {
	// System.out.println("IDB-INTERNAL SQLException!" + e.getMessage());
	// e.printStackTrace();
	//
	// } catch (Exception e) {
	// System.out.println("IDB-INTERNAL Exception!" + e.getMessage());
	// e.printStackTrace();
	// }
	// return connection;
	// }

}
