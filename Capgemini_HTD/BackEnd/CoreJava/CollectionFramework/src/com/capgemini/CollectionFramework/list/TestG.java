package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestG {

	public static void main(String[] args) {
		ArrayList<Double> bl = new ArrayList<Double>();
		bl.add(2.4);
		bl.add(8.3);
		bl.add(6.7);
		bl.add(2.7);
		
		for(int i = 0 ;i<4 ; i++)
		{
			Double d = bl.get(i);
			System.out.println(d);
		}
		
		/*for(Double a :bl)
		{
			System.out.println(a);
		}*/
	}

}
