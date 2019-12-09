package com.capg.corejava.bank;

public class TestC {

	public static void main(String[] args) {
	
		Machine m = new Machine();
		ICICI i = new ICICI();
		HDFC h = new HDFC();
		SBI s = new SBI();
		m.slot(i);

	}

}
