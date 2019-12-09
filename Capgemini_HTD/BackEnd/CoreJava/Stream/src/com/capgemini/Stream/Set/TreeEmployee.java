package com.capgemini.Stream.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeEmployee {

	public static void main(String[] args) {
		
		Comparator<Employee> c = (e1,e2) -> {
			if(e1.height > e2.height) {
				return 1;
			} else if(e1.height < e2.height) {
				return -1;
			} else { 
				return 0;
		}
		};
		
		TreeSet <Employee> tr = new TreeSet(c);
		
		Employee e1 = new Employee(1,"Raju",4.2);
		Employee e2 = new Employee(2,"Ramu",4.5);
		Employee e3 = new Employee(3,"Seeta",5.3);
		Employee e4 = new Employee(4,"Geeta",3.5);
		
		tr.add(e1);
		tr.add(e2);
		tr.add(e3);
		tr.add(e4);
		
		Iterator<Employee> e = tr.iterator();
			while(e.hasNext()) {
				Employee r = e.next();
				System.out.println("Id is:" +r.id);
				System.out.println("Name is :" +r.name);
				System.out.println("Height is :" +r.height);
				System.out.println("************************");
				
			}
		}

}
