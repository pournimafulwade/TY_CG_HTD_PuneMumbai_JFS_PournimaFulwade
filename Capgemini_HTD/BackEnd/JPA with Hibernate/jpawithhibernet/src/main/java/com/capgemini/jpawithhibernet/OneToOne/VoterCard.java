package com.capgemini.jpawithhibernet.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VoterCard")
public class VoterCard {

	@Id
	@Column
	private int voterId;
	
	@Column
	private String address;
	
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
	public Person1 getPerson1() {
		return null;
	}
	
	
}
