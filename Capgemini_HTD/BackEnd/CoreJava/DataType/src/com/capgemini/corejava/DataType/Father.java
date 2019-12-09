package com.capgemini.corejava.DataType;

public class Father extends GrandFather {
	String fname ="Ramesh";
	public static void main(String[] args) {
		new Father().printName();
	}
	private void printName() {
		System.out.println(fname+" "+name+" "+lastname);
		
	}


}
