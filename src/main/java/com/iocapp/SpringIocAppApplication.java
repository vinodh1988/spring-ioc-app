package com.iocapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.iocapp.system.Activity;
import com.iocapp.system.Junction;

@SpringBootApplication
public class SpringIocAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringIocAppApplication.class, args);
		System.out.println("Application started successfully");
		System.out.println("Bean count: " + ac.getBeanDefinitionCount());
		
		Activity activity = (Activity)ac.getBean("coding");
		activity.perform();
		Activity activity2 = (Activity)ac.getBean("coding");
		activity2.perform();
		Activity activity3 = (Activity)ac.getBean("coding");
		activity3.perform();
		
		Activity d1 = (Activity)ac.getBean("documenting");
		d1.perform();
		Activity d2 = (Activity)ac.getBean("documenting");
		d2.perform();
		Activity d3 = (Activity)ac.getBean("documenting");
		d3.perform();
		
		System.out.println("Hash code of activity: " + activity.hashCode());
		System.out.println("Hash code of activity2: " + activity2.hashCode());
		System.out.println("Hash code of activity3: " + activity3.hashCode());
		System.out.println("Hash code of d1: " + d1.hashCode());
		System.out.println("Hash code of d2: " + d2.hashCode());
		System.out.println("Hash code of d3: " + d3.hashCode());
		
		
		System.out.println("---------------------------------------------------");
		Junction junction = (Junction)ac.getBean("Junction");
		junction.executeTask();
		
	
	}
	

}
 