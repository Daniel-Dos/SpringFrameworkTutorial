package com.tutorialspoint.springframework.annotation.autowired.constructors;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class SpellChecker {

	public SpellChecker() {
		System.out.println("Inside SpellChecker constructor");
	}

	public void checkSpelling() {
		System.out.println("Inside checkSpelling");
	}
}