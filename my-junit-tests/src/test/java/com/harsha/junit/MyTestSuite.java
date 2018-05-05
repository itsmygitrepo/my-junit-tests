package com.harsha.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	SimpleJavaClassTest.class,
	AnotherJavaClassTest.class
})
public class MyTestSuite {

	
}
