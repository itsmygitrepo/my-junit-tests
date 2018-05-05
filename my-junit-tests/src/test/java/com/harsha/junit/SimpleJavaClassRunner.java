package com.harsha.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SimpleJavaClassRunner {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(SimpleJavaClassTest.class);
		
		for(Failure failure: result.getFailures()) {
			System.out.println("Failure: " + failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}

}

