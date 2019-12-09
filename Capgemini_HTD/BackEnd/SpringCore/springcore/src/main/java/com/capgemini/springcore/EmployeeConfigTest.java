package com.capgemini.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeConfigTest {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
		
		//employee-1
		EmployeeBean employeeBean1 = context.getBean("employee",EmployeeBean.class);
		System.out.println("Enter the Employee Id: ");
		int empId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee Name: ");
		String name= sc.nextLine();
		
		employeeBean1.setEmpId(empId);
		employeeBean1.setEmpName(name);
		
		System.out.println("Employee-1 ID:"+employeeBean1.getEmpId());
		System.out.println("Employee-1 Name :"+employeeBean1.getEmpName());
		
		
		//employee-2
		EmployeeBean employeeBean2 = context.getBean("employee",EmployeeBean.class);
		System.out.println("Enter the Employee Id: ");
		int empId2=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee Name: ");
		String name2= sc.nextLine();
		
		
		employeeBean2.setEmpId(empId2);
		employeeBean2.setEmpName(name2);
		
		System.out.println("Employee-1 ID:"+employeeBean1.getEmpId());
		System.out.println("Employee-1 Name :"+employeeBean1.getEmpName());
		System.out.println("Employee-2 ID:"+employeeBean2.getEmpId());
		System.out.println("Employee-2 Name :"+employeeBean2.getEmpName());
	}//end of the main()
}//end of the class
