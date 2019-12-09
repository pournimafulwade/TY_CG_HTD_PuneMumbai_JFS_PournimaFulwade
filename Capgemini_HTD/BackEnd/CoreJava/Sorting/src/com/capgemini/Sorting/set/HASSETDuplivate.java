package com.capgemini.Sorting.set;

import java.util.HashSet;

public class HASSETDuplivate {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(15);
		hs.add('A');
		hs.add(2.4);
		hs.add("NAME");
		hs.add(15);
		hs.add('A');
		hs.add(null);
		
		
		
		System.out.println("*******FOR-EACH*********");
		for(Object h: hs) {
			System.out.println(h);
		}
		
	}

}
