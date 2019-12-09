package com.cabg.corejava.interfaces;
//@FunctionalInterface - we only have one abstract method
public interface InterfaceEx {
	public void print();
	public void num();
	
	default void display()
	{
		System.out.println("Default method of interface");
	}

	
	public static void show()
	{
		System.out.println("static method of interface");
	}
}
