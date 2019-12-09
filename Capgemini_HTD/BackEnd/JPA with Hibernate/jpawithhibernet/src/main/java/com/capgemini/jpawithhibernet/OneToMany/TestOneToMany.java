package com.capgemini.jpawithhibernet.OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernet.OneToMany.Pencil;
import com.capgemini.jpawithhibernet.OneToMany.PencilBox;

public class TestOneToMany {
public static void main(String[] args)
{
	
	Pencil p = new Pencil();

p.setPid(123);
p.setColor("black");

	PencilBox vc = new PencilBox();

vc.setBoxId(123);
vc.setName("yeah");
	

	EntityManager entityManager = null;
	EntityManagerFactory entityManagerFactory = null;
	EntityTransaction transaction = null;

	try {

			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(p);
			System.out.println("Record inserted");
			transaction.commit();
	}
	catch(Exception e){
	transaction.rollback();
	e.printStackTrace();
	}

			entityManager.close();
	}

}
