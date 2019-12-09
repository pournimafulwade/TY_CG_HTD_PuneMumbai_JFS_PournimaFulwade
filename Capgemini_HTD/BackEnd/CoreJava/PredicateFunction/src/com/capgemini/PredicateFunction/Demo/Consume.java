package com.capgemini.PredicateFunction.Demo;

import java.util.function.Consumer;

public class Consume {

	public static void main(String[] args) {
		Consumer<StudentPredicate> c = (s) ->{
			System.out.println("Name is :" +s.id);
			System.out.println("id is :" +s.name);
			System.out.println("Percentage is "+s.percentage);
		};
		
		StudentPredicate s = new StudentPredicate(1,"Mayuri",54.3);
		c.accept(s);

	}

}
