package com.capgemini.jpawithhibernet.ManyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
	@Table(name = "Student")
	public class Student {
		
			@Id
			@Column
			private int sid;
			
			@Column
			private String name ;
			
			@ManyToMany(cascade = CascadeType.ALL)
			@JoinTable(name = "student_course",joinColumns = @JoinColumn(name = "sid"),inverseJoinColumns = @JoinColumn(name ="cid"))
			private List<Course> course;

			public int getSid() {
				return sid;
			}

			public void setSid(int sid) {
				this.sid = sid;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<Course> getCourse() {
				return course;
			}

			public void setCourse(List<Course> course) {
				this.course = course;
			}
}
