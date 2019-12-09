package com.capgemini.jpawithhibernet.ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
	@Table(name = "course")
	public class Course {
		
			@Id
			@Column
			private int cid;
			
			@Column
			private String cname ;
			
			@ManyToMany(mappedBy ="course")
			public List<Student> getStudnet() {
				return Studnet;
			}

			public void setStudnet(List<Student> studnet) {
				Studnet = studnet;
			}

			private List<Student> Studnet;

			public int getCid() {
				return cid;
			}

			public void setCid(int cid) {
				this.cid = cid;
			}

			public String getCname() {
				return cname;
			}

			public void setCname(String cname) {
				this.cname = cname;
			}
			
			
}
