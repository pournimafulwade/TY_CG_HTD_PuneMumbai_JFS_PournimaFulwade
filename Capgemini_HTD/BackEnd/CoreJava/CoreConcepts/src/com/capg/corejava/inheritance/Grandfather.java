package com.capg.corejava.inheritance;

public class Grandfather {
	String name= "Sham";
	String lastname ="Patil";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grandfather g = new Grandfather();
		g.print();
		
	}
	
	public void print() {
		System.out.println(name +" " +lastname);
	}

}
