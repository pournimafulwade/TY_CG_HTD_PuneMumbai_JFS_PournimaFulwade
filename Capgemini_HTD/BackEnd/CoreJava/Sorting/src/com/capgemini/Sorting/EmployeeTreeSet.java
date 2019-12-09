package com.capgemini.sorting;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {

		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		Employee e1 = new Employee(1, "Snehal", 657.2);
		Employee e2 = new Employee(2, "Anjali", 3455.6);
		Employee e3 = new Employee(3, "Prachi", 6457.4);
		Employee e4 = new Employee(4, "Mayuri", 647.2);
		Employee e5 = new Employee(5, "Aish", 657.2);
		Employee e6 = new Employee(1, "Snehal", 657.2);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		
		Iterator<Employee> it =ts.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println("Id : "+e.id);
			System.out.println("name : "+e.name);
			System.out.println("percent : "+e.salary);
			System.out.println("----------------------");
		}
	}

}
