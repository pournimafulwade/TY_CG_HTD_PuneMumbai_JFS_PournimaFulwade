package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeDeptTest {

	public static void main(String[] args) {

//		ApplicationContext context= new ClassPathXmlApplicationContext("employeeConfig.xml");9+
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig2.xml");
		EmployeeBean employeeBean = context.getBean("employee", EmployeeBean.class);

		System.out.println("Employee ID   =" + employeeBean.getEmpId());
		System.out.println("Employee name =" + employeeBean.getEmpName());
		System.out.println("dept id       =" + employeeBean.getDeptBean().getDeptId());
		System.out.println("Dept name     =" + employeeBean.getDeptBean().getDeptName());

	}// end of the main()
}// end of the class
