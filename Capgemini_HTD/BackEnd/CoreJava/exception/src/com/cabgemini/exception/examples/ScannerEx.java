package com.cabgemini.exception.examples;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args)
	{
		
		try(Scanner s = new Scanner(System.in))
		{
			System.out.println("Enter the Age");
			int age = s.nextInt();
			System.err.println("Age is "+age);
		}
		
	}

}
