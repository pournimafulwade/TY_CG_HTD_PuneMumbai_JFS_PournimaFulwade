package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MobileBean;

public class MobileDisplayTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mobileDisplay.xml");
		MobileBean mobileBean= context.getBean("mobile",MobileBean.class);
		
		System.out.println("Brand name   = " + mobileBean.getBrandName());
		System.out.println("Model name   = " + mobileBean.getModelName());
		System.out.println("Price is     = " + mobileBean.getPrice());
		System.out.println("Display Size = " + mobileBean.getMobleDisplayBean().getDisplaySize());
		System.out.println("Resolution   = " + mobileBean.getMobleDisplayBean().getResolution());
	}//end of the main()
}//end of the class
