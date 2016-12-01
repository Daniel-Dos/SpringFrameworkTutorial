package com.tutorialspoint.springframework.logging.log4j;

/**
 * @author daniel
 * Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 */
public class HelloWorld {

	private String message;

	public void setMessage(String messsage) {
		this.message = messsage;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}