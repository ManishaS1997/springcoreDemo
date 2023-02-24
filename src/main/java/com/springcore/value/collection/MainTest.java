package com.springcore.value.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/value/collection/spring.xml");
		
		Student student=context.getBean("student",Student.class);
	
		//System.out.println(student);
		
		//System.out.println(student.getPhoneNo());
		
		System.out.println("student1 "+student.hashCode());
		Student student2=context.getBean("student",Student.class);
		System.out.println("student2 "+student2.hashCode());
		
		Teacher teach1= context.getBean("teacher",Teacher.class);
		
		System.out.println("Teacher1 "+teach1.hashCode());
		Teacher teach2= context.getBean("teacher",Teacher.class);
		System.out.println("Teacher2 "+teach2.hashCode());
		
	}

}
