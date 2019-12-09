package com.capgemini.jpawithhibernate.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pencil")
public class Pencil {
	@Id
	@Column
	private int pid ;
	@Column
	private String color;
	 
	private List<Pencil> pencil;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
