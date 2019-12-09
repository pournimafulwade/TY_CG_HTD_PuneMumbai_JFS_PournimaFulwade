package com.capgemini.SimpleJDBC.Hotel_Main;

import java.util.Scanner;

import com.capgemini.SimpleJDBC.Hotel_Factory.Hotelfactory;
import com.capgemini.SimpleJDBC.Hotel_Info.Hotelinfo;
import com.capgemini.SimpleJDBC.Hotel_Interface.Hotelinterface;

public class Hotelmain {

	public static void display(Hotelinterface obj) {

		//Hotelinterface obj = Hotelfactory.getInstance();

		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to show all food items");
		System.out.println("press 2 to take order from customer");
		System.out.println("press 3 to operate on food items");
		System.out.println("press 4 to total bill of the day");
		System.out.println("press 5 to only order an food.............");
		System.out.println("press 6 to total bill of the ordered item.........");
		System.out.println("\nselect the number and enter it");
		int button = Integer.parseInt(sc.nextLine());

		if (button == 1) {
			Hotelinfo obj2 = obj.getAllFoodItem();

//			if(obj2 != null)
//			{
//				System.out.println(obj2);
//			}
//			else
//			{				
//				System.out.println("something went wrong");
//			}
		} // end of button =1
		else if (button == 5) {
			System.out.println("Enter the Food itme code");
			int item_code = Integer.parseInt(sc.nextLine());
			Hotelinfo obj3 = obj.getOrderFromUser(item_code);

//			if(obj3 != null)
//			{	
//				System.out.println(obj3);
//			}
//			else
//			{
//				System.out.println("something went wrong");
//			}
		} // end of button =2
		else if (button == 3) {
			System.out.println("Enter A to add the food item");
			System.out.println("Enter B to remove food item");
			System.out.println("enter C to modify food item");
			System.out.println("enter the key");
			String foodchar = sc.nextLine();
			if (foodchar.equals("A")) {
				System.out.println("Enter fooditem code");
				int item_code1 = Integer.parseInt(sc.nextLine());
				System.out.println("Enter the food name");
				String food_name1 = sc.nextLine();
				System.out.println("enter the food price");
				double price1 = Double.parseDouble(sc.nextLine());
				Hotelinfo obj4 = obj.insertFoodItem(item_code1, food_name1, price1);
			} else if (foodchar.equals("B")) {
				System.out.println("Enter fooditem codewhich you want to delete");
				int item_code2 = Integer.parseInt(sc.nextLine());
				Hotelinfo obj5 = obj.removeFoodItem(item_code2);
			} else if (foodchar.equals("C")) {
				System.out.println("Enter fooditem codewhich you want to update");
				int item_code3 = Integer.parseInt(sc.nextLine());
				System.out.println("enter food name");
				String food_name3 = sc.nextLine();
				Hotelinfo obj6 = obj.modifyFoodItem(item_code3, food_name3);

			} else {
				System.out.println("Please enter correct character");
			}

		} // end of button = 3
		else if (button == 6) {
			System.out.println("enter how many items you want to order");
			int count = Integer.parseInt(sc.nextLine());

//				for(int i=0;i<count;i++)
//				{
//				System.out.println("enter the food item code for billing");
//				int item_code4 = Integer.parseInt(sc.nextLine());
//				//Hotelinfo obj7=obj.totalBill(item_code4);
//				 
//				}
			Hotelinfo obj7 = obj.totalBill(count);
		} else if (button == 2) {
			System.out.println("enter how many items you want to order");
			int count = Integer.parseInt(sc.nextLine());

			Hotelinfo obj8 = obj.press2login(count,button);

		}else 
			if(button==4) {
			
				System.out.println("............");
				
				int count = 0;

				Hotelinfo obj8 = obj.press2login(count,button);
				
			}

		else {
			System.out.println("please enter valid number");
		}
		
		
		System.out.println("...................................");
		
		System.out.println("enter yes to continue or enter no to exit");
		String a=sc.nextLine();
		if(a.equals("yes"))
		{
			
			display(obj);
		}
		else
			if(a.equals("no")) {
				System.out.println("exit");
				return;
			}
	}//end of display method
		public static void main(String[] args) {
			Hotelinterface obj = Hotelfactory.getInstance();
			display(obj);
			
	}// end of main

}// end of class
