package com.capgemini.Sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TypeString {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("AMMA");
		hs.add("APPA");
		hs.add("RAJKUMAR");
		hs.add("RAANI");

		System.out.println("*******ITERATOR*********");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("*******FOR-EACH**********");
		for(String s1 : hs) {
			System.out.println(s1);
		}
	}

}
