package com.capgemini.arraylist.examples;

import java.util.Collections;
import java.util.LinkedList;

public class TestB {

	public static void main(String[] args) {

		LinkedList<Double> li =new LinkedList<Double>();
		li.add(3.6);
		li.add(2.4);
		li.add(4.7);
		li.add(1.6);

		System.out.println("Before-------->"+li);
		
		Collections.sort(li);
		System.out.println("After-------->"+li);
		
	}

}
