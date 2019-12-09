package com.capg.corejava.bank;

public class ICICI implements ATM {

	@Override
	public void validate() {
		System.out.println("........connecting to ICICI");
		System.out.println("validating the ICICI card");
	}

	@Override
	public void getInfo() {
		System.out.println("........connecting to ICICI");
		System.out.println("getting the  ICICI account holder info");
		

	}

}
