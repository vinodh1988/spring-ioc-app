package com.iocapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.iocapp.system.Activity;

@SpringBootApplication
public class SpringIocAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringIocAppApplication.class, args);
		System.out.println("Application started successfully");
		System.out.println("Bean count: " + ac.getBeanDefinitionCount());
		
		Activity activity = (Activity)ac.getBean("coding");
		activity.perform();
	}

}
 