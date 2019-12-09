package com.capgemini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableExample {

	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		Scanner s = new Scanner(System.in);

		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded...");
			System.out.println("*******************");
			
			// Get the connection
			String dburl = "jdbc:mysql://localhost:3306/capg_db";
			System.out.println("Enter user and password");
			String user = s.nextLine();
			String password = s.nextLine();
			conn = DriverManager.getConnection(dburl,user,password);
			System.out.println("Connection Estb...");
			System.out.println("************************");
			
			//Issue SQL Query
			String query = "call shinde()";
			cstmt = conn.prepareCall(query); // for callableStatement we use preparecall
			boolean b = cstmt.execute(query);
			
			if(b) {
				rs = cstmt.getResultSet();
				while(rs.next()) {
					System.out.println("userid : "+rs.getInt(1));
					System.out.println("user name : "+rs.getString(2));
					System.out.println("email )"+rs.getString(3));
					System.out.println("password )"+rs.getString(3));
					System.out.println("********************************");
					
				}
			}
			else {
				int i = cstmt.getUpdateCount();
				if(i>0) {
					System.out.println("Operation Succesfull...");
				}
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
				if(cstmt!= null) {
					try {
						cstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		s.close();


	}

}
