package com.capgemini.sorting;

import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(23);
		ts.add(78);
		ts.add(34);
		ts.add(12);
		//ts.add(null);//treeset can not accept null value
		System.out.println("-------for each----------");
		for(Object s : ts)
		{
			System.out.println(s);
		}
	}

}
