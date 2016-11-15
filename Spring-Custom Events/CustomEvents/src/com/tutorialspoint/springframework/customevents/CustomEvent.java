package com.tutorialspoint.springframework.customevents;

import org.springframework.context.ApplicationEvent;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "My Custom Event";
	}
}