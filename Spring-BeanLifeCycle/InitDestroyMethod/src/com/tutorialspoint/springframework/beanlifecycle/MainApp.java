package com.tutorialspoint.springframework.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Para registrar um shutdownhook usamos o metodo: {@link registerShutdownHook} que é declarado
 * quanto usamos a class {@link AbstractApplicationContext}. Ele é necessario para utilização
 * do shutdown e relevante para chamandas de metodos destroy.
 *  
 * @author daniel
 * @git
 */

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }
}