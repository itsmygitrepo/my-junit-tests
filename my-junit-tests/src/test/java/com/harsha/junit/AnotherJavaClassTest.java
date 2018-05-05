package com.harsha.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AnotherJavaClassTest {

	private AnotherJavaClass anotherJavaClass;
	
	@Test
	public void stringsShouldBeEqual() {
		anotherJavaClass = new AnotherJavaClass();
		assertEquals("Hello World!", anotherJavaClass.returnMessage());
	}
}
