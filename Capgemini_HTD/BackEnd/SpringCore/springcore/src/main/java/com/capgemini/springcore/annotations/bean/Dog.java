package com.capgemini.springcore.annotations.bean;

import com.capgemini.springcore.interfaces.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Eats Pedigree");
	}// end of the eat()

	@Override
	public void walk() {
		System.out.println("Dog is running....");
	}// end of the walk()

	@Override
	public void speak() {
		System.out.println("Bow Bow");
	}// end of the speak()
}// end of the class
