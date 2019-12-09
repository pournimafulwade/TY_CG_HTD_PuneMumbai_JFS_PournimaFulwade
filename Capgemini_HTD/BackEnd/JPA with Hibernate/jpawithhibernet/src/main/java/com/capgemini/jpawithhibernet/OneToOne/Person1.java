package com.capgemini.jpawithhibernet.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


	@Entity
	@Table(name = "Person1")
	public class Person1 {

		@Id
		@Column
		private int pid;
		
		@Column
		private String name;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "voterId")
		
		private VoterCard1 votercard;

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public VoterCard1 getVotercard() {
			return votercard;
		}

		public void setVotercard(VoterCard1 voterCard1) {
			this.votercard = voterCard1;
		}
		
		
	}


