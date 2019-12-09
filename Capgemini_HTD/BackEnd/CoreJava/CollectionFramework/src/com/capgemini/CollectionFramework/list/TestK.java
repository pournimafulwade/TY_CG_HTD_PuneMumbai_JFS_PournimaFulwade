package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestK {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<String>();
		li.add("Snehal");
		li.add("Anjali");
		li.add("Sneha");
		li.add("Mayuri");
		
		System.out.println("-------for loop---------");
		for(int i = 0 ; i<4 ;i++)
		{
			String o = li.get(i);
			System.out.println(o);
		}
		
		System.out.println("----------for each loop-------");
		for (String o :li)
		{
			System.out.println(o);
		}
		
		System.out.println("--------ListIterator----------");
		ListIterator<String>  m =li.listIterator();
		System.out.println("upward----------------->");
		while(m.hasNext())
		{
			String o =m.next();
			System.out.println(o);
		}
		System.out.println("<-----------------Backward");// futher code will retrive the elements by pointing the previous index
		while(m.hasPrevious())
		{
			String o =m.previous();
			System.out.println(o);
		}
		
		System.out.println("---------Iterator-----------");
		Iterator<String> it = li.iterator();
		while(it.hasNext())
		{
			String obj = it.next();
			System.out.println(obj);
			
		}
	}

}
