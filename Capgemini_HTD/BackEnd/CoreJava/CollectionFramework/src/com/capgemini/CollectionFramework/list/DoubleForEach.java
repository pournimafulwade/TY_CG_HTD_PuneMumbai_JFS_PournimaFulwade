package com.capgemini.CollectionFramework.list;

import java.util.ArrayList;

public class DoubleForEach {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(5.6);
		a.add(19.2);
		a.add(2.02);
		a.add(6.14);
		
		for(Double m:a) {
			System.out.println(m);
		}

	}

}
