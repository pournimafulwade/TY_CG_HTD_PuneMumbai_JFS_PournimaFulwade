package com.cabgemini.exception.example2;

import java.io.File;
import java.io.IOException;

public class Bottle {
	
	public void open() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("a.txt");
		f.createNewFile();
		
		Class.forName("com.cabgemini.exception.example2.Bottle");
		
	}

}
