package com.Joseph.ProjectBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import BeanDemo.HelloBean;

public class ProjectBeanApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml") ;  
		//responsible for instantiating, configuring, and assembling the beans.
		
		HelloBean hb=(HelloBean)context.getBean("hello"); //bean is made
		
		System.out.println("The bean:  "+ hb);
		System.out.println("The value of the bean:  " +hb.getMessage());
	}

}
