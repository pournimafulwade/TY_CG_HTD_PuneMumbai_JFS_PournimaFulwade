package com.capgemini.CollectionFramework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestE {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(5.6);
		a.add(19.2);
		a.add(2.02);
		a.add(6.14);
		
		/*
		 * Iterator<Double> al = a.iterator(); 
		 * while(al.hasNext()) {
		 *  Double m= al.next(); 
		 *  System.out.println(m); }
		 */
		
		ListIterator<Double> al = a.listIterator();
		while(al.hasNext()) {
			Double z = al.next();
			System.out.println(z);
		}

	}

}
