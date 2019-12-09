package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subjects;

public class DeleteDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf=null;
		EntityManager em =null;
		EntityTransaction ts =null;
		try {
			emf =Persistence.createEntityManagerFactory("Test");
			em = emf.createEntityManager();
			ts =em.getTransaction();
			ts.begin();
			Subjects sub = em.find(Subjects.class, 5);
			em.remove(sub);
			ts.commit();
			System.out.println("Info Deleted");
			
		} catch (Exception e) {
			ts.rollback();
			e.printStackTrace();
		}
	}

}
