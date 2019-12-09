package com.capgemini.setexample;

import java.util.Comparator;

public class ByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		String a = o1.getName();
		String b =o2.getName();
		return a.compareTo(b);

	}
	
	

}
