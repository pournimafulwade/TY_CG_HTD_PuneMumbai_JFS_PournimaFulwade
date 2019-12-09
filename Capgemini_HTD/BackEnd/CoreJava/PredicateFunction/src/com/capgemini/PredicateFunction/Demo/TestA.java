package com.capgemini.PredicateFunction.Demo;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		Predicate<Integer> p = k-> {
			if(k%2==0) {
				return true;
			} else
				return false;
		};
		boolean res = p.test(15);
		System.out.println(res);

	}

}
