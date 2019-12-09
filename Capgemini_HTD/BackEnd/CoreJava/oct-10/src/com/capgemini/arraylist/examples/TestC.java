package com.capgemini.arraylist.examples;

import java.util.ArrayList;
import java.util.Collections;

public class TestC {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add("raju");
		al.add('E');
		al.add(2);
		al.add(6.4);
		
		System.out.println("Before-------"+al);
		
		//Collections.sort(al);
		Collections.shuffle(al);
		System.out.println("After---------"+al);

		
	}

}
