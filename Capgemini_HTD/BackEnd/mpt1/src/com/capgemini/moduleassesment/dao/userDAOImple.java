package com.capgemini.moduleassesment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class userDAOImple  implements userDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	
	public userDAOImple(){
		try{
		Class.forName("com.maysql.jdbc.Driver");
		System.out.println("*********DRIVER LOADED*********");
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		}

	@Override
public userDAO register(String userName, String passWord) {
		
		try {
			String dburl = "jdbc:mysql://localhost:3306/Gmail?user=J2EE&password=root";
			conn = DriverManager.getConnection(dburl);

			String query = "INSERT INTO Account VALUES(?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userName);
			pstmt.setString(2, passWord);
			
			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("Register sucessfully........");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	

	@Override
	public userDAO composeMail(String eMail, String passWord) {

		try {
			String dburl = "jdbc:mysql://localhost:3306/Gmail?user=J2EE&password=root";
			conn = DriverManager.getConnection(dburl);
			
			String query = "select * from Account where eMail =? and passWord = ?";
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, eMail);
			pstmt.setString(2,passWord);
		
			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("dsta inserted........");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}





	
	
	@Override
	public userDAO showInbox(String eMail, String passWord) {
		try{
		String dbUrl = "jdbc:mysql://localhost:3306/Gmail?user=J2EE & password=root";
		conn = DriverManager.getConnection(dbUrl);
		String query = "select Message from Inbox where UserId=(select UserId from Account where Email =? and Password=?)";
		pstmt = conn.prepareStatement(query);

		System.out.println("enter your email id to see the message:");
		String Email = sc.nextLine();
		System.out.println("enter the password to see the message:");
		String password = sc.nextLine();


		try (ResultSet rs = pstmt.executeQuery()) {
						if (rs.next()) {
							email = new userDAO();
							email.getMessage(1);
							System.out.println("your message is =" + rs.getString(1));
						

						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				
				return null;
		}
		finally
		{
		}
		
	}
}


				
			
			





