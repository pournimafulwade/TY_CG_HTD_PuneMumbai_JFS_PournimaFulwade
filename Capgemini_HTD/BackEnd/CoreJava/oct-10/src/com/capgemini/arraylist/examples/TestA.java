package com.capgemini.arraylist.examples;

import java.util.ArrayList;


public class TestA {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 =new Student(1,"Snehal",87.9);
		Student s2 =new Student(2,"Prachi",28.9);
		Student s3 =new Student(3,"Anjali",76.8);
		Student s4 = new Student(4,"Mayuri",67.9);
		Student s5 =new Student(5,"Aishwarya",34.6);
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Helper h = new Helper();
		h.onlyPass(al);
		System.out.println("Distinction students-------");
		h.distinction(al);
	}

}
