package com.tutorialspoint.springframework.javabasedconfiguration.lifeciclecallbacks;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class Foo {

	public void init() {
		System.out.println("Initializable.");
	}

	public void message() {
		System.out.println("Message.");
	}
	public void destroy() {
		System.out.println("Destroy");
	}
}