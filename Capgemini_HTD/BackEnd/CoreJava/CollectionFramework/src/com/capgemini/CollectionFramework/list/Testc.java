package com.capgemini.CollectionFramework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Testc {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("priya");
		a.add(2);
		a.add('F');
		a.add(5.6);
		
		Iterator i = a.iterator();
		System.out.println("------------> Forward");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ListIterator m = a.listIterator();
		System.out.println("<-----------Backward");
		while(m.hasPrevious()) {
			System.out.println(m.previous());
		}

	}

}
