package com.capgemini.springcore.beans;

import java.util.List;
import java.util.Set;

public class Medicine {

	private String name;
	private double price;
	private String type;
//	private List<String> drugs;
	private Set<String> drugset;
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Set<String> getDrugset() {
		return drugset;
	}
	public void setDrugset(Set<String> drugset) {
		this.drugset = drugset;
	}

	
	

//	public List<String> getDrugs() {
//		return drugs;
//	}
//	public void setDrugs(List<String> drugs) {
//		this.drugs = drugs;
//	}
}// end of the class
