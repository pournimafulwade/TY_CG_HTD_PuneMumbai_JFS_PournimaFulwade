package com.capgemini.springcore.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("inside My Bean Factory Post Processor...");
		BeanDefinition beanDefination = beanFactory.getBeanDefinition("messageBean2");
		MutablePropertyValues propertyValues = beanDefination.getPropertyValues();
		
		System.out.println("Message Via xml = " + propertyValues.getPropertyValue("message").getValue()); //display the message from beans.xml file
		
		propertyValues.addPropertyValue("message", "Welcome to Spring-5");

	}// end of postProcessBeanFactory()
}// end of the class
