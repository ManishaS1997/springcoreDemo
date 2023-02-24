package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaConfig")
public class JavaConfig 
{
	//creating exam obj 
		@Bean("exam")
		public Exam getExamId()
		{
			return new Exam();
		}
		
	//creating student obj
	@Bean("student")
	public Student getStudent()
	{
		Student student=new Student(getExamId());
		return student;
		
	}
	
	

}
