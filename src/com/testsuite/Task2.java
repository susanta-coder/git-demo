package com.testsuite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Task2 {
	String message="susanta";
	MessageUtil mess=new MessageUtil(message);

	@Test
	public void testSolutionMessage() {
		System.out.println("Inside testSolutionMessage method");
		message="HI "+message;
		assertEquals(message, mess.printSolutionMessage());
		
	}
}
