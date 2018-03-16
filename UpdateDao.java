package com.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDao {

	public void updateDao(String username, String email_id, String password)throws Exception {
			
		System.out.println("initiating JDBC Connnction...");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con = DriverManager.getConnection("jdbc:sqlserver://192.168.8.199\\SQLEXPRESS:1433;"
					+ "databaseName=AML_Training;"+ "user=sa;password=sql123");
//		Singleton singleton = Singleton.getInstance();
		
			try {
				
				try {
//					Statement st = singleton.getConnection().createStatement();
					Statement st = con.createStatement();
					int value = st.executeUpdate("update strutsLogin set username = '"+username+"', email_id ='"+email_id+"',password = '"+password+"'where username = '"+username+"' ");
					System.out.println("1 row affected " + value);
				}catch (SQLException ex) {
					System.out.println("SQL statement is not executed!" + ex);
			}
//				singleton.getConnection().close();
				con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
  }

}
