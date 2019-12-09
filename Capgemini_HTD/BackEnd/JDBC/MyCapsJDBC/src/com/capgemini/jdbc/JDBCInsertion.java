package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCInsertion {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner s = new Scanner(System.in);
		
		// Load the Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
			System.out.println("******************");
			
			// Get the Connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=J2EE&password=root";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Connection Establish...");
			System.out.println("************************");
			
			//Issue SQL Query
			String query = "INSERT INTO users_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter Userid....");
			pstmt.setInt(1,Integer.parseInt(s.nextLine())); //because nextline gives only string thus we have converted into integer type
			System.out.println("Enter username....");
			pstmt.setString(2, s.nextLine());
			System.out.println("Enter email id...");
			pstmt.setString(3, s.nextLine());
			System.out.println("Enter Password...");
			pstmt.setString(4, s.nextLine());
			
			int count=pstmt.executeUpdate();
			
			
			
			//Process the Result
			if(count>0) {
				System.out.println("Data Inserted...");
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
