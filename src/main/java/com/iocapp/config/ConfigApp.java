package com.iocapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.iocapp.system.Activity;
import com.iocapp.system.Coding;

@Configuration
public class ConfigApp {
	{
		System.out.println("ConfigApp class loaded");
	}
    
	@Bean(name="coding")
    public Activity codingActivity() {
		return new Coding();
	}
}
