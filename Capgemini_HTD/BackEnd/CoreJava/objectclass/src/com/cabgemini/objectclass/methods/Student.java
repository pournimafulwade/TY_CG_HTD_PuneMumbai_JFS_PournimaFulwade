package com.cabgemini.objectclass.methods;

public class Student {

	int id;
	String name;
	double percent;
	public Student(int id, String name, double percent) {
		this.id = id;
		this.name = name;
		this.percent = percent;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", percent=" + percent ;
	}
	
	
	
	
	
	
}
