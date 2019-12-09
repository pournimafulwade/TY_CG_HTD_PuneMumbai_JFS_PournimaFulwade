package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpdate {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			try {
				// load the driver
				java.sql.Driver driver = new com.mysql.jdbc.Driver();
				DriverManager.deregisterDriver(driver);
				System.out.println("Driver Loaded");
				System.out.println("***************");
				
				//get db connection
				String dburl= "jdbc:mysql://localhost:3306/capg_db?user=J2EE&password=tiger";
				conn = DriverManager.getConnection(dburl);
				System.out.println("Connection Establish...");
				System.out.println("************************");
				
				conn = DriverManager.getConnection(dburl);
				System.out.println("Connection Establish");
				System.out.println("**********************");
				
				//Issue the SQL Query
				String query = "update users_info set username=? where userid=?";
				pstmt = conn.prepareStatement(query);
				System.out.println("Enter username....");
				pstmt.setString(1,s.nextLine());
				System.out.println("Enter userid....");
				pstmt.setInt(2,Integer.parseInt(s.nextLine()));
				
				int count=pstmt.executeUpdate();
				
				//Process the result
				if(count>0) {
					System.out.println("Data Updated...");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				if(conn!= null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					if(pstmt!= null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}
			s.close();

	}

}
