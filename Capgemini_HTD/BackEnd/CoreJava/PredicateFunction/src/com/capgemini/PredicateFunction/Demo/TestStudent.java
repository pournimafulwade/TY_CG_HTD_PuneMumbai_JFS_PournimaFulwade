package com.capgemini.PredicateFunction.Demo;

import java.util.function.Predicate;

public class TestStudent {

	public static void main(String[] args) {
		
		
		Predicate<StudentPredicate> p = (k) -> {
			if(k.percentage > 35) {
				return true;
			} else
				return false;
			 
		};
		StudentPredicate s1 = new StudentPredicate(1,"Mayuri",76.5);

		boolean res = p.test(s1);
		System.out.println(res);

	}

}
