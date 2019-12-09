package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.Subjects;

public class InsertDemo {

	public static void main(String[] args) {

		EntityTransaction ts = null;
		EntityManager em =null;
		Subjects sub = new Subjects();
		sub.setSubid(5);
		sub.setSubname("HTML");
		sub.setLevel("Easy");
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
			em = emf.createEntityManager();
			ts = em.getTransaction();
			ts.begin();
			em.persist(sub);
			System.out.println("Record Saved...");
			ts.commit();
		}catch(Exception e) {
			ts.rollback();
			e.printStackTrace();
		}
	}

	
}
