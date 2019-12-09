package com.capgemini.sorting;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestE {

	public static void main(String[] args) {

		LinkedHashSet<Double> hs = new LinkedHashSet<Double>();
		hs.add(6.7);
		hs.add(4.7);
		hs.add(3.4);
		hs.add(9.5);
		hs.add(null);
		
		System.out.println("-------for each----------");
		for(Double s : hs)
		{
			System.out.println(s);
		}
		
		System.out.println("-------Iterator----------");
		Iterator<Double> it = hs.iterator();
		while(it.hasNext())
		{
			Double s=it.next();
			System.out.println(s);
		}
	}

}
