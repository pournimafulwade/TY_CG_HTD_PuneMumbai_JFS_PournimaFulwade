package com.capgemini.jpawithhibernet.OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test1OneToMany {
	public static void main(String[] args){

PencilBox1 pencilBox1 = new PencilBox1();
	pencilBox1.setBoxId(11);
	pencilBox1.setName("Natraaj");

	Pencil1 pencil1 = new Pencil1();
	pencil1.setPid(12);
	pencil1.setColor("brown");


	
		


		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction transaction = null;

		try {

				entityManagerFactory = Persistence.createEntityManagerFactory("test");
				entityManager = entityManagerFactory.createEntityManager();
				transaction = entityManager.getTransaction();
				transaction.begin();
				entityManager.persist(pencilBox1);
				System.out.println("Record inserted");
				transaction.commit();
		}
		catch(Exception e){

		e.printStackTrace();
		transaction.rollback();
		}

				entityManager.close();
		}

	}

		
	


