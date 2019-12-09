package com.cabgemini.exception.examples;

public class Pen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		 try
		 {
			 
			 System.out.println("hi");
			 System.out.println(10/0);
			 System.out.println("keep smiling");
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("plz dont devide by zero");
		 }
		 
		 System.out.println("Main ended");

	}

}
