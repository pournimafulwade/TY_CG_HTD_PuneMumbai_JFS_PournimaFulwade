package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(24);
		al.add("Final");
		al.add(6.7);
		al.add('S');
		
		/*for(int i=0 ; i<4 ; i++)
		{
			Object r = al.get(i);
			System.out.println(r);
		}
		*/
		for(Object r :al)
		{
			System.out.println(r);
		}
		
	}

}
