package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reference {
	public static void main(String[] args) {

		EntityManagerFactory entityMnagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager =entityMnagerFactory.createEntityManager();
		//Movie data = entityManager.find(Movie.class, 1);    //we get the query in console
		Movie data = entityManager.getReference(Movie.class, 2);
		System.out.println("ID : "+data.getId());
		System.out.println("Name : "+data.getMname());
		System.out.println("Ratings : "+data.getRating());
	
	}//end of main


}//end of class
