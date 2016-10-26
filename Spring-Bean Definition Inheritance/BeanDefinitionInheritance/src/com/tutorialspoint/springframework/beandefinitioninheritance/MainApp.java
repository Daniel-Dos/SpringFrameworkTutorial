package com.tutorialspoint.springframework.beandefinitioninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class MainApp {
    public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
	objA.getMessage1();
	objA.getMessage2();

	HelloBrasil objB = (HelloBrasil) context.getBean("helloBrasil");
	objB.getMessage1();
	objB.getMessage2();
	objB.getMessage3();
    }
}