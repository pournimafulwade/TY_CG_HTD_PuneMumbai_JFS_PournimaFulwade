package com.capgemini.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//Load the Driver
			java.sql.Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver); //interface of driver
			System.out.println("Driver Loaded...");
			System.out.println("**************");
			
			// Get DB Connection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=J2EE&password=tiger";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Connection Establish...");
			System.out.println("************************");
			
			// Issue SQL Query via Connection
			String query = "SELECT * FROM users_info";
			conn.createStatement();
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
		} 
		catch (SQLException e) {
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
