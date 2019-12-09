package com.capgemini.springcore.annotations.bean;

import com.capgemini.springcore.interfaces.Animal;

public class Panda implements Animal {

	@Override
	public void eat() {
		System.out.println("Panda eats Bamboo");
	}// end of the eat()

	@Override
	public void walk() {
		System.out.println("Panda walking ");
	}// end of the walk()

	@Override
	public void speak() {
		System.out.println("Panda Squeaks");
	}// end of the speak()
}// end of the class
