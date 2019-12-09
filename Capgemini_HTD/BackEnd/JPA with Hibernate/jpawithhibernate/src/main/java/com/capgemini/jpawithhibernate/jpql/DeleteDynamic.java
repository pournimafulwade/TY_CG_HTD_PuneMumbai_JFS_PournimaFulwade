package com.capgemini.jpawithhibernate.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamic {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction ts = em.getTransaction();
		Scanner sc = new Scanner(System.in);
		ts.begin();
		String jpql ="Delete from Movie where id =:mid";
		Query query = em.createQuery(jpql);
		System.out.println("Enter id");
		query.setParameter("mid", sc.nextInt());
		int i = query.executeUpdate();
		ts.commit();
		System.out.println("Info Deleted...");
	}

}
