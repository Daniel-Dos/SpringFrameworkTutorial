package com.tutorialspoint.beanscope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Prototype Scope
 * Se setarmos o scope como prototype, o Spring IoC container cria um nova 
 * instancia do bean toda vez que é feita uma requisição especifica do bean.
 * Como regra, usa o scope prototype para todo state-full beans e Singleton scope para 
 * Stateless beans.
 *  
 * @author daniel
 * @email daniel.dias.analistati@gmail.com
 */
public class MainApp {
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("Prototype.xml");
    
    HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
    objA.setMessage("I'm object A");
    objA.getMessage();
    
    HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
    objB.setMessage("I'm object B");
    objB.getMessage();
    }
}
