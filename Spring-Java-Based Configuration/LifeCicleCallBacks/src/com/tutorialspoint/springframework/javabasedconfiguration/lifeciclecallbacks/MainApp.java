package com.tutorialspoint.springframework.javabasedconfiguration.lifeciclecallbacks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class MainApp {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Foo foo = context.getBean(Foo.class);
		foo.message();
		context.registerShutdownHook();
	}
}