package com.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.struts.action.ActionForm;

public class SignUpDao  {

	public void insert(String username, String email_id, String password) throws Exception {
			
		System.out.println("jdbc Connection initiating...");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con = DriverManager.getConnection("jdbc:sqlserver://192.168.8.199\\SQLEXPRESS:1433;"
					+ "databaseName=AML_Training;"+ "user=sa;password=sql123");
//			Singleton singleton = Singleton.getInstance();
			
			try {
				
				try {
					Statement st = con.createStatement();
//					Statement st = singleton.getConnection().createStatement();
					int value = st.executeUpdate("INSERT INTO strutsLogin (username,email_id,password)"+" VALUES('"+username+"','"+ email_id +"','"+password+"')");
					System.out.println("1 row affected" + value);
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
