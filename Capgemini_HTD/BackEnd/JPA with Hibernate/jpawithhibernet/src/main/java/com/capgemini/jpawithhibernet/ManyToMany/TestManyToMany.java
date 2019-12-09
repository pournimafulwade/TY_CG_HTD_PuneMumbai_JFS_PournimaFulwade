package com.capgemini.jpawithhibernet.ManyToMany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManyToMany {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setSid(11);
		s1.setName("Raaj");

		Student s2 = new Student();
		s2.setSid(12);
		s2.setName("Yash");

		Student s3 = new Student();
		s3.setSid(12);
		s3.setName("YashRaaj");

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		Course c1 = new Course();
		c1.setCid(21);
		c1.setCname("css");

		Course c2 = new Course();
		c2.setCid(22);
		c2.setCname("Java");

		Course c3 = new Course();
		c3.setCid(23);
		c3.setCname("Hibernate");


		ArrayList<Course> list1 = new ArrayList<Course>();
		list1.add(c1);
		list1.add(c2);
		list1.add(c3);


				
		
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction transaction = null;
		try{
		entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		//entityManager.persist(s1);
		Course course2 = entityManager.find(Course.class, 21);
		course2.getStudnet().get(0).getSid();
		
		System.out.println("record inserted....");
		transaction.commit();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		transaction.rollback();
		}
		entityManager.close();

	}
}
