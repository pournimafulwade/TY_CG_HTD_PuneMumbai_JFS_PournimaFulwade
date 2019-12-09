package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.Person;
import com.capgemini.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {

		EntityManager entityManager =null;
		EntityTransaction transaction =null;
		Person person = new Person();
		person.setPid(1);
		person.setName("Snehal");
		
		VoterCard vc = new VoterCard();
		vc.setVid(1234);
		vc.setAddress("Navi Mumbai");
		
		person.setVoterCard(vc);
		try {//if there will be exception in future while inserting data ,we are using this try catch block
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager= entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(person);
			VoterCard cardDetails = entityManager.find(VoterCard.class, 1234);
			System.out.println("Voter id : "+cardDetails.getVid());
			System.out.println("Address :"+cardDetails.getAddress());
			System.out.println("Peraon id :"+cardDetails.getPerson().getPid());
			System.out.println("Name :"+cardDetails.getPerson().getName());
			System.out.println("Record saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		entityManager.close();
	}//end of main

}//end of class
