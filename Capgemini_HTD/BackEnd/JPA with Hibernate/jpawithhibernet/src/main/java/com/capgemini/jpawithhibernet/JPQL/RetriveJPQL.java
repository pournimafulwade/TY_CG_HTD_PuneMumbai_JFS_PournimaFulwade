package com.capgemini.jpawithhibernet.JPQL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernet.DTO.Movie;


public class RetriveJPQL {
	

	
		public static void main(String[] args) {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			String  jpql = "from Movie";
			Query query = entityManager.createQuery(jpql);
			List<Movie> list = query.getResultList();
			for(Movie movie : list)
		
			{
				System.out.println(movie.getId());
			}
			
		}
	}



