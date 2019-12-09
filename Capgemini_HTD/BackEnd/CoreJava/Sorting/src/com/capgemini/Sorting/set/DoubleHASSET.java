package com.capgemini.Sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DoubleHASSET {

	public static void main(String[] args) {
		LinkedHashSet<Double> hs = new LinkedHashSet<Double>();
		hs.add(2.01);
		hs.add(52.5);
		hs.add(87.25);
		hs.add(54.26);

		System.out.println("*******ITERATOR*********");
		Iterator<Double> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("*******FOR-EACH*********");
		for(Object h: hs) {
			System.out.println(h);
		}

	}

}
