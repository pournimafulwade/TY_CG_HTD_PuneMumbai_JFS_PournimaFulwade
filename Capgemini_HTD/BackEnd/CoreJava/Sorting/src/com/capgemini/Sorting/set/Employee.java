package com.capgemini.Sorting.set;

public class Employee implements Comparable<Employee> {
	
		int empid;
		String name;
		double salary;
		
		public Employee(int empid, String name, double salary) {
			this.empid=empid;
			this.name=name;
			this.salary=salary;
			
	}

		@Override
		public int compareTo(Employee e) {
			Integer i =e.empid;
			Integer k = this.empid;
			return i.compareTo(k);
		}
		
		
		

		
		
	}

