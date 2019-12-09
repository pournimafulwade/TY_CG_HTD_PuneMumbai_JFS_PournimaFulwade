package com.capgemini.com.JDBC14_10.application;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.capgemini.dao.UserBean1;

public class UserDAOJDBCImpl implements UserDAO1 {
	FileReader reader = null;
	Properties prop = null;
	UserBean1 user ;
	
	public UserDAOJDBCImpl () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public UserBean1 getInfo(int userid,String user,String password) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl1"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2")))
		{
			pstmt.setInt(1, userid);
			try (ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					user = new UserBean1();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
				}
				return user;
			}catch (Exception e) {
				e.printStackTrace();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
