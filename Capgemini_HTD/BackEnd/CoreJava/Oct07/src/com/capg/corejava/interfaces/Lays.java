package com.capg.corejava.interfaces;

public class Lays implements Chips {
	public void open() {
		System.out.println("open chips");
	}

	@Override
	public void eat() {
		System.out.println("eating lays");
		
	}
	

}
