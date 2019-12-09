package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction ts = em.getTransaction();
		ts.begin();
		String jpql ="Delete from Movie where id =1";
		Query query = em.createQuery(jpql);
		int i = query.executeUpdate();
		ts.commit();
		System.out.println("Info Deleted...");
	}

}
