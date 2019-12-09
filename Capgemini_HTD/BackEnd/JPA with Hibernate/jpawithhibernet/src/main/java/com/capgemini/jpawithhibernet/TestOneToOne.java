package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernet.OneToOne.Person;
import com.capgemini.jpawithhibernet.OneToOne.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {

		Person p = new Person();
		p.setPid(10);
		p.setName("sinchan");

		VoterCard vc = new VoterCard();
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
				entityManager.persist(p);
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

	
