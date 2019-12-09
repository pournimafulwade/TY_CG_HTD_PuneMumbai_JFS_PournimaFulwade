package com.capgemini.maps;

import java.util.TreeMap;
import java.util.Map;

public class TestC {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<String,Integer>();
		tm.put("Ondu", 1);
		tm.put("Idhu", 5);
		tm.put("Hathu", 10);
		tm.put("Eredu", 2);
		
		for(Map.Entry<String, Integer> r :tm.entrySet())
		{
			String s=r.getKey();
			Integer t=r.getValue();
			System.out.println("key : "+s);
			System.out.println("Value : "+t);
			System.out.println("-------------------");
			
			}
	}

}
