package com.capgemini.CollectionFramework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class HomeWork {

	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		
		Student s1 = new Student(1,"Mayuri",75);
		Student s2 = new Student(2,"Wagh",75);
		Student s3 = new Student(3,"Tarte",75);
		Student s4 = new Student(4,"Paranjali",75);
		Student s5 = new Student(5,"Chetna",75);

		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		
		System.out.println("*******For Loop*************");
		for(int i=0;i<5;i++) {
			Student s = a.get(i);
			System.out.println("id :"+s.id+" name :"+s.name+" percentage :"+s.percentage);
			System.out.println("*******************************");
		}
		
		System.out.println("*********For-Each Loop***********");
		for(Student x: a) {
			System.out.println("id :"+x.id+" name :"+x.name+" percentage :"+x.percentage);
			System.out.println("*******************************");
		}
		
		System.out.println("*******Iterator**********");
		Iterator<Student> z = a.iterator();
		while(z.hasNext()) {
			Student z1 = z.next();
			System.out.println("id :"+z1.id+" name :"+z1.name+" percentage :"+z1.percentage);
			System.out.println("*******************************");
		}
		
		System.out.println("*********List Iterators***********");
		ListIterator<Student> m = a.listIterator();
		
		
	}

}
