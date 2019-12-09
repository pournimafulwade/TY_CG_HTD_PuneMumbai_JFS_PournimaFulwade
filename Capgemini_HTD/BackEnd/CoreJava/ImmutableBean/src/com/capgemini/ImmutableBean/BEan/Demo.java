package com.capgemini.ImmutableBean.BEan;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		ById b1 = new ById();
		TreeSet<StudentBean> tr = new TreeSet<StudentBean>(b1);
		
		
		StudentBean s1 = new StudentBean();
		s1.setId(1);
		s1.setName("Anil");
		s1.setPercentage(65.20);
		s1.setGender('M');
		
		StudentBean s2 = new StudentBean();
		s2.setId(2);
		s2.setName("Smita");
		s2.setPercentage(75.30);
		s2.setGender('F');
		
		StudentBean s3 = new StudentBean();
		s3.setId(3);
		s3.setName("Raju");
		s3.setPercentage(52.21);
		s3.setGender('M');

		StudentBean s4 = new StudentBean();
		s4.setId(4);
		s4.setName("Divya");
		s4.setPercentage(86.40);
		s4.setGender('F');
		
		StudentBean s5 = new StudentBean();
		s5.setId(5);
		s5.setName("Mayuri");
		s5.setPercentage(85.75);
		s5.setGender('F');
		

		tr.add(s1);
		tr.add(s2);
		tr.add(s3);
		tr.add(s4);
		tr.add(s5);
		
		for(StudentBean b : tr) {
			System.out.println("Id id :"+b.getId());
			System.out.println("Name is :" +b.getName());
			System.out.println("Percentage is : " +b.getPercentage());
			System.out.println("Gender is :" +b.getGender());
			
			}
		}
	}
