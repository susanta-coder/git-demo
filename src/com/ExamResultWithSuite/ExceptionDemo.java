package com.ExamResultWithSuite;

import org.junit.Before;
import org.junit.Test;

public class ExceptionDemo {
int a,b,c;

@Before
public void setUp() {
	a=10;
	b=0;
}

@Test(expected=java.lang.ArithmeticException.class)
public void test() {
	c=a /b;
	System.out.println(c);
	
}

}
