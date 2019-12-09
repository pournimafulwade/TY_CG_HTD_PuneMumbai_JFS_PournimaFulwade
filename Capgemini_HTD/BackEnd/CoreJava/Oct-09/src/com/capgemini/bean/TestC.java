package com.capgemini.bean;

public class TestC {

	public static void main(String[] args) {

		Van r = Van.getRef();
		System.out.println(r);
		
		Van t = Van.getRef();
		System.out.println(t);
		
		Van s = Van.getRef();
		System.out.println(s);
	}

}
