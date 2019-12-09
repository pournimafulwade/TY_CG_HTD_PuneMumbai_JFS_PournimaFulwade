package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.capgemini.springcore.annotations.bean.EmployeeBean;
import com.capgemini.springcore.annotations.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);

		System.out.println("--------Employee Details---------");
		System.out.println("EmpId = "     + employeeBean.getEmpId());
		System.out.println("EmpName = "   + employeeBean.getEmpName());
		System.out.println("--------Department Details---------");
		System.out.println("Dept Id="     + employeeBean.getDepartmentBean().getDeptId());
		System.out.println("Dept Name = " + employeeBean.getDepartmentBean().getDeptName());

		((AbstractApplicationContext) context).close();
		
	}// end of the main()
}// end of class
