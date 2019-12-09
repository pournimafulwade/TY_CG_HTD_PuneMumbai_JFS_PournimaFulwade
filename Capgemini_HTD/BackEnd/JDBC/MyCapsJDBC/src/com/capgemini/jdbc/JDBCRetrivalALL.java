package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCRetrivalALL {

	public static void main(String[] args) {

		Connection conn = null;
		FileReader reader;
		Properties prop = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			
			//load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.............");
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			//get the connection
			String dbUrl =prop.getProperty("dbUrl");
			conn =DriverManager.getConnection(dbUrl, prop.getProperty("user"),prop.getProperty("password"));
			System.out.println("Connection Established.........");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
			
			//Issue a query
			String query ="select * from users_info";
			stmt =conn.createStatement();
			rs =stmt.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println("User Id : "+rs.getInt(1));
				System.out.println("User name : "+rs.getString(2));
				System.out.println("Email : "+rs.getString(3));
				System.out.println("Password : "+rs.getString(4));
				System.out.println("------------------------------------");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(conn!=null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(stmt!=null)
			{
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
		}
		
	}

}
