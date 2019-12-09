package com.capgemini.ArrayList.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper {
	void Display(ArrayList<Student> k) {
		for (Student s : k) {
			System.out.println("ID iS :" +s.id);
			System.out.println("Name iS :" +s.name);
			System.out.println("Percentage iS :" +s.percentage);
			System.out.println("*****************************");
		}
	}
		
		void display1(ArrayList<Student> z) {
			Iterator<Student> i = z.iterator();
				while(i.hasNext()) {
					Student n = i.next();
					if(n.percentage >=35) {
					System.out.println(n.id);
					System.out.println(n.name);
					System.out.println(n.percentage);
					System.out.println("**************************");
				}
				}
				
		}
		
		void average(ArrayList<Student> d) {
			Iterator<Student> g = d.iterator();
			while(g.hasNext()) {
				Student h1 = g.next();
				if(h1.percentage > 75.02) {
					System.out.println(h1.id);
					System.out.println(h1.name);
					System.out.println(h1.percentage);
					System.out.println("**************************");
					
				}
			}
		}
}
 