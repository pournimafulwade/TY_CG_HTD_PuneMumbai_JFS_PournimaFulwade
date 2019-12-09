package com.capgemini.bean;

public class DataBase {
	void receive(Student t) {
		System.out.println("I am Database");
		System.out.println("name is" +t.getName());
		System.out.println("id is " +t.getId());
		System.out.println("height is " +t.getHeight());
		
	}
	
	void receive(Employee e) {
		System.out.println("I am Employee DataBAse");
		System.out.println("id "+e.getId());
		System.out.println("name "+e.getName());
		System.out.println("Salary"+e.getSalary());
		System.out.println("Role" +e.getRole());
		System.out.println("Department"+e.getDepartment());
		
	}


}
