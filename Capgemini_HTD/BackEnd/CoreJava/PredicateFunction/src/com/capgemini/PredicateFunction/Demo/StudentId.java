package com.capgemini.PredicateFunction.Demo;

import java.util.function.Function;

public class StudentId {

	public static void main(String[] args) {
		Function<Integer,StudentPredicate> f = i->{
			StudentPredicate s = new StudentPredicate();
			s.id = i;
			return s;
		};
		
		StudentPredicate s = f.apply(10);
		
		System.out.println("Name "+s.name);
		System.out.println("ID "+s.id);
		System.out.println("Percentage" +s.percentage);

	}

}
