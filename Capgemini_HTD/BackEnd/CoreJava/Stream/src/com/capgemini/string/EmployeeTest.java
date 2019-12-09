package com.capgemini.string;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {

		Comparator<Employee> comp =(e1,e2)->{
			if(e1.height>e2.height)
			{
				return 1;
			}
			else if(e1.height<e2.height)
			{
				return -1;
			}
			else 
				return 0;
		};
		

		TreeSet<Employee> ts = new TreeSet<Employee>(comp);
		
		Employee e1 = new Employee(1, "Snehal", 7.2);
		Employee e2 = new Employee(2, "Anjali", 5.6);
		Employee e3 = new Employee(3, "Prachi", 7.4);
		Employee e4 = new Employee(4, "Mayuri", 6.4);
		Employee e5 = new Employee(5, "Aish", 5.7);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		Iterator<Employee> it =ts.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println("Id : "+e.id);
			System.out.println("Name : "+e.name);
			System.out.println("Height : "+e.height);
			System.out.println("----------------------");
		}
	}

}
