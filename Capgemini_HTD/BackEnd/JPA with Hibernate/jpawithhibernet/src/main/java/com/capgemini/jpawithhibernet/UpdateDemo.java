package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class UpdateDemo {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); 
 			entityManager= entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			Movie data =entityManager.find(Movie.class, 2);
			data.setName("Avengers");
			data.setRating("Outstanding");
			System.out.println("Record updated");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();//used if there is any exception
			e.printStackTrace();
		}
		entityManager.close();
	
	}

}
