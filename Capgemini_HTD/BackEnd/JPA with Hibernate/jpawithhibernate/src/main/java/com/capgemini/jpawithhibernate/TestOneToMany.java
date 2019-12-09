package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetomany.Pencil;
import com.capgemini.jpawithhibernate.onetomany.PencilBox;


public class TestOneToMany {

	public static void main(String[] args) {

		EntityManager entityManager =null;
		EntityTransaction transaction =null;
		Pencil p = new Pencil();
		p.setPid(1);
		p.setColor("Blue");
		PencilBox pb =new PencilBox();
		pb.setBox_id(12);
		pb.setName("Camlin");
		
		try {//if there will be exception in future while inserting data ,we are using this try catch block
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager= entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			System.out.println("Record saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		entityManager.close();
	}

}
