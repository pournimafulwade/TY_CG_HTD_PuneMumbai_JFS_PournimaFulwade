package com.cabgemini.exception.examples;

public class Amount {
	
	void check(int i) throws InvalidLimitException
	{
		if(i>40000)
		{
			throw new InvalidLimitException();
		}
	}

}
