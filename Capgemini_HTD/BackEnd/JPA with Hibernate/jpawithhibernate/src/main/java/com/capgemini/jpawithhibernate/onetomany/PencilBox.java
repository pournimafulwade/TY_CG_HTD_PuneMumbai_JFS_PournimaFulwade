package com.capgemini.jpawithhibernate.onetomany;

import javax.persistence.*;

@Entity
@Table(name="pencil_box")
public class PencilBox {
	@Id
	@Column
	private int box_id;
	@Column
	private String name;
	
	public int getBox_id() {
		return box_id;
	}
	public void setBox_id(int box_id) {
		this.box_id = box_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
