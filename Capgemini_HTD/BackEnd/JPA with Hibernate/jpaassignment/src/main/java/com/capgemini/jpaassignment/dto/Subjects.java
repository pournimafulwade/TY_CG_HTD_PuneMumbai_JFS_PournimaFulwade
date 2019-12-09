package com.capgemini.jpaassignment.dto;

import javax.persistence.*;

@Entity
@Table(name="subjects")
public class Subjects {
	@Id
	@Column
	private int subid;
	@Column
	private String subname;
	@Column
	private String level;
	
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	

}
