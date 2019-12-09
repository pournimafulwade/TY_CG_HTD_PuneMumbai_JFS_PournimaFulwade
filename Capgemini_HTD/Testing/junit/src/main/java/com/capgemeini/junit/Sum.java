package com.capgemeini.junit;

public class Sum {
	public int add(int a, int b) {
		return a + b;
	}

	public int addition(int a, int b, int c) {
		return a + b + c;
	}

	public int factorial(int d) {
		int fact = 1;
		for (int i = d; i > 0; i--) {
			fact = fact * i;
		}
		return fact;

	}

}
