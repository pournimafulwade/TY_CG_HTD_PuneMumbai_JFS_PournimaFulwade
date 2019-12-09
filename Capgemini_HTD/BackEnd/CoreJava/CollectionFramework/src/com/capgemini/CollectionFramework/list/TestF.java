package com.capgemini.CollectionFramework.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestF {

	public static void main(String[] args) {
		LinkedList <String> a= new LinkedList<String>();
		a.add("Smita");
		a.add("Mayuri");
		a.add("Shinde");
		
		ListIterator<String> al = a.listIterator();
		while(al.hasNext()) {
			System.out.println(al.next());
		}
		
		for(String z:a) {
			System.out.println(z);
		}
		
		for(int i=0;i<3;i++) {
			String x = a.get(i);
			System.out.println(x);
		}

	}

}
