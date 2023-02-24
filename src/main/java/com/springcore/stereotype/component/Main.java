package com.springcore.stereotype.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/component/SpringFile.xml");
		
		Student student=context.getBean("stud",Student.class);
		
		System.out.println(student);
		
		
		

	}

}
