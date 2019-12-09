package com.capgemini.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.capgemini.springcore.annotations.bean.EmployeeBean;

@Import (DepartmentConfig.class)

@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(101);
		employeeBean.setEmpName("Pournima");

		return employeeBean;
	}// end of the getEmployeeBean()
}// end of the class
