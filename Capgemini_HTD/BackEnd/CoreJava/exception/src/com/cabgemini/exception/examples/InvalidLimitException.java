package com.cabgemini.exception.examples;

public class InvalidLimitException extends Exception{

	private String message ="Day limit is 40000";
	@Override
	public String getMessage() {
		return message;
	}
}
