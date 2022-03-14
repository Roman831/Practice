package com.cg.maheshroman1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student mahesh = context.getBean("student",Student.class);
		mahesh.displayStudentInfo();
		
		Student roman = context.getBean("roman",Student.class);
		roman.displayStudentInfo();
	}

}
