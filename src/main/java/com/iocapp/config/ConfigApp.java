package com.iocapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.iocapp.system.Activity;
import com.iocapp.system.Coding;
import com.iocapp.system.Documenting;

@Configuration
public class ConfigApp {
	{
		System.out.println("ConfigApp class loaded");
	}
    
	@Bean(name="coding")
	@Scope("prototype") // This ensures a new instance is created each time
    public Activity codingActivity() {
		return new Coding();
	}
	
	@Bean(name="documenting")
	@Scope("prototype") // This ensures a new instance is created each time
	public Activity documentingActivity() {
		return new Documenting();
	}
	
}
