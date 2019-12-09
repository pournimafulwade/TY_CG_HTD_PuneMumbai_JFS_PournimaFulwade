package com.capgemini.jpawithhibernet.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDynamic {
	
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); 
			EntityManager entityManager= entityManagerFactory.createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			
			String jpql = "Update Movie set name =:nm where id = :mid";
			
			transaction.begin();
			
			Query query =entityManager.createQuery(jpql);
			
			Query.setParameter("nm","golmaal");
			Query.setParameter("mid",3);
			
			int result = query.executeUpdate();
			transaction.commit();
			System.out.println("result:"+result);
	
		entityManager.close();
	
		
}



