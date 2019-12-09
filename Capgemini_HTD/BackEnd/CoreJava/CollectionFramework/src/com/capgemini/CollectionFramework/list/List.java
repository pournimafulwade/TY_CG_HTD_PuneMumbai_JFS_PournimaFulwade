package com.capgemini.CollectionFramework.list;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(24);
		a.add("Smita");
		a.add(5.50);
		a.add('a');
		
		/*
		 * for(int i=0;i<4;i++) { Object m = a.get(i); System.out.println("index " +i+
		 * "="+m); }
		 */
		for(Object m : a) {
			System.out.println(m);
		}

	}

}
