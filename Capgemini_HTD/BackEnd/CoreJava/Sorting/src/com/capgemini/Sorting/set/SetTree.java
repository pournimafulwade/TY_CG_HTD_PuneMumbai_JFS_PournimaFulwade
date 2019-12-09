package com.capgemini.Sorting.set;

import java.util.TreeSet;

public class SetTree {

	public static void main(String[] args) {
		TreeSet tr = new TreeSet();
		tr.add(15);
		tr.add(20);
		tr.add(50);
		tr.add(70);
		tr.add(null);
		
		System.out.println("*******FOR-EACH*********");
		for(Object h: tr) {
			System.out.println(h);
		}
		

	}

}
