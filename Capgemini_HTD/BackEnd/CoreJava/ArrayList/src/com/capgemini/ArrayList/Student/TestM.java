package com.capgemini.ArrayList.Student;

import java.util.ArrayList;

public class TestM {

	public static void main(String[] args) {
		ArrayList <Student> a = new ArrayList<Student>();
		

		Student s1 = new Student(1,"Mayuri",75.01);
		Student s2 = new Student(2,"Wagh",75.02);
		Student s3 = new Student(3,"Tarte",75.03);
		Student s4 = new Student(4,"Paranjali",75.04);
		Student s5 = new Student(5,"Chetna",75.05);

		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		
		Helper h = new Helper();
		h.Display(a);
		System.out.println("******************");
		
		h.display1(a);
		System.out.println("******************");
		
		h.average(a);
		System.out.println("******************");
		
	}

}
