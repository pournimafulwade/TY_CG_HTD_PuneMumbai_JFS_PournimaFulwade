package com.cabgemini.exception.example2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started");
		
		Paytm p = new Paytm();
		try
		{
		p.book();
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception is handled at main");
		}
		
		System.out.println("Main ended");

	}

}
