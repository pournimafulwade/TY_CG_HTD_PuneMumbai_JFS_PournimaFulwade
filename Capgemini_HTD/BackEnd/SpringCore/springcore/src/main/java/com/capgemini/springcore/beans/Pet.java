package com.capgemini.springcore.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Pet {
	 
	private String name;
	private Animal animal;
	
	
	//getter and setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
	
}//enf of the class
