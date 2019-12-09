package com.capgemini.corejava.DataType;

public class Child extends Father {
	String Cname="Mayuri";
	public static void main(String[] args) {
		new Child().childname();
	}
	  public void childname() {
		System.out.println(Cname+" "+fname+" "+lastname);
		
	}
	

}
