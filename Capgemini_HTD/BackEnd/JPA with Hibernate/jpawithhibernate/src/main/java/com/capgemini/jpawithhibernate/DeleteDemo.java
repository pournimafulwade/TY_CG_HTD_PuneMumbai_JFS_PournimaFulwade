package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;


public class DeleteDemo {

	public static void main(String[] args) {

		EntityManager entityManager =null;
		EntityTransaction transaction =null;
		
		try {//if there will be exception in future while inserting data ,we are using this try catch block
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager= entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie data = entityManager.find(Movie.class, 1);
			entityManager.remove(data);
			System.out.println("Record deleted");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		entityManager.close();
	}//end of main

}//end of class
