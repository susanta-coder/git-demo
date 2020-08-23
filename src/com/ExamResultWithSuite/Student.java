package com.ExamResultWithSuite;

public class Student {
	private int rollno;
	private String name;
	private float mark;
	 String grade;
	public Student(int rollno, String name, float mark) {
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
	
	public String gradeCalulate() {
		if(mark<35) {
			grade="Fail Result";
			
		}else if(mark<50) {
			grade="Thired grade Result";
			
		}else if(mark<60) {
			grade="Second grade Result";
			
		}else if(mark<70) {
			grade="First grade Result";
			
		}else {
			grade="Distinct grade Result";
		}
		return grade;
	}
	
	public void display() {
		System.out.println("Roll No::"+rollno);
		System.out.println("Student Name::"+name);
		System.out.println("Student mark::"+mark);
		System.out.println("Student grade::"+grade);
	}
	
	

}
