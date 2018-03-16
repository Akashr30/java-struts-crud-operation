package com.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.struts.form.LoginForm;

public class LoginDao extends LoginForm {
	
	private static final long serialVersionUID = 1L;
	String sqlDoLogin ;
	PreparedStatement psDoLogin ;
	public ResultSet rsDoLogin ;
	
	public String readData(String username,String password) throws Exception{
		  String Passwd= null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://192.168.8.199\\SQLEXPRESS:1433;databaseName=AML_Training;"
																	+ "user=sa;password=sql123");
		/*  Singleton singleton = Singleton.getInstance();
		  */
				try {					
					sqlDoLogin = "select * from strutsLogin where username ='"+username+"'";
					 psDoLogin = con.prepareStatement(sqlDoLogin);
//					 psDoLogin = singleton.getConnection().prepareStatement(sqlDoLogin);

					 rsDoLogin = psDoLogin.executeQuery();
					 System.out.println(username);
					 
					 while(rsDoLogin.next()) {
						 String userName = rsDoLogin.getString("username");
						   Passwd = rsDoLogin.getString("password");
						 System.out.println(userName+" "+Passwd);
						 
					 }
				}catch (SQLException ex) {
					System.out.println("SQL statement is not executed!" + ex);
				}
					con.close();
//				singleton.getConnection().close();
				return Passwd;		
		}	
}
