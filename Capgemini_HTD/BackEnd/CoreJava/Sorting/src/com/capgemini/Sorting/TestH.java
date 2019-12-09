package com.capgemini.sorting;

import java.util.HashSet;
import java.util.Iterator;

public class TestH {
	
		public static void main(String[]args)
		{
			HashSet<Employee> hs = new HashSet<Employee>();
			
			Employee e1 = new Employee(1, "Snehal", 657.2);
			Employee e2 = new Employee(2, "Anjali", 3455.6);
			Employee e3 = new Employee(3, "Prachi", 6457.4);
			Employee e4 = new Employee(4, "Mayuri", 647.2);
			Employee e5 = new Employee(5, "Aish", 657.2);
			Employee e6 = new Employee(1, "Snehal", 657.2);
			
			hs.add(e1);
			hs.add(e2);
			hs.add(e3);
			hs.add(e4);
			hs.add(e5);
			hs.add(e6);
			
			Iterator<Employee> it =hs.iterator();
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
