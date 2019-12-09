package com.capgemini.bean;

public class TestB {

	public static void main(String[] args) {

		Car c = new Car(20,"Benz");
		System.out.println("Cost : "+c.getCost());
		System.out.println("Name : "+c.getName());
		
		Car c1 = new Car(200,"Benz");
		System.out.println("Cost : "+c1.getCost());
		System.out.println("Name : "+c1.getName());
		
	}

}
