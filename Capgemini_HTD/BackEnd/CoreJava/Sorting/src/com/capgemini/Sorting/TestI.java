package com.capgemini.sorting;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Snehal");
		ts.add("Abhijit");
		ts.add("Amol");
		
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}

	}

}
