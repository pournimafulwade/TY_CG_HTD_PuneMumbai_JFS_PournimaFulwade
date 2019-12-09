package com.capgemini.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestB {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String,Integer>();
		lhm.put("Ondu", 1);
		lhm.put("Idhu", 5);
		lhm.put("Hathu", 10);
		lhm.put("Eredu", 2);
		
		for(Map.Entry<String, Integer> r :lhm.entrySet())
		{
			String s=r.getKey();
			Integer t=r.getValue();
			System.out.println("key : "+s);
			System.out.println("Value : "+t);
			System.out.println("-------------------");
			
			}
	}

}
