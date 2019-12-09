package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDemo {
	public static void main(String[] args) {
		Movie movie = new Movie();
		
		movie.setId(2);
		movie.setName("PK");
		movie.setRating("Good");
		
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); 
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction transaction= entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("Record inserted");
			transaction.commit();
		
		entityManager.close();
	}// end of main
}// end of program
