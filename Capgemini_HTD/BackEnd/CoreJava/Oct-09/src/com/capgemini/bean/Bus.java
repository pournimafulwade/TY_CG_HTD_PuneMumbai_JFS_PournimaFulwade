package com.capgemini.bean;

public class Bus {
	private final String name; 
	private final int seats;
	public Bus(String name, int seats) {
		this.name = name;
		this.seats = seats;
	}
	public String getName() {
		return name;
	}
	public int getSeats() {
		return seats;
	}
	
	
	
}
