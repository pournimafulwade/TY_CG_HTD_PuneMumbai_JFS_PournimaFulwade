package com.capg.corejava.interfaces;

public interface Interfaces {
	public void print();
	public void printnum();
	default void display()
	{
		System.out.println("default method of intrfaces");
	}
	public static void show()
	{
		System.out.println("static method of interfaces");
	}

}
