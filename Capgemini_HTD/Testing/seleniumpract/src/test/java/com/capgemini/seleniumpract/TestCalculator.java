package com.capgemini.seleniumpract;



import org.junit.Assert;
import org.junit.Test;

import com.capgemini.seleniumpract.webDriver.Calculator;

public class TestCalculator {
	Calculator calculator= new Calculator();
	int x = 50;
	int y =20;
	
	@Test
	public void addTest() {
		int  expected = 70;
		int actual =calculator.add(x,y);
		Assert.assertEquals(expected, actual);
	}//end of the addTest()
	
	@Test
	public void subTest() {
		
		int expected = 30;
		int actual = calculator.sub(x, y);
	}

}//end of the TestCalculator class
