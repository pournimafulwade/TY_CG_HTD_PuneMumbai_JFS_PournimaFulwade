package com.capgemini.CollectionFramework.list;

import java.util.ArrayList;

public class TestArray {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
		al.add(24);
		al.add("chinu");
		al.add(2.9);
		al.add('f');
		
		for(int i = 0;i<4 ; i++) {
			Object r = al.get(i);
			System.out.println(i+ "=" +r);
		}
	}

}
