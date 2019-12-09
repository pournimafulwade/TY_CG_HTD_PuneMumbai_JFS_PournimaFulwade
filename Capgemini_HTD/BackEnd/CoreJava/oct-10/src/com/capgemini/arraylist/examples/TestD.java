package com.capgemini.arraylist.examples;

import java.util.ArrayList;
import java.util.Collections;

public class TestD {
	public static void main(String[] args) {
ArrayList al = new ArrayList();
		
		al.add('r');
		al.add('E');
		al.add('d');
		al.add('f');
		
		System.out.println("Before-------"+al);
		
		Collections.sort(al);
		System.out.println("After---------"+al);
	}

}
