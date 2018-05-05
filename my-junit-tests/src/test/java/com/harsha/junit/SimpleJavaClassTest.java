package com.harsha.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleJavaClassTest {

	private SimpleJavaClass simpleJavaClass;
	
	@Test
	public void stringsShouldMatch() {
		simpleJavaClass = new SimpleJavaClass();
		assertEquals("Hello World!", simpleJavaClass.returnHelloWorldMsg());
		
	}
}
