package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
		
	EmployeeDao emp=ac.getBean("empDao",EmployeeDao.class);
	System.out.println("salary is "+emp.findempById());
	}

}
