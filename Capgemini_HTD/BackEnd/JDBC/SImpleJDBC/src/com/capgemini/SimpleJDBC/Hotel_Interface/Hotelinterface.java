package com.capgemini.SimpleJDBC.Hotel_Interface;

import com.capgemini.SimpleJDBC.Hotel_Info.Hotelinfo;


public interface Hotelinterface {

		public Hotelinfo getAllFoodItem();
		
		public Hotelinfo getOrderFromUser(int item_code);
		
		public Hotelinfo insertFoodItem(int item_code,String food_name,double price);
		
		public Hotelinfo removeFoodItem(int item_code);
		
		public Hotelinfo modifyFoodItem(int item_code,String food_name);
		
		public Hotelinfo totalBill(int count);
		
		public Hotelinfo press2login(int count,int button);
		
		
}//end of interface
