package com.capgemini.sorting;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Snehal");
		hs.add(47);
		hs.add('G');
		hs.add(9.5);
		
		System.out.println("-------for each----------");
		for(Object s : hs)
		{
			System.out.println(s);
		}
		
		System.out.println("-------Iterator----------");
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			Object s=it.next();
			System.out.println(s);
		}
	}

}
