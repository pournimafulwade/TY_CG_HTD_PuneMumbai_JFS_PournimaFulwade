package com.capgemini.CollectionFramework.list;

import java.util.ArrayList;

public class OnlyDouble {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(5.6);
		a.add(19.2);
		a.add(2.02);
		a.add(6.14);
		
		/*
		 * for(Object m : a) { System.out.println(m); }
		 */
	//	System.out.println(a);
		
		for(int i=0;i<4;i++) {
			Double r = a.get(i);
			System.out.println(r);
		}
	}

}
