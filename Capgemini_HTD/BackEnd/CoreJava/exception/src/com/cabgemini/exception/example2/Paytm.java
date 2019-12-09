package com.cabgemini.exception.example2;

public class Paytm {

	void book()
	{
		System.out.println("book started");
		
		IRCTC i = new IRCTC();
		try
		{
		i.confirm();
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled in paytm");
		}
		System.out.println("Book Ended");
	}
}
