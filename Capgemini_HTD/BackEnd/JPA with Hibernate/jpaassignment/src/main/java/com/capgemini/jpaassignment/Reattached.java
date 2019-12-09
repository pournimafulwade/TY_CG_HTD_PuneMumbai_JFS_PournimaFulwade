package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subjects;

public class Reattached {

	public static void main(String[] args) {

		EntityManagerFactory emf =null;
		EntityManager em = null;
		EntityTransaction ts = null;
		try {
			emf =Persistence.createEntityManagerFactory("Test");
			em = emf.createEntityManager();
			ts =em.getTransaction();
			ts.begin();
			Subjects sub = em.find(Subjects.class, 4);
			em.detach(sub);
			sub.setSubname("HTML");
			ts.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
