package com.capgemini.Sorting.set;

import java.util.Comparator;

public class ByMirc implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		Long l = o1.micr;
		Long l2 = o2.micr;
		return l.compareTo(l2);
	}
	

}
