package com.capg.corejava.inheritance;

public class Son extends Father implements InterfaceEx {
	String sname= "Amol";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son = new Son();
		son.print();

	}
	
	//@Override
	public void print() {
		System.out.println(sname +" "+fname+" "+lastname);
		super.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method of son ");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show mehtod in son");
		
	}


}
