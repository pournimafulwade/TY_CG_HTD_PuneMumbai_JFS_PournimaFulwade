package com.capgemini.bean;

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(10);
		s.setName("Dimple");
		s.setHeight(5.12);
		
		DataBase db = new DataBase();
		db.receive(s);

	}

}
