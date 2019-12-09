package com.capgemini.maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestStudent {

	public static void main(String[] args) {

		LinkedHashMap<String ,ArrayList<Student>> lhm=new LinkedHashMap<String , ArrayList<Student>>();

		Student s1=new Student(1, "Ambika", 76.5);
		Student s2=new Student(2, "Snehal", 87.5);
		Student s3=new Student(3, "Anjali", 45.8);
		Student s4=new Student(4, "Sneha", 34.8);
		Student s5=new Student(5, "Mayuri", 67.3);
		Student s6=new Student(6, "Prachi", 67.2);
		Student s7=new Student(7, "Aishwarya", 89.7);
		Student s8=new Student(8, "pornima", 78.0);
		Student s9=new Student(9, "Shweta", 76.5);
		
		ArrayList<Student> a1 =new ArrayList<Student>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		ArrayList<Student> a2 =new ArrayList<Student>();
		a2.add(s4);
		a2.add(s5);
		
		ArrayList<Student> a3 =new ArrayList<Student>();
		a3.add(s6);
		a3.add(s7);
		a3.add(s8);
		a3.add(s9);
		
		lhm.put("first", a1);
		lhm.put("Second", a2);
		lhm.put("Third", a3);
		
		ArrayList<Student> al1 =lhm.get("Second");
		Iterator<Student> it = al1.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println("Name : "+s.name);
			System.out.println("ID : "+s.id);
			System.out.println("Percent : "+s.percent);
			System.out.println("------------------------------");
		}
		
		
		
	}

}
