package com.capgemini.CollectionFramework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		 a.add("Mayuri");
		 a.add(505);
		 a.add('M');
		 a.add(85.83);
		 
		 Iterator it = a.iterator();
		 while(it.hasNext()) { //check whether the next index is present or not and retuen result in boolean
			 Object r= it.next(); // go to next index and give value
			 System.out.println(r);
		 }
	}

}
