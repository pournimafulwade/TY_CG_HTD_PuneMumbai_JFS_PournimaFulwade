package com.capgemini.bean;

public class TestA {

	public static void main(String[] args) {

		Student s = new Student();
		s.setId(20);
		s.setname("Snehal");
		s.setheight(6.5);
		 Database db = new Database();
		 db.receive(s);
	}

}
