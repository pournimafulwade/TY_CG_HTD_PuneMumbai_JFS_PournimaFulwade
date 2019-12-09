package com.capgemini.Sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class ObjectLink {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(15);
		hs.add('A');
		hs.add(2.4);
		hs.add("NAME");
		
		System.out.println("*******FOR-EACH*********");
		for(Object h: hs) {
			System.out.println(h);
		}
 
		System.out.println("*******ITERATOR*********");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object m = it.next();
			System.out.println(m);
		}
		

	}

}
