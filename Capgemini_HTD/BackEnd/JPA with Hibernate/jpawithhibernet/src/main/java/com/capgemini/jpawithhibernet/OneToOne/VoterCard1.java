package com.capgemini.jpawithhibernet.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



	@Entity
	@Table(name = "VoterCard1")
	public class VoterCard1 {

		@Id
		@Column
		private int voterId;
		
		@Column
		private String address;
		
		@OneToOne(mappedBy = "VoterCard1")
		private Person person;

		public int getVoterId() {
			return voterId;
		}

		public void setVoterId(int voterId) {
			this.voterId = voterId;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}
		
		
	

}
