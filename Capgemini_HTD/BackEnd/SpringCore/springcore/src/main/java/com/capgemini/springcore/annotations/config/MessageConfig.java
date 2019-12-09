package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.annotations.bean.MessageBean;

@Configuration
public class MessageConfig {
	
	@Bean
	@Scope("prototype")
	public MessageBean getMessageBean() {
		MessageBean meassageBean = new MessageBean();
		meassageBean.setMessage("Hello World!!!");
		return meassageBean;
	}//end of the MessageConfig()
}//end of the class
