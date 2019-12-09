package com.capgemini.jpawithhibernet.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneBIDIRECTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p = new Person1();
		p.setPid(10);
		p.setName("sinchan");

		VoterCard1 vc = new VoterCard1();
		vc.setVoterId(12234);
		vc.setAddress("t.b.kadam marg lalbaug");
		p.setVotercard(vc);

		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction transaction = null;

		try {

				entityManagerFactory = Persistence.createEntityManagerFactory("test");
				entityManager = entityManagerFactory.createEntityManager();
				transaction = entityManager.getTransaction();
				transaction.begin();
				
				VoterCard carddetails = entityManager.find(VoterCard.class,1234);
				carddetails.getVoterId();
				carddetails.getAddress();
				carddetails.getPerson1().getPid();
				carddetails.getPerson1().getName();
		
				
				System.out.println("Record inserted");
				transaction.commit();
		}
		catch(Exception e){
		transaction.rollback();
		e.printStackTrace();
		}

				entityManager.close();
		}
		

	}


