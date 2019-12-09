package com.capgemini.Practise.Demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	void displayAll(ArrayList<Student> al)
	{
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is :"+s.name);
			System.out.println("Id is :"+s.id);
			System.out.println("Percentage is :"+s.percentage);
			System.out.println("Gender is :"+s.gender);
		}
	}

	void displayPassed(ArrayList<Student> al){
		List<Student> li = al.stream().filter(i -> i.percentage > 35).collect(Collectors.toList());

		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is :"+s.name);
			System.out.println("Id is :"+s.id);
			System.out.println("Percentage is :"+s.percentage);
			System.out.println("Gender is :"+s.gender);
		}
	}

	void displayFailed(ArrayList<Student> al){
		List<Student> li = al.stream().filter(i -> i.percentage < 35).collect(Collectors.toList());

		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is :"+s.name);
			System.out.println("Id is :"+s.id);
			System.out.println("Percentage is :"+s.percentage);
			System.out.println("Gender is :"+s.gender);
		}
	}

	void displayPassedG(ArrayList<Student> al,char g){
		List<Student> li = al.stream().filter(i -> (i.percentage > 35 && i.gender ==g)).collect(Collectors.toList());

		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is :"+s.name);
			System.out.println("Id is :"+s.id);
			System.out.println("Percentage is :"+s.percentage);
			System.out.println("Gender is :"+s.gender);
		}
	}

	/*
	 * void displayPassedM(ArrayList<Student> al,char g){ List<Student> li =
	 * al.stream().filter(i -> (i.percentage < 35 && i.gender
	 * =='M')).collect(Collectors.toList());
	 * 
	 * Iterator<Student> it = li.iterator(); while(it.hasNext()) { Student s =
	 * it.next(); System.out.println("Name is :"+s.name);
	 * System.out.println("Id is :"+s.id);
	 * System.out.println("Percentage is :"+s.percentage);
	 * System.out.println("Gender is :"+s.gender); } }
	 */

	void displayFailedG(ArrayList<Student> al ,char g){
		List<Student> li = al.stream().filter(i -> (i.percentage > 35  && i.gender==g)).collect(Collectors.toList());

		Iterator<Student> it = li.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is :"+s.name);
			System.out.println("Id is :"+s.id);
			System.out.println("Percentage is :"+s.percentage);
			System.out.println("Gender is :"+s.gender);
		}
	}

	/*
	 * void displayFailedF(ArrayList<Student> al){ List<Student> li =
	 * al.stream().filter(i -> (i.percentage > 35 && i.gender
	 * =='F')).collect(Collectors.toList());
	 * 
	 * Iterator<Student> it = li.iterator(); while(it.hasNext()) { Student s =
	 * it.next(); System.out.println("Name is :"+s.name);
	 * System.out.println("Id is :"+s.id);
	 * System.out.println("Percentage is :"+s.percentage);
	 * System.out.println("Gender is :"+s.gender); } }
	 */

	void displayTopper(ArrayList<Student> al)
	{
		Comparator<Student> comp = (s1,s2) -> {
			if(s1.percentage > s2.percentage) {
				return 1;
			} else if(s1.percentage < s2.percentage) {
				return -1;
			} else
				return 0;
		};


		Student s = al.stream().max(comp).get();
		System.out.println("Name is :"+s.name);
		System.out.println("Id is :"+s.id);
		System.out.println("Percentage is :"+s.percentage);
		System.out.println("Gender is :"+s.gender);
	}


}



