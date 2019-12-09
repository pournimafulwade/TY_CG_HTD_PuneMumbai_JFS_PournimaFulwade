package com.capgemeini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	 private Calculator calculator = null;
	 
	 @BeforeEach
	 public void createObject() {
		 calculator = new Calculator();
	 }//end of the createObject()
	
	@Test
	public void testAdd() {
		int i = calculator.add(34, 56);
		assertEquals(90, i);
	}//end of the testAdd()
	
	@Test
	public void sub() {
		int a = calculator.sub(50, 20);
		assertEquals(30, a);
	}//end of the sub()
	
	@Test
	public void mul() {
		int b = calculator.mul(5, 5);
		assertEquals(25, b);
	}//end of the mul()
	
	@Test
	public void mulByZero() {
		int b = calculator.mul(5, 0);
		assertEquals(0, b);
	}//end of the mulByZero()
	
	@Test
	public void div() {
		int v = calculator.div(20,5);
		assertEquals(4, v);
	}//end of the div()
	
	@Test
	public void divForNumber() {
		int v = calculator.div(10,5);
		assertEquals(2, v);
	}//end of the divForNumber()
	
	@Test
	public void divByZero() {
		assertThrows(ArithmeticException.class, ()->calculator.div(10,0));
	}//end of the divByZero()
}//end of the CalculatorTest class
