package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction ts =em.getTransaction();
		ts.begin();
		String jpql = "update Movie set mname='ABCD2' where id =2 ";
		Query query =em.createQuery(jpql);
		int i = query.executeUpdate();
		ts.commit();
		
		System.out.println("Updated info....");
		}

}
