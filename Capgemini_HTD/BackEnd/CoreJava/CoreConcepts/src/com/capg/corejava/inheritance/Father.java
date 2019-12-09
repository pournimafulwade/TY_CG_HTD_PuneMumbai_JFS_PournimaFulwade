package com.capg.corejava.inheritance;

public class Father extends Grandfather {

	String fname="vilas";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		new Father().print();
		// new Grandfather().print();  we can access the superclass methods in the subclass by creating an object of super class
	    // but we cannot access methods of subclass by creating an object of superclass
	}
	
	@Override
	public void print() {
		System.out.println(fname);
		super.print();
	}


}
