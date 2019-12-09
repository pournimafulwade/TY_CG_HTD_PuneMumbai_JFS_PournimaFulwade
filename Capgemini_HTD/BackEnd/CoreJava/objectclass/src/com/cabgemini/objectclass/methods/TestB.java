package com.cabgemini.objectclass.methods;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new Pen();
		int add = p.hashCode();
		System.out.println("Address is " +add);
		System.out.println(p);// we can write directly reference variable inside print statement it will give FQP
		String r=p.toString();
		System.out.println(r);
	}
}
