package com.capgemini.Stream.Maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> hm = new LinkedHashMap<String,Integer>();

		hm.put("Omdhu",1);
		hm.put("Idhu",5);
		hm.put("Hathu",10);
		hm.put("Eredu",2);

		for(Map.Entry<String, Integer> r: hm.entrySet()) {
			String k = r.getKey();
			Integer v = r.getValue();
			System.out.println("Key is :" +k);
			System.out.println("VAlue is :"+v);
			System.out.println("******************");
		}
		
		System.out.println("*********KEY************");
		Set<String> s = hm. keySet();
		for(String r : s) {
			System.out.println(r);
		}
		
		System.out.println("*********Values***********");
		Collection<Integer> col = hm.values();
		for(Integer r : col) {
			System.out.println(r);
			
		}
		
		boolean res = hm.containsKey("Omdhu");
		System.out.println(res);
		System.out.println("******************");
		
		boolean res2 = hm.containsValue(10);
		System.out.println(res2);
		System.out.println("******************");
		
		Integer res1 = hm.get("Omdhu");
		System.out.println(res1);
		System.out.println("******************");
	}

}
