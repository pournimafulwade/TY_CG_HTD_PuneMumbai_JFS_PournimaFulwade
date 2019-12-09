package com.capgemini.Stream.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(5);
		al.add(10);
		al.add(6);
		al.add(3);
		al.add(4);
		
		List<Integer> li = al.stream().sorted().collect(Collectors.toList());
		System.out.println(li);

	}

}
