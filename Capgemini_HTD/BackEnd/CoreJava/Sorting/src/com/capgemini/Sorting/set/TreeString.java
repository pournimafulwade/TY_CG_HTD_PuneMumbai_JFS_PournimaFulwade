package com.capgemini.Sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeString {
	public static void main(String[] args) {
		TreeSet<String> tr = new TreeSet<String>();
		tr.add("mayuri");
		tr.add("ramesh");
		tr.add("amar");
		tr.add("vidya");
		
		System.out.println("*******ITERATOR*********");
		Iterator<String> it = tr.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);

		
	}
}
}
	