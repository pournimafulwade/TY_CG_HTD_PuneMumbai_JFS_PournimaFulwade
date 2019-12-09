package com.capgemini.CollectionFramework.list;

import java.util.Iterator;
import java.util.LinkedList;

public class ListIterator {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add("Smita");
		a.add('f');
		a.add(2.02);
		
		System.out.println("********For Loop **********");
		for(int i =0;i<3;i++) {
			Object r = a.get(i);
			System.out.println(r);
		}
		
		System.out.println("*******For Each Loop**********");
		for(Object m : a) {
			System.out.println(m);
		}
		
		System.out.println("***********Iterator**********");
		Iterator li = a.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("********List Iterator*******");
		System.out.println("Backward");
		 java.util.ListIterator b = a.listIterator();
		 while(b.hasPrevious()) {
			 System.out.println(b.previous());
		 }
		

	}

	private boolean hasprevious() {
		// TODO Auto-generated method stub
		return false;
	}

}
