package com.capgemini.Stream.Maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Mayuri",76.5);
		Student s2 = new Student(2,"Ankita",84.3);
		Student s3 = new Student(3,"Shweta",85.3);
		Student s4 = new Student(4,"Tushar",98.2);
		Student s5 = new Student(5,"Pankaj",75.2);
		Student s6 = new Student(6,"Kavita",54.3);
		Student s7 = new Student(7,"Saurabh",65.1);
		Student s8 = new Student(8,"Sneha",75.3);
		Student s9 = new Student(9,"Namrata",84.5);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		al1.add(s5);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s6);
		al2.add(s7);
		
		ArrayList<Student> al3 = new ArrayList<Student>();
		al3.add(s8);
		al3.add(s9);
		
		LinkedHashMap<String,ArrayList<Student>> hm = new LinkedHashMap<String,ArrayList<Student>>();
		hm.put("First",al1);
		hm.put("Second",al2);
		hm.put("Third",al3);
		
		ArrayList<Student> al = hm.get("Third");
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is:"+s.name);
			System.out.println("ID is:"+s.id);
			System.out.println("Percentage is:"+s.percentage);
			System.out.println("***************************");
		}
		
		
		

	}

}
