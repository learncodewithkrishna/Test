package com.spingcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       @SuppressWarnings("resource")
	ApplicationContext context=new ClassPathXmlApplicationContext("configxml.xml");
        Student Student1=(Student) context.getBean("Student1");
         Student Student2=(Student)context.getBean("Student2");
        System.out.println(Student1);
        System.out.println(Student2);
        System.out.println("gvghjdsjgfjsdghdsfdsgjj");
    }
}
