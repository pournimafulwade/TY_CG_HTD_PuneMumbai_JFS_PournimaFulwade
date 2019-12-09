package com.capgemini.Sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class NewTree {

	public static void main(String[] args) {
		TreeSet<Employee> tr = new TreeSet<Employee>();
		
		Employee e1 = new Employee(1,"MAYURI",2500.000);
		Employee e2 = new Employee(2,"MAYURI",25000.00);
		Employee e3 = new Employee(3,"MAYURI",2500.0);
		Employee e4 = new Employee(4,"MAYURI",250.00);
		Employee e5 = new Employee(3,"MAYURI",2500.0);
		
		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		tr.add(e4);
		tr.add(e5);
		
		System.out.println("*******ITERATOR*********");
		Iterator<Employee> it = tr.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println(s.empid);
			System.out.println(s.name);
			System.out.println(s.salary);
			

	}

}
}
