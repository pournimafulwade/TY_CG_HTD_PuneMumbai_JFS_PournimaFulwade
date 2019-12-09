package com.capgemini.ImmutableBean.BEan;

import java.util.Comparator;

public class ById implements Comparator<StudentBean> {

	@Override
	public int compare(StudentBean o1, StudentBean o2) {
		if(o1.getId() > o2.getId()) {
			return 1;
		} else if(o1.getId() < o2.getId()) {
			return -1;
		}
		else
			return 0;
		
		
	}
	
	
	}
