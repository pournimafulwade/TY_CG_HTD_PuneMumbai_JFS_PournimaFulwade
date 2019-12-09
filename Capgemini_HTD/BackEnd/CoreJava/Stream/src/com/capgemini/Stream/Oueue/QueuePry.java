package com.capgemini.Stream.Oueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuePry {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		
		p.add(10);
		p.add(2000);
		p.add(20);
		p.add(3);
		p.add(100);
		
		Iterator<Integer> i = p.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}

	}

}
