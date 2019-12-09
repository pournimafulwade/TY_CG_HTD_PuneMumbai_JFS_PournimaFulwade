package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class ReattachDemo {

	public static void main(String[] args) {

		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); 
 			entityManager= entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			Movie data =entityManager.find(Movie.class, 2);

			System.out.println( data.getId());
			System.out.println(entityManager.contains( data));
			entityManager.detach( data);
			System.out.println(entityManager.contains( data));
			Movie movie1 = entityManager.merge( data);
			movie1.setName("dil chahta hai!!");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	
	}

}
