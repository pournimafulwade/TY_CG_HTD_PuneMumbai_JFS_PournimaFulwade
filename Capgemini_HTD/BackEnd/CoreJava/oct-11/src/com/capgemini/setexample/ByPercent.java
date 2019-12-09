package com.capgemini.setexample;

import java.util.Comparator;

public class ByPercent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getPercent()>o2.getPercent())
		{
			return 1;
		}
		else if(o1.getPercent()<o2.getPercent())
		{
			return -1;
		}else
		return 0;
	}

	
}
