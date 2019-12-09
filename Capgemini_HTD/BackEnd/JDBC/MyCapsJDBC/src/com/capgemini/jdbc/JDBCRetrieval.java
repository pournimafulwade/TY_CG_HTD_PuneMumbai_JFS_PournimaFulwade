package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCRetrieval {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner s = new Scanner(System.in);
		
		//Load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
			System.out.println("******************");
			
			//Get DB Connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db?user=J2EE&password=tiger";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Connection Establish...");
			System.out.println("************************");
			
			//Issue The SQL Query
			String query = "SELECT * FROM users_info WHERE userid=?";
			pstmt = conn.prepareStatement(query);    //It taking input because it contain precompiled input 
			System.out.println("Enter the userid : ");
			pstmt.setInt(1,s.nextInt());   //INT because userid is number or else we can use String
			rs = pstmt.executeQuery();
			
			//Process the Result
			if(rs.next()) {
				System.out.println("User id :"+rs.getInt(1));
				System.out.println("User name :"+rs.getString(2));
				System.out.println("User email :"+rs.getString(3));
				System.out.println("User Password"+rs.getString(4));
			}
			else
				System.out.println("wrong");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(conn!=null) {
				try {
					conn.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
				if(pstmt!= null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
				if(s!= null) {
					s.close();
			}
		}

	}

}
}
