package com.capg.corejava.bank;

public class SBI implements ATM {

	@Override
	public void validate() {
		System.out.println("........connecting to SBI");
		System.out.println("validating the SBI card");
		

	}

	@Override
	public void getInfo() {
		System.out.println("........connecting to SBI");
		System.out.println("getting the  SBI account holder info");
		

	}

}
