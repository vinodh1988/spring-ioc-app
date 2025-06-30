package com.iocapp.system;

import org.springframework.stereotype.Component;

@Component("analysis")
public class Analysis implements ProjectTask {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Analysis in progress...");
	}



}
