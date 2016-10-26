package com.tutorialspoint.springframework.beandefinitioninheritance;

import java.lang.annotation.Inherited;

/**
 *  Um dado de configuração de herança define um bean filho de 
 *  uma definição pai. A definição filho pode substituir alguns valores,
 *  ou adicionar outros,conforma a necessidade.
 *  
 *  Spring Bean Definition Inheritance não tem nada com a classe Java 
 *  {@link Inherited} mas o conceito é o mesmo. Podemos definir uma 
 *  definição de um bean pai como um template e outros beans filhos podem
 *  herdar a configuração requirida a partir do bean pai.
 *  
 *  Quando usamos a configuração de metadata baseado em XML, indicamos uma 
 *  definição bean filho usando o atributo pai, especificamente o bean pai 
 *  como valor deste atributo.
 *  
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class HelloWorld {

    private String message1;
    private String message2;

    public void setMessage1(String message1) {
	this.message1 = message1;
    }

    public void setMessage2(String message2) {
	this.message2 = message2;
    }

    public void getMessage1() {
	System.out.println("Your Message : " + message1);
    }

    public void getMessage2() {
	System.out.println("Your Message : " + message2);
    }
}