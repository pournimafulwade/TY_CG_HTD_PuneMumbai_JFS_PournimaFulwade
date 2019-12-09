package com.capgemini.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EnvolvedJDBCProperties {

	public static void main(String[] args) {
		FileReader reader = null;
		Properties prop = null;
		try {
			//Load Driver
			 reader = new FileReader("db.properties");
			 prop = new Properties();
			 prop.load(reader);
			 Class.forName(prop.getProperty("driverClass"));
			 System.out.println("Driver loaded.....");
			 System.out.println("***************************");
			 
			 //Get Connection
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl1"), prop.getProperty("user"),prop.getProperty("password"));
		Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query"))){
	while(rs.next()) {
		System.out.println("user id :"+rs.getInt(1));
		System.out.println("User Name :"+rs.getString(2));
		System.out.println("Email Id :"+rs.getString(3));
		System.out.println("*********************************");
	}
	
	
}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}

}
