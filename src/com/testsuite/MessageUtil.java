package com.testsuite;

public class MessageUtil {
	private String message;

	public MessageUtil(String message) {
		this.message = message;
	}
	
	//print the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	//print hi added inside this message
	public String printSolutionMessage() {
		message="HI"+message;
		System.out.println(message);
		return message;
		
	}
	
	

}
