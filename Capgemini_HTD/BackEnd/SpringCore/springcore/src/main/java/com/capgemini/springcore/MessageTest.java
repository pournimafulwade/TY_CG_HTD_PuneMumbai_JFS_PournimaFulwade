package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean;

public class MessageTest {
	public static void main(String args[]) {
	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");//get the data
	((AbstractApplicationContext)context).registerShutdownHook();//close the container
	
	MessageBean messageBean= (MessageBean) context.getBean("messageBean");//display the message
	System.out.println(messageBean.getMessage());//close the container explicitly
	
//	((AbstractApplicationContext)context).close();
		
	}//end of the main()
}//end of the class

