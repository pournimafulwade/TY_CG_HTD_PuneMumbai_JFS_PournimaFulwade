package com.cabgemini.objectclass.methods;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new Pen();
		int add = p.hashCode();
		System.out.println("Address is " +add);
		Pen a = new Pen();
		System.out.println("Address is "+ a.hashCode());

	}

}
