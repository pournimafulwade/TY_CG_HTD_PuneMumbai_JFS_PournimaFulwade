package com.capg.corejava.interfaces;

public class Test {

	public static void main(String[] args) {
		ICICI i = new ICICI();
		Machine m = new Machine();
		m.slot(i);
		SBI s = new SBI();
		m.slot(s);

	}

}
