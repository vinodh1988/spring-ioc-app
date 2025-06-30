package com.iocapp.system;

import org.springframework.beans.factory.annotation.Autowired;

public class Junction {
  @Autowired
  //@Qualifier("analysis")
  private ProjectTask projectTask;
  
  public void executeTask() {
	System.out.println("Executing task at the junction...");
	projectTask.execute();
  }
}
