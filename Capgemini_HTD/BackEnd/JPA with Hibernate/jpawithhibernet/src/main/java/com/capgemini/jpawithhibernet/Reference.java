 package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Reference {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie data = entityManager.getReference(Movie.class, 1);
		//Movies data = entityManager.find(Movies.class, 1);
		System.out.println("Id is: "+data.getId());
		System.out.println("Name is: "+data.getMname());
		System.out.println("Rating is: "+data.getRating());
		
	}
}
