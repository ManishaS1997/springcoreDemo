package com.spring.expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.SpelMessage;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/expression/springFile.xml");
		
		Demo demo=context.getBean("demo",Demo.class);
		
		System.out.println(demo);
		
		demo.doAddition(demo.getX(), demo.getY());
		
		SpelExpressionParser temp=new SpelExpressionParser();
		Expression expression= temp.parseExpression("22+20");
		System.out.println(expression.getValue());
		
	}

}
