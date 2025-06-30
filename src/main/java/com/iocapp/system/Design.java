package com.iocapp.system;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("design")
@Primary
class Design implements ProjectTask {

	@Override
	public void execute() {
		System.out.println("Designing in progress...");
	}

}
