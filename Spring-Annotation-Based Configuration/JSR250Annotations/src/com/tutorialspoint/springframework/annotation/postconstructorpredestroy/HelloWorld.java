package com.tutorialspoint.springframework.annotation.postconstructorpredestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class HelloWorld {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		System.out.println("Your Message : " + message);
		return message;
	}

	@PostConstruct
	public void init() {
		System.out.println("Bean is going throuth init.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
}