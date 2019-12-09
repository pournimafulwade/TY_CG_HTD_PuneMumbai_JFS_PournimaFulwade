package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestL {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(45);
		v.add("Ankusha");
		v.add('C');
		v.add(2.3);
		
		System.out.println("-------for loop---------");
		for(int i = 0 ; i<4 ;i++)
		{
			Object o = v.get(i);
			System.out.println(o);
		}
		
		System.out.println("----------for each loop-------");
		for (Object o :v)
		{
			System.out.println(o);
		}
		
		System.out.println("--------ListIterator----------");
		ListIterator m =v.listIterator();
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
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
			
		}
	}

}
