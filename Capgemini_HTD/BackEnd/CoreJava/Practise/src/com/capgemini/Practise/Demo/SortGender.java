package com.capgemini.Practise.Demo;

import java.util.ArrayList;
public class SortGender {

	public static void main(String[] args) {

		Student s1 = new Student(1,"Mayuri",76.5,'F');
		Student s2 = new Student(2,"Ankita",35.6,'F');
		Student s3 = new Student(3,"Shweta",33.2,'F');
		Student s4 = new Student(4,"Tushar",98.2,'M');
		Student s5 = new Student(5,"Pankaj",25.2,'M');
		Student s6 = new Student(6,"Kavita",54.3,'F');
		Student s7 = new Student(7,"Saurabh",65.1,'M');
		Student s8 = new Student(8,"Sachin",34,'M');
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s8);
		al.add(s3);
		al.add(s2);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);

		
		Helper h = new Helper();
		h.displayPassedG(al,'M');
		System.out.println("***********************");
		h.displayTopper(al);
		
	}

}
