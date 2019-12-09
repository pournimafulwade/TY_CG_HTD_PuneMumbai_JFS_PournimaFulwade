package com.capgemini.CollectionFramework.list;

public class Student {

	String name;
	int id;
	int percentage;

	public Student(int id, String name, int percentage) {
		this.id = id;
		this.name = name;
		this.percentage=percentage;
	}

	/* when we declaire variables as private then we use getter and setter
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public int getPercentage() { return percentage; }
	 * 
	 * public void setPercentage(int percentage) { this.percentage = percentage; }
	 */	
	

}
