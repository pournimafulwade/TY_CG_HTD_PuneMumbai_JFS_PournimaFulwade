package com.capgemini.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ExceptionMovie {
public static void main(String[] args)
{
EntityTransaction transaction = null;
EntityManager entityManager = null;
Movie movie = new Movie();
movie.setId(1);
movie.setName("abcd");
movie.setRating("average");

try{
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
entityManager = entityManagerFactory.createEntityManager(); 
 transaction = entityManager.getTransaction(); 
transaction.begin();
entityManager.persist(movie);
System.out.println("Record saved...");
transaction.commit();
}catch(Exception e)
{
transaction.rollback();
e.printStackTrace();
}
entityManager.close();
}
}

