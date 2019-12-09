package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.capgemini.springcore.annotations.bean.Pet;

@Import(AnimalConfig.class)
@Configuration
public class PetConfig {

	@Bean
	public Pet getPet() {
		Pet myPet = new Pet();
		myPet.setName("panda name is pappu");
		
		return myPet;
	}//end of the getPet()
}//end of the class
