package com.capgemini.CollectionFramework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class BackwardForward {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		 a.add("Mayuri");
		 a.add(505);
		 a.add('M');
		 a.add(85.83);
		 
		 ListIterator m = a.listIterator();
		 System.out.println("---------> Forward");
		 while(m.hasNext()) {
			//  Object r  = m.next();
			 System.out.println(m.next());
		 }
		 
		 System.out.println("<------------Backward");
		 while(m.hasPrevious()) {
			 Object d  = m.previous();
			 System.out.println(d);
		 }
	}

}
