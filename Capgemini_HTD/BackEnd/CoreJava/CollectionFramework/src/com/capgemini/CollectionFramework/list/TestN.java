package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestN {

	public static void main(String[] args) {

		ArrayList<Student> a1 = new ArrayList<Student>();
		
		Student s1 =new Student(1,"Snehal",87.9);
		Student s2 =new Student(2,"Prachi",98.9);
		Student s3 =new Student(3,"Anjali",76.8);
		Student s4 = new Student(4,"Mayuri",67.9);
		Student s5 =new Student(5,"Aishwarya",90.6);
		
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		
		for (int i =0 ; i<5 ;i++)
		{
			Student s =a1.get(i);
			System.out.println("Id : "+s.id);
			System.out.println("Name : "+s.name);
			System.out.println("Percent : "+s.percent);
			System.out.println("----------------------------");
			
		}
		
		
	}

}
