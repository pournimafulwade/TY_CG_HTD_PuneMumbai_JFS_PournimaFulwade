package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrieve {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		EntityManager em = emf.createEntityManager();
		String jpql ="from Movie";
		Query query =em.createQuery(jpql);
		List<Movie> list = query.getResultList();
		
		for(Movie m :list)
		{
			System.out.println("id :"+m.getId());
			System.out.println("Name : "+m.getMname());
			System.out.println("Rating :"+m.getRating());
		}
	}//end of main

}//end of class
