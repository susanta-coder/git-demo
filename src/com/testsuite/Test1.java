package com.testsuite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class Test1 {
String message="susanta";
MessageUtil mess=new MessageUtil(message);

//@Ignore
@Test(timeout = 500)
public void testPrintMessage() {
	System.out.println("Inside testPrint method");
	assertEquals(message, mess.printMessage());
	
}
}
