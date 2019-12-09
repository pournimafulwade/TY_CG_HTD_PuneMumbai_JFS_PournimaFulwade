package com.cabgemini.exception.examples;

public class Validator {

	void verify(int  age)
	{
		if(age <18)
		{
			/*
			 * InvalidAgeexception ink = new InvalidAgeexception();
			 */
			//throw new InvalidAgeexception();
			throw new InvalidAgeexception("you are not allowed");// we can create our own message using parameterize constructor
		}
	}
}
