package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.annotations.bean.ISuzu;
import com.capgemini.springcore.annotations.bean.Volkswagen;
import com.capgemini.springcore.interfaces.Engine;

@Configuration
public class EngineConfig {

	@Bean(name = "isuzu")
	@Primary	
	public Engine getISuzu() {
		return new ISuzu();
	}

	@Bean(name = "volkswagen")
	public Engine getVolkswagen() {
		return new Volkswagen();
	}

}// end of the class
