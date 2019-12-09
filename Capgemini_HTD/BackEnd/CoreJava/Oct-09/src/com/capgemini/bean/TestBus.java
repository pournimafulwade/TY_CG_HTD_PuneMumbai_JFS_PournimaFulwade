package com.capgemini.bean;

public class TestBus {

	public static void main(String[] args) {
		Bus b = new Bus("BEST",2000);
		System.out.println("Bus Name" +b.getName());
		System.out.println("Bus seats" +b.getSeats());
	}

}
