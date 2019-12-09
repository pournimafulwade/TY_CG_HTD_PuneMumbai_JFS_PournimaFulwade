package com.capgemini.Stream.Maps;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
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
		

	}

}
