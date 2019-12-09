package com.capgemini.Sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class GenericEmp {

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		
		Employee e1 = new Employee(1,"MAYURI",2500.000);
		Employee e2 = new Employee(2,"MAYURI",25000.00);
		Employee e3 = new Employee(3,"MAYURI",2500.0);
		Employee e4 = new Employee(4,"MAYURI",250.00);
		Employee e5 = new Employee(3,"MAYURI",2500.0);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("*******ITERATOR*********");
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println(s.empid);
			System.out.println(s.name);
			System.out.println(s.salary);
			

	}

}
}
