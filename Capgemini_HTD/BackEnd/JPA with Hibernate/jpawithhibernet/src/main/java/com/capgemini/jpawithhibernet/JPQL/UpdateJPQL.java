package com.capgemini.jpawithhibernet.JPQL;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class UpdateJPQL {
	


	
		public static void main(String[] args) {
		
			
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); 
	 			EntityManager entityManager = entityManagerFactory.createEntityManager();
	 			
	 			String jpql = "Update Movie set name ='Avengers' where id = 1";
	 			EntityTransaction transaction = entityManager.getTransaction();
	 			transaction.begin();
	 			Query query =entityManager.createQuery(jpql);

	 			int result = query.executeUpdate();
	 			transaction.commit();
	 		System.out.println("result: "+result);
	 		entityManager.close();
			
				

	}


}
