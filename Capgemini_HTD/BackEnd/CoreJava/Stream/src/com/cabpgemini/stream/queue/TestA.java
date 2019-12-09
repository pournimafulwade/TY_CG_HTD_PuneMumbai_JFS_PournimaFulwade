package com.cabpgemini.stream.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestA {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
		pq.add(3);
		pq.add(34);
		pq.add(12);
		pq.add(54);
		
		Iterator<Integer> r=pq.iterator();
		while(r.hasNext())
		{
			Integer i = r.next();
			System.out.println(i);
			
		}
	}

}
