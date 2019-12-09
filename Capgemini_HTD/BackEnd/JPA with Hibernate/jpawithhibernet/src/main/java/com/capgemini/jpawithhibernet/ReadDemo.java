package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie data = entityManager.find(Movie.class, 1);
		System.out.println("Id is: "+data.getId());
		System.out.println("Name is: "+data.getMname());
		System.out.println("Rating is: "+data.getRating());
		
	}
}
