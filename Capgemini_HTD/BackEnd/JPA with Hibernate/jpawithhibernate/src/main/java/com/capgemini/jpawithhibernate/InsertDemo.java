package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class InsertDemo {

	public static void main(String[] args) {
		EntityManager entityManager =null;
		EntityTransaction transaction =null;
		Movie movie = new Movie();
		movie.setId(1);
		movie.setMname("Kuch kuch hota hai");
		movie.setRating("Good");
		
		try {//if there will be exception in future while inserting data ,we are using this try catch block
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager= entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("Record saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		entityManager.close();
	}//end of main

}//end of class
