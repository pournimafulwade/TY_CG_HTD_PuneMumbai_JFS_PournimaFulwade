package com.cabgemini.exception.example2;

public class TestG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting");
		int[] a = {1 , 2 , 3 , 4};
		String s = null;
		
		try
		{
			//System.out.println(s.length());
			//System.out.println(a[5]);
			System.out.println(10/0);
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
