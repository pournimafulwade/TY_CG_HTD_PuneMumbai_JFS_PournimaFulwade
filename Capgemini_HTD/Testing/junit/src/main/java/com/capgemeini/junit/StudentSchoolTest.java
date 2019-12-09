package com.capgemeini.junit;

public class StudentSchoolTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("punam",78.89,'f');
		
		Student s2 = new Student("Pournima",79.31,'f');
		
		School sc = new School();
		
//		sc.registerStudent(null);
		
		Student regStud = sc.registerStudent(s1);
		Student regStud2 = sc.registerStudent(s2);
		System.out.println("******** 1st Student Details**********");
		System.out.println("id is "+regStud.getId());
		System.out.println("Name is "+regStud.getName());
		System.out.println("Percentages is "+regStud.getPercentage());
		System.out.println("Gender is "+regStud.getGender());
		System.out.println("******** 2nd Student Details**********");
		System.out.println("Id is ="+regStud2.getId());
		System.out.println("Name is= "+regStud2.getName());
		System.out.println("Percentages is "+regStud2.getPercentage());
		System.out.println("Gender is "+regStud2.getGender());
		
		
	}

}
