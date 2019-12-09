package com.capgemini.jpawithhibernet.OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pencil1")
public class Pencil1 {
	
		@Id
		@Column
		private int pid;
		
		@Column
		private String color ;
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "boxId",nullable = false)
		private PencilBox1 pencilBox1;
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
		public PencilBox1 getPencilBox1() {
			return pencilBox1;
		}
		public void setPencilBox1(PencilBox1 pencilBox1) {
			this.pencilBox1 = pencilBox1;
		}

		
	
		

}
