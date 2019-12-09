package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestM {

	public static void main(String[] args) {

		Vector<Character> v = new Vector<Character>();
		v.add('s');
		v.add('A');
		v.add('C');
		v.add('g');
		
		System.out.println("-------for loop---------");
		for(int i = 0 ; i<4 ;i++)
		{
			Character o = v.get(i);
			System.out.println(o);
		}
		
		System.out.println("----------for each loop-------");
		for (Character o :v)
		{
			System.out.println(o);
		}
		
		System.out.println("--------ListIterator----------");
		ListIterator<Character> m =v.listIterator();
		System.out.println("upward----------------->");
		while(m.hasNext())
		{
			Character o =m.next();
			System.out.println(o);
		}
		System.out.println("<-----------------Backward");// futher code will retrive the elements by pointing the previous index
		while(m.hasPrevious())
		{
			Character o =m.previous();
			System.out.println(o);
		}
		
		System.out.println("---------Iterator-----------");
		Iterator<Character> it = v.iterator();
		while(it.hasNext())
		{
			Character obj = it.next();
			System.out.println(obj);
			
		}
	}

}
