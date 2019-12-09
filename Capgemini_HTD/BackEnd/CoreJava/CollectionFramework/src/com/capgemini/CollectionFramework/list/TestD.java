package com.capgemini.CollectionFramework.list;

import java.util.ArrayList;

public class TestD {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Raju");
		a.add(19);
		a.add('M');
		a.add(6.14);
		
		for(Object m : a) {
			System.out.println(m);
		}

	}

}
