package com.capgemini.arraylist.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper {

	
		
		
		void display(ArrayList<Student> k)
		{
			for(Student s :k)
			{
				System.out.println("Id : "+s.id);
				System.out.println("name : "+s.name);
				System.out.println("percent : "+s.percent);
				System.out.println("----------------------");
			}
		}
		
		
		void onlyPass(ArrayList<Student> k)
		{
			Iterator<Student> it = k.iterator();
			 while(it.hasNext())
			 {
				 Student s=it.next();
				 if(s.percent>35)
				 {
					 System.out.println("Id : "+s.id);
					 System.out.println("name : "+s.name);
					 System.out.println("percent : "+s.percent);
					 System.out.println("----------------------");
				 }
			 }
		}
	
		void distinction(ArrayList<Student> k)
		{
			Iterator<Student> it = k.iterator();
			 while(it.hasNext())
			 {
				 Student s=it.next();
				 if(s.percent>=75)
				 {
					 System.out.println("Id : "+s.id);
					 System.out.println("name : "+s.name);
					 System.out.println("percent : "+s.percent);
					 System.out.println("----------------------");
				 }
			 }
		}
}
