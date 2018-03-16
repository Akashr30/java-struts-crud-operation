package com.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
		
	private static Connection connection;
	private static Singleton object = null;
	
	private Singleton() throws ClassNotFoundException {
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			this.connection = DriverManager.getConnection(
					"jdbc:sqlserver://192.168.8.199\\SQLEXPRESS:1433;databaseName=AML_Training;"
																	+ "user=sa;password=sql123");
		}catch (SQLException ex) {
			System.out.println("SQL statement is not executed!" + ex) ;
			}
		}
		
		public Connection getConnection() {
			return connection;
		}
		
		public static Singleton getInstance() throws ClassNotFoundException {
			
			if(object == null) {
				object = new Singleton();
			}
			return object;
		}
		
	}
		





