package com.cabg.corejava.interfaces;

public class Demo1 implements InterfaceEx {

	@Override
	public void print() {
	
		System.out.println("implemented print method of interace");
	
	}
	// We can not override the static method of an interface
	/*@Override
	public static void show()
	{
		System.out.println("static method of interface");
	}*/
	
	@Override
	public void display()
	{
		System.out.println("implemented Default method of interface");
	}
	
	public static void main(String[]args)
	{
		InterfaceEx ie =new Demo1();
		ie.print();
		ie.display();
		ie.num();
		InterfaceEx.show();
		
	}

	@Override
	public void num() {
		System.out.println("method");
		
	}

}
