package com.capgemini.corejava.DataType;

public class GrandFather {
	String name = "Yashawant";
	String lastname = "Shinde";
	public static void main(String[] args) {
		GrandFather g= new GrandFather();
		g.print();
	}
		public void print() {
			System.out.println(name+" "+lastname);
	}

}
