package com.cabgemini.exception.examples;

public class TestAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amount a = new Amount();
		try
		{
			a.check(45000);
			System.out.println("valid amount");
		} 
		catch (InvalidLimitException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
