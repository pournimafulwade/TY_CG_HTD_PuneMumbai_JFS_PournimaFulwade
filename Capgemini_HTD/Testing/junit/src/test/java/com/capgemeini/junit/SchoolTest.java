package com.capgemeini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchoolTest {

	 private School school;
	 
	 @BeforeEach
	 public void createObject() {
		 school = new School();
	 }//end of the createObject() 

	 @Test
	 public void testRegisterStudent() {
		 Student student = new Student("Dimple",78.09,'f');
		 Student stu = school.registerStudent(student);
		 assertEquals(1, stu.getId());
	 }//end of the testRegisterStudent()
	 
	 @Test
	 public void testRegisterStudentForNull() {
		 assertThrows(NullPointerException.class, ()->school.registerStudent(null));
	 }
}//end of the SchoolTest class
