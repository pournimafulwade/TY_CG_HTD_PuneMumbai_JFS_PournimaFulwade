package com.capgemini.set.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyStudentApp {
	private ArrayList<Student> al = new ArrayList<Student>();
	Scanner scan =new Scanner(System.in);
	
	void add()
	{
		System.out.println("Enter the id: ");
		int id= scan.nextInt();
		
		System.out.println("Enter the name: ");
		String name =scan.next();
		
		System.out.println("Enter the percentage :");
		Double percent =scan.nextDouble();
		
		Student s=new Student(id ,name,percent);
		al.add(s);
	}
	
	void display()
	{
		Iterator<Student> it=al.iterator();
		while(it.hasNext())
		{
			Student s=it.next();
			System.out.println("Id : "+s.id);
			System.out.println("name : "+s.name);
			System.out.println("percent : "+s.percent);
			System.out.println("---------------------------");
		}
	}

}
