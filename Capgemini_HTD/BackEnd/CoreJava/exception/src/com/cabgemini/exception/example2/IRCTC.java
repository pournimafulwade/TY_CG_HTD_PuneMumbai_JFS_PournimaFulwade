package com.cabgemini.exception.example2;

public class IRCTC {
	
	void confirm()
	{
		System.out.println("Confirm Started");
		
		try
		{
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled at irctc");
		}
		System.out.println("onfirm Ended");
	}

}
