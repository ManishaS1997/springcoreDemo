package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/AloneSpringFile.xml");
        
       /* Book book=(Book)context.getBean("book");
        
        System.out.println(book);*/
        
        
        Person person=(Person)context.getBean("person");
        
       System.out.println(person);
        
        System.out.println("***** Friends ***** ");
        
        System.out.println(person.getFriends());
        System.out.println("List Class: "+person.getFriends().getClass().getName());
        
        System.out.println("***** Fees ***** ");
        
        System.out.println(person.getFeeStructure());
     
        System.out.println("Map class: "+person.getFeeStructure().getClass().getName());
        
        System.out.println("***** Properties *****");
        
        System.out.println(person.getProperties());
    }
}
