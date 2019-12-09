package com.cabgemini.exception.examples;

public class InvalidAgeexception extends RuntimeException
{  // exception created by the developer called as custom exception

		public InvalidAgeexception(String message) {
		this.message = message;
	}

		private String message = "Invalid age for playing PUBG";
		// we can only override one method either get message or toString
		@Override
		public String getMessage() // this method is not compulsory
		{
			return message;
		}
		
		@Override
		public String toString()
		{
			return message;
		}
		
}
