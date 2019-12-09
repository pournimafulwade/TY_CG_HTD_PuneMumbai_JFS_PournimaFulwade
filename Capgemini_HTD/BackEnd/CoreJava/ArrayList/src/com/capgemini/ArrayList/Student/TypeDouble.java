package com.capgemini.ArrayList.Student;

import java.util.ArrayList;
import java.util.Collections;

public class TypeDouble {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		
		al.add(3.6);
		al.add(2.4);
		al.add(4.7);
		al.add(1.6);
		
		ArrayList<Double> bl = new ArrayList<Double>();
		
		al.add(29.4);
		al.add(16.2);
		
		System.out.println("********ADD*********");
		System.out.println("Before----->"+al);
		al.add(15.6);
		System.out.println("After----->"+al);
		
		System.out.println("******Sort*******");
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("*******");

	}

}

