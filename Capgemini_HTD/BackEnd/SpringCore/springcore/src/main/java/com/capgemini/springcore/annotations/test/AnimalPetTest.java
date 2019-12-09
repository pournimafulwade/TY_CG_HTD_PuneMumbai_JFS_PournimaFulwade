package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotations.bean.Pet;
import com.capgemini.springcore.annotations.config.PetConfig;

public class AnimalPetTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet = context.getBean(Pet.class);

		System.out.println(pet.getName());
		pet.getAnimal().walk();
		pet.getAnimal().eat();
		pet.getAnimal().speak();

	}// end of the main()
}// end of the class
