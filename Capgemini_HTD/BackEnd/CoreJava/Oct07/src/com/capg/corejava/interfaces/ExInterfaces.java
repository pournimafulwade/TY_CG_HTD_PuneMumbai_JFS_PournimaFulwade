package com.capg.corejava.interfaces;

public class ExInterfaces implements Interfaces {

	@Override
	public void print() {
		System.out.println("implement print method of interface");		
	}

	@Override
	public void printnum() {
		System.out.println("2q43234345");	
	}
	public void display() {
		System.out.println("display method of interface");
		
	}
	public static void main(String[] args) {
		Interfaces i =new ExInterfaces();
		new ExInterfaces().print();
		new ExInterfaces().display();
		i.printnum();
		Interfaces.show();
		
	}

}
