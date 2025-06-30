package com.iocapp.system;

import org.springframework.stereotype.Component;
@Component
class Design implements ProjectTask {

	@Override
	public void execute() {
		System.out.println("Designing in progress...");
	}

}
