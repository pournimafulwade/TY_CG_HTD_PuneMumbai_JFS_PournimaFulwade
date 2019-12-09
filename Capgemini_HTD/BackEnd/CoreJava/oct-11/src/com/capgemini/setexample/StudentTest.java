package com.capgemini.setexample;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentTest {

	public static void main(String[] args) {

		ById bi = new ById();
		ByPercent bp = new ByPercent();
		TreeSet<Student> ts = new TreeSet<Student>(bp);
		Student s1 =new Student();
		s1.setGender('F');
		s1.setId(4);
		s1.setName("Snehal");
		s1.setPercent(80.74);
		ts.add(s1);
		
		Student s2 =new Student();
		s2.setGender('F');
		s2.setId(1);
		s2.setName("Anjali");
		s2.setPercent(70.74);
		ts.add(s2);
		
		Student s3 =new Student();
		s3.setGender('M');
		s3.setId(2);
		s3.setName("Amol");
		s3.setPercent(59.06);
		ts.add(s3);
		
		Student s4 =new Student();
		s4.setGender('M');
		s4.setId(5);
		s4.setName("Alekh");
		s4.setPercent(65.98);
		ts.add(s4);
		
		Student s5 =new Student();
		s5.setGender('F');
		s5.setId(3);
		s5.setName("Prachi");
		s5.setPercent(79.74);
		ts.add(s5);
		
		Iterator<Student> it = ts.iterator();
		while(it.hasNext())
		{
			Student s =it.next();
			System.out.println("Id : "+s.getId());
			System.out.println("name : "+s.getName());
			System.out.println("percent : "+s.getPercent());
			System.out.println("Gender : "+s.getGender());
			System.out.println("---------------------------");
		}
		
		
	}

}
