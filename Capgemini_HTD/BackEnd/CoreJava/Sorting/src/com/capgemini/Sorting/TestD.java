package com.capgemini.sorting;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Snehal");
		lhs.add(47);
		lhs.add('G');
		lhs.add(9.5);
		
		System.out.println("-------for each----------");
		for(Object s : lhs)
		{
			System.out.println(s);
		}
		
		System.out.println("-------Iterator----------");
		Iterator it = lhs.iterator();
		while(it.hasNext())
		{
			Object s=it.next();
			System.out.println(s);
		}
	}

}
