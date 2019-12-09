package com.cabgemini.objectclass.methods;

public class TestF {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Marker m= new Marker(1,"Camlin") ;
		System.out.println("ID is "+m.id);
		System.out.println("Name ia "+m.name);
		
		Object r =m.clone();
		Marker a =(Marker)r;
		
		System.out.println("ID is "+a.id);
		System.out.println("Name ia "+a .name);
	}

}
