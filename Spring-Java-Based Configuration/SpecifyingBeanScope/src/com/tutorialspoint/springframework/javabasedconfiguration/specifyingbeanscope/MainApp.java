package com.tutorialspoint.springframework.javabasedconfiguration.specifyingbeanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Foo foo = context.getBean(Foo.class);
		foo.setMessage("Daniel Dias");
		foo.getMessage();
		
		Foo foo2 = context.getBean(Foo.class);
		foo2.setMessage("Dos Santos");
		foo2.getMessage();
	}
}