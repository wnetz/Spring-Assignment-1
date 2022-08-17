package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Student obj = (Student) context.getBean("student");
        Student obj = context.getBean(Student.class);
        System.out.println(obj);
    }
}
/*
public class Student
{
   private int id;
   private String name;
   private List<Phone> ph;
   private Address add;
}

public class Phone
{
   private String mob;
}

public class Address
{
  private String city;
  private String state;
  private String country;
  private String zipcode;
}
Above is your first Assignment for week 8. Guys use the above student, phone and address classes to demonstrate DI  using all three types of Spring Container configurations(XML, Annotation and Java Config).
Kindly complete the assignment and push it to your git and share the link for review.
Complete the Assignment 1 by Friday EOD
 */