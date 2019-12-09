package com.capgemini.sorting;

import java.util.HashSet;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Snehal");
		hs.add("woruyrh");
		hs.add("abcd");
		hs.add("defg");
		
		System.out.println("-------for each----------");
		for(String s : hs)
		{
			System.out.println(s);
		}
		
		System.out.println("-------Iterator----------");
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}

	}

}
