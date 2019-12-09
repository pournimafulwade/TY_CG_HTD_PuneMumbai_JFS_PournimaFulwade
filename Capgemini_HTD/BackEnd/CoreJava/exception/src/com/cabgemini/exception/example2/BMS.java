package com.cabgemini.exception.example2;

public class BMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		
		PVR p = new PVR();
		try
		{
			p.confirm();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught at main");
		}
		
		System.out.println("main end");

	}

}
