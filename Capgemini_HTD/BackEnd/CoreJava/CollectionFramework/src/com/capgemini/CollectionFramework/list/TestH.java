package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestH {

	public static void main(String[] args) {

		ArrayList<Double> bl = new ArrayList<Double>();
		bl.add(2.4);
		bl.add(8.3);
		bl.add(6.7);
		bl.add(2.7);
		
		Iterator<Double> i =bl.iterator();
		while(i.hasNext())
		{
			Double d =i.next();
			System.out.println(d);
		}
	}

}
