package com.capgemini.CollectionFramework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Character> v = new Vector<Character>();
		v.add('a');
		v.add('m');
		v.add('s');
		
		for(int i=0;i<3;i++) {
			Character c = v.get(i);
			System.out.println(c);
		}
		
		System.out.println("*******For Each******");
		for(Character x:v) {
			System.out.println(x);
		}
		
		System.out.println("************");
		Iterator m = v.iterator();
		while(m.hasNext()) {
			System.out.println(m.next());
		}
		
		ListIterator n = v.listIterator();
		 System.out.println("---------> Forward");
		 while(n.hasNext()) {
			//  Object r  = n.next();
			 System.out.println(n.next());
		 }
		 
		 ListIterator b = v.listIterator();
		 while(b.hasNext()) {
			 System.out.println(b.next());
		 }
	}

}
