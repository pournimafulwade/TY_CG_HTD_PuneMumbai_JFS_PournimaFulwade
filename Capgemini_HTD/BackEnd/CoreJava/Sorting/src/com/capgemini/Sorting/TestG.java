package com.capgemini.sorting;

import java.util.HashSet;

public class TestG {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add("Snehal");
		hs.add(47);
		hs.add('G');
		hs.add(9.5);
		hs.add("Snehal");
		hs.add(47);
		
		System.out.println("-------for each----------");
		for(Object s : hs)
		{
			System.out.println(s);
		}
	}

}
