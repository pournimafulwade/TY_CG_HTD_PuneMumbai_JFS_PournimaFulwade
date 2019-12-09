package com.capgemini.jpawithhibernet.OneToMany;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	@Entity
	@Table(name = "PencilBox1")
	public class PencilBox1 {
		@Id
		@Column
		private int boxId;
		
		@Column
		private String name ;
		
		@OneToMany(mappedBy= "pencilBox1")
		private List<Pencil1> pencil1;
		

		public List<Pencil1> getPencil1() {
			return pencil1;
		}

		public void setPencil1(List<Pencil1> pencil1) {
			this.pencil1 = pencil1;
		}

		public int getBoxId() {
			return boxId;
		}

		public void setBoxId(int boxId) {
			this.boxId = boxId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		

}
