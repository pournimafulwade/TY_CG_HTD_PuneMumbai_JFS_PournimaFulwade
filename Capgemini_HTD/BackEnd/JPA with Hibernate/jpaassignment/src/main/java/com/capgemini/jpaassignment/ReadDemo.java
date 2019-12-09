package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subjects;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		EntityManager em = emf.createEntityManager();
		Subjects sub =em.find(Subjects.class, 3);
		System.out.println("Id : "+sub.getSubid());
		System.out.println("Subject Name : "+sub.getSubname());
		System.out.println("Difficult Level : "+sub.getLevel());
	}

}
