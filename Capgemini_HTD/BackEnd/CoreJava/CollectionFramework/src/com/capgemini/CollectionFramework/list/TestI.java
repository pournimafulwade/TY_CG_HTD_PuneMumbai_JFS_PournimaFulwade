package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestI {

	public static void main(String[] args) {

		ArrayList<Double> bl = new ArrayList<Double>();
		bl.add(2.4);
		bl.add(8.3);
		bl.add(6.7);
		bl.add(2.7);
		
		
		ListIterator<Double> lt =bl.listIterator();
		while(lt.hasNext())
		{
			Double r = lt.next();
			System.out.println(r);
		}
		
		while(lt.hasPrevious())
		{
			Double r = lt.previous();
			System.out.println(r);
		}
	}

}
