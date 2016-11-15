package com.tutorialspoint.springframework.javabasedconfiguration.specifyingbeanscope;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class Foo {

	private String message;

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}	
}