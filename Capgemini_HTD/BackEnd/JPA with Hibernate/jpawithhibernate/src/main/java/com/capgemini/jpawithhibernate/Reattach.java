package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reattach {

	public static void main(String[] args) {

		EntityManager entityManager =null;
		EntityTransaction transaction =null;
		
		try {//if there will be exception in future while inserting data ,we are using this try catch block
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager= entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie movie = entityManager.find(Movie.class, 2);
			//System.out.println(movie.getId());
			//System.out.println(entityManager.contains(movie));
			
			entityManager.detach(movie);
			System.out.println(entityManager.contains(movie));
			movie.setMname("ABCD2");
			//Movie movie1 =entityManager.merge(movie);
			//movie1.setMname("Avengers");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		entityManager.close();
		
	}//end of main

}//end of class
