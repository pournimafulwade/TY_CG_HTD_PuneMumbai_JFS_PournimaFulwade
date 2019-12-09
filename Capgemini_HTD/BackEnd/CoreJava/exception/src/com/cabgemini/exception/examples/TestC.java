package com.cabgemini.exception.examples;

public class TestC {

	public static void main(String[] args) {
		
		Validator v= new Validator();
		try
		{
			v.verify(15);
			System.out.println("Welcome to PUBG");
		}
		catch(InvalidAgeexception in)
		{
			System.out.println(in.getMessage());
		}
	}

}
