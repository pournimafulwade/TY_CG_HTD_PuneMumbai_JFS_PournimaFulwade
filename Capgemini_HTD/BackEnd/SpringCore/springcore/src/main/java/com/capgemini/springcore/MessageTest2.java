package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean2;

public class MessageTest2 {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	
	MessageBean2 messageBean2=context.getBean("messageBean2",MessageBean2.class);
	System.out.println("Message=" +messageBean2.getMessage());   
	
	((AbstractApplicationContext)context).close();//explicitly closing 
	
	}//end of the main()
}//end of the class
