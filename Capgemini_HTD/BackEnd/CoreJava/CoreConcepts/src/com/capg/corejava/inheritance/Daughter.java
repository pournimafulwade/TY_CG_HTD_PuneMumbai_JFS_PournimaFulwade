package com.capg.corejava.inheritance;

public class Daughter extends Father implements InterfaceEx {
    String dname="Snehal";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Daughter d =new Daughter();
		d.print();
		d.display();
		d.show();
	}

	public void print() {
		System.out.println(dname +" "+fname+" "+lastname);
		super.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method of Daughter");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Display method of Daughter");
		
	}

}
