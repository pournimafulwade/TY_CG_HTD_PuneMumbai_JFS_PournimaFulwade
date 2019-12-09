package com.capgemini.springcore.beans;

public class MessageBean2 {
	private String message;
	
	 public MessageBean2() {
		 System.out.println("Inside Constructor...");
	}
	
	// getter and setter method
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("its init phase...");
	}

	public void destroy() {
		System.out.println("its dostroy phase...");
	}
}// end of the class
