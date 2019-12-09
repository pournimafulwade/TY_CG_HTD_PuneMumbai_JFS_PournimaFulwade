package com.capgemini.PredicateFunction.Demo;

import java.util.function.Supplier;

public class SuuplierTest {

	public static void main(String[] args) {
		Supplier<StudentPredicate> s = () -> new StudentPredicate();
		
		StudentPredicate a = s.get();
		
		StudentPredicate b = s.get();
		
		System.out.println(a);
		
		System.out.println(b);
		

	}

}
