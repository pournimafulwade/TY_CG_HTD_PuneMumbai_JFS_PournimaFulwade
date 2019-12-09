package com.capgemini.ArrayList.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add('Z');
		al.add('E');
		al.add('I');
		al.add('O');
		al.add('x');
		
		Collections.sort(al);
		System.out.println(al);

		Collections.shuffle(al);
		System.out.println(al);
	}

}
