package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestJ {

	public static void main(String[] args) {

		LinkedList bl = new LinkedList();
		bl.add(2.4);
		bl.add("Snehal");
		bl.add(64);
		bl.add('F');
		
		System.out.println("-------for loop---------");
		for(int i = 0 ; i<4 ;i++)
		{
			Object o = bl.get(i);
			System.out.println(o);
		}
		
		System.out.println("----------for each loop-------");
		for (Object o :bl)
		{
			System.out.println(o);
		}
		
		System.out.println("--------ListIterator----------");
		ListIterator m =bl.listIterator();
		System.out.println("upward----------------->");
		while(m.hasNext())
		{
			Object o =m.next();
			System.out.println(o);
		}
		System.out.println("<-----------------Backward");// futher code will retrive the elements by pointing the previous index
		while(m.hasPrevious())
		{
			Object o =m.previous();
			System.out.println(o);
		}
		
		System.out.println("---------Iterator-----------");
		Iterator it = bl.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
			
		}
	}

}
