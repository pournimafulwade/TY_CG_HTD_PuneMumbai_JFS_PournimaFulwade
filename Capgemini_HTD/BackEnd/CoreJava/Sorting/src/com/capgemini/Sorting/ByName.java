package com.capgemini.sorting;

import java.util.Comparator;

public class ByName implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		String a =o1.name;
		String b = o2.name;
		return a.compareTo(b);
	}

	
}
