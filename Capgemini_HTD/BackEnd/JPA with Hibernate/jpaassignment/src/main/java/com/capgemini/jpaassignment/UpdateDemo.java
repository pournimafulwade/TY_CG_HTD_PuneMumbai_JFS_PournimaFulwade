package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subjects;

public class UpdateDemo {

	public static void main(String[] args) {

		EntityTransaction ts = null;
		EntityManager em =null;
		try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		em = emf.createEntityManager();
		ts = em.getTransaction();
		ts.begin();
		Subjects sub =em.find(Subjects.class, 5);
		sub.setSubname("Spring");
		sub.setLevel("Hard");
		ts.commit();
		System.out.println("Info Updated....");
		}
		catch(Exception e) {
			ts.rollback();
			e.printStackTrace();
		}
	}

}
