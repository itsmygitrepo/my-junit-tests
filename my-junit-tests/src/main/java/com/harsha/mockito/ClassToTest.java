package com.harsha.mockito;

public class ClassToTest {

	private final MyDatabase database;
	
	public ClassToTest(MyDatabase database) {
		this.database = database;
	}
	
	public boolean query(final String query) {
		return true;
	}
}
