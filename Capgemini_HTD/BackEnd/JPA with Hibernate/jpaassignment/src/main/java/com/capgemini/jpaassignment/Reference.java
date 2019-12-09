package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subjects;

public class Reference {

	public static void main(String[] args) {

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Test");
		EntityManager em = emf.createEntityManager();
		Subjects sub = em.getReference(Subjects.class, 2);
		System.out.println("Id : "+sub.getSubid());
		System.out.println("Subject Name : "+sub.getSubname());
		System.out.println("Difficult Level : "+sub.getLevel());
	}

}
