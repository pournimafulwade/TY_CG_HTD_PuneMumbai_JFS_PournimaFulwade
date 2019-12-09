package com.capgemini.CollectionFramework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestB {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		 a.add("Mayuri");
		 a.add(505);
		 a.add('M');
		 a.add(85.83);

		/*
		 * ListIterator l = a.listIterator();
		 *  while(l.hasNext()) {
		 * System.out.println(l.next()); }
		 */
		 
		/*
		 * Iterator i = a.iterator(); while(i.hasNext()) { System.out.println(i.next());
		 * }
		 */
		 System.out.println(a); //only used for developers understanding  
	}

}
