package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MultipleUser {

	public static void main(String[] args) {
		Connection conn = null;
		FileReader reader;
		Properties prop = null;
		ResultSet rs = null;
		Statement stmt = null;
		
		// Load Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} //interface of driver
		System.out.println("Driver Loaded...");
		System.out.println("**************");
		
		try { //User name and Password
			reader = new FileReader("db.propertiesj"); // will go inside the file and make it ready
			prop = new Properties(); //created object of a properties to invoke this we used FileReader
			prop.load(reader);  // To use properties we invoke load it will load all files inside properties

		} catch (Exception e) {
			e.printStackTrace();
		} 

		
		try {
			// Get the Connection
			String dburl = prop.getProperty("dbUrl1");
			conn = DriverManager.getConnection(dburl,prop.getProperty("user"),prop.getProperty("password"));
			System.out.println("Connection Establish........");
			System.out.println("********************************");
			
			// Issue SQL query
			String query = "select * from users_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			//Process the Results return by SQL query
			while(rs.next()) {
				System.out.println("User id:" +rs.getInt("userid"));
				System.out.println("User Name:" +rs.getString("username"));
				System.out.println("Email id:" +rs.getString("email"));
				System.out.println("Password :" +rs.getString("password"));
				System.out.println("*****************************************");
			}
			} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!= null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
		}

	}



	}

}
