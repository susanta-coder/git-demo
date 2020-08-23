package com.ExamResultWithSuite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test6 {
	
	@Test
	public void testFailResult() {
		Student s=new Student(1,"Susanta",29);
		System.out.println("Inside testFailResult method");
		s.gradeCalulate();
		assertEquals(s, s.grade);
		s.display();
		
	}
	
	@Test
	public void testPassResult() {
		Student s1=new Student(2,"Rasana",45);
		System.out.println("Inside testPassResult method");
		s1.gradeCalulate();
		assertEquals(s1, s1.grade);
		s1.display();
		
	}
	
	
	@Test
	public void testSecondResult() {
		Student s2=new Student(3,"Hemant",55);
		System.out.println("Inside testSecondResult method");
		s2.gradeCalulate();
		assertEquals(s2, s2.grade);
		s2.display();
		
	}
	
	@Test
	public void testFirstResult() {
		Student s3=new Student(1,"Saroj",67);
		System.out.println("Inside testFirstResult method");
		s3.gradeCalulate();
		assertEquals(s3, s3.grade);
		s3.display();
		
	}
	

}
