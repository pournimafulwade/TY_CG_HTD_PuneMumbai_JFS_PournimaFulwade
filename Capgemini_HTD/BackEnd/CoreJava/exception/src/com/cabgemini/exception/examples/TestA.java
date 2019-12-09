package com.cabgemini.exception.examples;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started");
		
		String s = null;
		int[] a = new int[3];
		try
		{
			System.out.println(s.length());
			System.out.println(a[7]);// this line throws an exception
			System.out.println(10/0);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Dont cross array boundry");
		}
		catch(ArithmeticException d)
		{
			System.out.println("dont divide by zero");
		}
		catch(NullPointerException e )
		{
			System.out.println("dont deal with null ");
		}
		catch(Exception c)
		{
			System.out.println("something went wrong");
		}
		System.out.println("main ended");
	}

}
