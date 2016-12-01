package com.tutorialspoint.springframework.logging.jakarta;

/**
 * @author daniel
 * Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 */
public class HelloWorld {

	private String message;

	public void getMessage() {
		System.out.println("Your Message :" + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}