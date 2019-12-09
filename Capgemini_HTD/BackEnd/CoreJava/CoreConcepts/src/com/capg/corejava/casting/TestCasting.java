package com.capg.corejava.casting;

public class TestCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p = new Marker();// up casting=using parent reference to child object
		
		Marker m = (Marker) p; //down casting=converting parent variable to child type
		
		m.cost=12;
		System.out.println("price " +m.cost);
		m.write();
		m.size=24;
		System.out.println("size " +m.size);
		m.color();
		
	}

}
