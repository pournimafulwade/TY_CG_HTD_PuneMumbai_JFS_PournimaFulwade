package com.capgemini.SimpleJDBC.Hotel_Implimentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

import com.capgemini.SimpleJDBC.Hotel_Info.Hotelinfo;
import com.capgemini.SimpleJDBC.Hotel_Interface.Hotelinterface;

public class Hotelimplementation implements Hotelinterface {

	Hotelinfo hotel = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
	double day_total=0;
	
	public Hotelimplementation() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("........Driver loaded........");
		} // end of try

		catch (Exception e) {
			e.printStackTrace();
		} // end of catch

	}// end of constructor

	@Override
	public Hotelinfo getAllFoodItem() {

		try {
			String dburl = "jdbc:mysql://localhost:3306/Hotel_db?user=root&password=root";
			conn = DriverManager.getConnection(dburl);

			String query = "Select * from Hotel_bill";
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
//				hotel = new Hotelinfo();
//				hotel.setItem_code(rs.getInt(1));
//				hotel.setFood_name(rs.getString(2));
//				hotel.setPrice(rs.getDouble(3));
				System.out.println("Item COde = " + rs.getInt(1));
				System.out.println("Food Name = " + rs.getString(2));
				System.out.println("Price     = " + rs.getDouble(3));
			} // end of while

		} // end of try

		catch (Exception e) {
			e.printStackTrace();
		} // end of catch

		return null;
	}// end of getAllFoodItem method

	@Override
	public Hotelinfo getOrderFromUser(int item_code) {

		try {
			String dburl = "jdbc:mysql://localhost:3306/Hotel_db?user=root&password=root";
			conn = DriverManager.getConnection(dburl);

			String query = "select * from Hotel_bill where Item_code = ?";

			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, item_code);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
//					hotel = new Hotelinfo();
//					hotel.setItem_code(1);
//					hotel.setFood_name(rs.getString(2));
//					hotel.setPrice(rs.getDouble(3));

					System.out.println("your food Item code is =" + rs.getInt(1));
					System.out.println("your food name is = " + rs.getString(2));
					System.out.println("price of that food is = " + rs.getDouble(3));

				}
				// return hotel;
			} catch (Exception e) {
				e.printStackTrace();
			}

		} // end of fisrt try

		catch (Exception e) {
			e.printStackTrace();
		} // end of first try catch

		return null;
	}// end of getOrderFromUser method

	@Override
	public Hotelinfo insertFoodItem(int item_code, String food_name, double price) {

		try {
			String dburl = "jdbc:mysql://localhost:3306/Hotel_db?user=root&password=root";
			conn = DriverManager.getConnection(dburl);

			String query = "INSERT INTO Hotel_bill VALUES(?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, item_code);
			pstmt.setString(2, food_name);
			pstmt.setDouble(3, price);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				System.out.println("dsta inserted........");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}// end of insertfooditem method

	@Override
	public Hotelinfo removeFoodItem(int item_code) {

		try {
			String dburl = "jdbc:mysql://localhost:3306/Hotel_db?user=root&password=root";
			conn = DriverManager.getConnection(dburl);
			String query = "Delete from Hotel_bill where item_code = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, item_code);
			int count = pstmt.executeUpdate();

			if (count > 0) {
				System.out.println("data deleted......");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}// end of remove food item method

	@Override
	public Hotelinfo modifyFoodItem(int item_code, String food_name) {

		try {
			String dburl = "jdbc:mysql://localhost:3306/Hotel_db?user=root&password=root";
			conn = DriverManager.getConnection(dburl);

//			System.out.println("Enter 1 if u want to update food name");
//			System.out.println("Enter 2 if u want to update price");

//			int num = Integer.parseInt(sc.nextLine());
//			
//			if(num==1)
//			{
//				System.out.println("enter new food name");
//				pstmt.setString(1, sc.nextLine());
//			}
//			else
//				if(num == 2)
//				{
//					System.out.println("enter new food price");
//					pstmt.setDouble(1, Double.parseDouble(sc.nextLine()));
//				}
//				else
//				{
//					System.out.println("enter valid number");
//				}
			String query = "update Hotel_bill set food_name = ? where item_code = ?";
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, food_name);
			pstmt.setInt(2, item_code);
			int count = pstmt.executeUpdate();

			if (count > 0) {
				System.out.println("dsta updated........");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}// end of modify food item

	@Override
	public Hotelinfo totalBill(int count) {
		double total = 0;
		for(int i=1;i<=count;i++) {
		try {

			String dburl = "jdbc:mysql://localhost:3306/Hotel_db?user=root&password=root";
			conn = DriverManager.getConnection(dburl);

			String query = "select price from Hotel_bill where item_code = ?";
			pstmt = conn.prepareStatement(query);
			System.out.println("enter the item code");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			ResultSet rs = pstmt.executeQuery();

			

			if (rs.next())

			{
				total = rs.getDouble(1) + total;
				//System.out.println("total price of that food is = " + total);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
		System.out.println("total price of that food is = " + total);
		return null;
	}

	@Override
	public Hotelinfo press2login(int count,int button) {
		if(button==2) {
		double total = 0;
				for(int i=1;i<=count;i++) {
		try {

			String dburl = "jdbc:mysql://localhost:3306/Hotel_db?user=root&password=root";
			conn = DriverManager.getConnection(dburl);
			
			System.out.println("Enter your food item code");
			int item_code=Integer.parseInt(sc.nextLine());
			String query1="select * from Hotel_bill where Item_code = ?";
			PreparedStatement pstmt = conn.prepareStatement(query1);
			pstmt.setInt(1, item_code);
			

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
//					hotel = new Hotelinfo();
//					hotel.setItem_code(1);
//					hotel.setFood_name(rs.getString(2));
//					hotel.setPrice(rs.getDouble(3));

					System.out.println("your food Item code is =" + rs.getInt(1));
					System.out.println("your food name is = " + rs.getString(2));
					System.out.println("price of that food is = " + rs.getDouble(3));

				}
				// return hotel;
			} catch (Exception e) {
				e.printStackTrace();
			}

			
			String query = "select price from Hotel_bill where item_code = ?";
			pstmt = conn.prepareStatement(query);
		
			pstmt.setInt(1, item_code);
			ResultSet rs = pstmt.executeQuery();

			

			if (rs.next())

			{
				total = rs.getDouble(1) + total;
				//System.out.println("total price of that food is = " + total);
				day_total=total+day_total;

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
		
		System.out.println("press 0 to get total bill of your order");
		int zero = Integer.parseInt(sc.nextLine());
		if(zero==0)
		{
		System.out.println("total price of that food is = " + total);
		}
		
		//totaldaybill( day_total);
		
		}
		if(button==4)
		{
//			public static void totaldaybill(double day_total)
//			{
//				System.out.println("total bill of the day"+day_total);
//				
//			}
			
			System.out.println("total bill of the day"+day_total);
		}
		return null;
	}//end of press2logic
	
	

}// end of class
