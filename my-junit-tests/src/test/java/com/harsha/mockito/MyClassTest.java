package com.harsha.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Iterator;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void testMyClassMethod() {
		MyClass test = mock(MyClass.class);
		when(test.getUniqueId()).thenReturn(43);
		assertEquals(43, test.getUniqueId());
	}	
	
	@Test
	public void testReturnHelloWorld() {
		MyClass test = mock(MyClass.class);
		when(test.returnHelloWorld()).thenReturn("Hello World!");
		assertEquals("Hello World!", test.returnHelloWorld());
	}
	
	@Test
	public void testMoreThanOneReturnValues() {
		Iterator<String> itr = mock(Iterator.class);
		when(itr.next()).thenReturn("Mockito").thenReturn("rocks");
		String result = itr.next() + " " + itr.next();
		assertEquals("Mockito rocks", result);
	}
}
