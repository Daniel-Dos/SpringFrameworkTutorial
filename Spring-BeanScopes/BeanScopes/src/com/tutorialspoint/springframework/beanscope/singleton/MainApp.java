package com.tutorialspoint.springframework.beanscope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Singleton Scope
 * Se um scope é setado como singleton, o Spring IoC containe cria exatamente uma instancia
 * do objeto definido para esse bean. Está única instancia é armazenada em um cache, e toda
 * requisição subsequente e referencia para o nome do bean retorna o objeto do cache.
 *
 * Por padrão o scope é sempre singleton. Quando necessitamos mais de um bean, setamos a
 * propriedade scope como singleton no arquivo de configuração.
 * @author daniel
 * @email daniel.dias.analistati@gmail.com
 *
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Singleton.xml");
 
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I 'm object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();
    }
}