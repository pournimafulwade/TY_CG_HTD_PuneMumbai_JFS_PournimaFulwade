package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JBBCUpdate {

	public static void main(String[] args) {

		Connection conn =null;
		Scanner Sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
			System.out.println("---------------------");
			
			//driver connection
			String dbUrl = "jdbc:mysql://localhost:3306/capg_db";
			System.out.println("Enter the username and password");
			String user = Sc.nextLine();
			String password =Sc.nextLine();
			conn=DriverManager.getConnection(dbUrl , user , password);
			System.out.println("Connection established....");
			
			//Issue the query
			String query = "Update users_info set password = ? where userid=?";
			pstmt =conn.prepareStatement(query);
			System.out.println("Enter the userid : ");
			pstmt.setInt(2, Integer.parseInt(Sc.nextLine()));
			System.out.println("Update the password : ");
			pstmt.setString(1, Sc.nextLine());
			
			int i =pstmt.executeUpdate();
			
			if(i>0)
			{
				System.out.println("data Updated...");
			}
			else
			{
				System.out.println("please enter valid details");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(conn!=null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Sc.close();
		}
		
	}

}
