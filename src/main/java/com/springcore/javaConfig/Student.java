package com.springcore.javaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class Student 
{
	
	private Exam exam;
	
	
	Student()
	{
		
	}
	public Exam getExam() {
		return exam;
	}



	public void setExam(Exam exam) {
		this.exam = exam;
	}



	public Student(Exam exam) {
		super();
		this.exam = exam;
	}



	public void study()
	{
		this.exam.getExamTimeTable();
		System.out.println("Student is doing homework!.. ");
		
		
	}
	
	

}
