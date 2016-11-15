package com.tutorialspoint.springframework.contextevents;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class MainApp {
	public static void main(String[] args) {

		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Let us raise a start event.
		context.start();

		HelloWorld obj =  context.getBean(HelloWorld.class);
		obj.setMessage("Hello World!");
		obj.getMessage();

		// Let us raise a stop event.
		context.stop();
	}
}