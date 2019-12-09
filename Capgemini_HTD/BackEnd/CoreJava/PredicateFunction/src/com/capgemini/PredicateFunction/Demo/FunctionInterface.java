package com.capgemini.PredicateFunction.Demo;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		Function<Integer,Integer> f = p ->  p*p;
		
		int ans = f.apply(12);
		System.out.println(ans);

	}

}
