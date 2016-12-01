/**
 * 
 */
package com.tutorialspoint.springframework.logging.jakarta;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author daniel
 * Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 */
public class MainApp {

	static Log log = LogFactory.getLog(MainApp.class.getName());

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		log.info("Going to create HelloWorld Obj");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

		log.info("Exiting the program");
	}
}
