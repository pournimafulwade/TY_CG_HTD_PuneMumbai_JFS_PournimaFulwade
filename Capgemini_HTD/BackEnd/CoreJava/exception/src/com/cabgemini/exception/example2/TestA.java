package com.cabgemini.exception.example2;

import java.io.File;
import java.io.IOException;

public class TestA {
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		File f = new File("R:/vilak.txt");
		try
		{
			f.createNewFile();
			System.out.println("file created");
		}
		catch(IOException e)
		{
			System.out.println("Sorry not able to create the file");
		}
		System.out.println("main ended");
	}

}
