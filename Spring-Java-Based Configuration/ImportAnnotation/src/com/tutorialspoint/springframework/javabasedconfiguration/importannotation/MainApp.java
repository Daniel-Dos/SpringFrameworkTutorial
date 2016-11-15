package com.tutorialspoint.springframework.javabasedconfiguration.importannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigB.class);

		// now both beans A and B will be available....
		A a = context.getBean(A.class);
		B b = context.getBean(B.class);
		a.messageA();
		b.messageB();
	}
}