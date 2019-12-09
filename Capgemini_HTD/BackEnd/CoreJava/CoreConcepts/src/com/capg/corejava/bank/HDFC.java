package com.capg.corejava.bank;

public class HDFC implements ATM {

	@Override
	public void validate() {
		System.out.println("........connecting to HDFC");
		System.out.println("validating the HDFC card");

	}

	@Override
	public void getInfo() {
		System.out.println("........connecting to HDFC");
		System.out.println("getting the  HDFC account holder info");

	}

}
