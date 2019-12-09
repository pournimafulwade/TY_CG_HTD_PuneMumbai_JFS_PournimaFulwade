package com.capgemeini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {
	@Test
	public void testAdd( ) {
		Sum s = new Sum();
		int i = s.add(10, 5);
		assertEquals(15 , i);
	}
	
	
	@Test
	public void testAddForNegative() {
		Sum s = new Sum();
		int i = s.add(-10, -5);
		assertEquals(-15 , i);
	}
	 
	
	@Test
	public void testAddition() {
		Sum s = new Sum();
		s.addition(10, 5, 8);
	}
	
	
	@Test
	public void testFactorial() {
		Sum s = new Sum();
		int a = s.factorial(5);
		assertEquals(120,a);
	}
	
	@Test
	public void testFactForZero() {
		Sum s = new Sum();
		int b = s.factorial(0);
		assertEquals(1, b);
	}
	
	@Test
	public void testFactForNegative() {
		Sum s = new Sum();
		int b = s.factorial(-6);
		assertEquals(1, b);
	}
}
