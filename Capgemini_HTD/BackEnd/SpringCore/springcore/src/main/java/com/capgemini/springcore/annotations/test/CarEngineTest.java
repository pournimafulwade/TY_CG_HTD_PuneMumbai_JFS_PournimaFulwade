package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotations.bean.Car;

public class CarEngineTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("carConfig.xml");
		Car myCar= context.getBean("myCar",Car.class);
		
		System.out.println("Model Name = " + myCar.getModelName());
		System.out.println("Model Id = "   + myCar.getModelNo());
		System.out.println("------Engine Details------");
		System.out.println("CC = "         + myCar.getEngine().getCC());
		System.out.println("Type = "       + myCar.getEngine().getType());
		
		((AbstractApplicationContext)context).close();

	}//end of the main()
}//end of the class
