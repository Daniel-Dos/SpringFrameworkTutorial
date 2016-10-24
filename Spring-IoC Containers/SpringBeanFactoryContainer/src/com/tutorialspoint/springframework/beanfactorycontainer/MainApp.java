package com.tutorialspoint.springframework.beanfactorycontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *  Classe Principal 
 *  Utilizando BeanFactoryContainer - Est� container simplesmente prover suporte para DI 
 *  e defino pela interface {@link BeanFactory} .
 *  O BeanFactory e relacionado com as interfaces {@link BeanFactoryAware}, {@link InitializingBean},
 *  {@link DisposableBean}, estao presentes no Spring para propor compatibilidade com uma largo numero de 
 *  framework de terceiros que se integram com Spring.
 *  
 *  Quando um numero de implementa��es sao da interface BeanFactory esta vem direto fora da caixa com Spring.
 *  O mais utilizado no BeanFactory � a implementa��o da interface {@link XmlBeanFactory}.
 *  
 *  Este container ler a configura��o de metada do arquivo XML e usa ele para criar uma 
 *  configura��o completa do sistemas ou aplica��o.
 *  
 *  O BeanFactory � comumente utilizado quando os recurso s�o limitados como dispositivos moveis ou
 *  aplica��es baseadas em applets.
 *  
 *  @author daniel
 *  @Email daniel.dias.analistati@gmail.com
 *  
 */
public class MainApp {
    public static void main(String[] args) {
	
		/* cria um objeto fabrica e carrega o arquivo XML no ClassPathResource 
		 * para inicializar e criar todos os objetos.
		 */
        XmlBeanFactory factory  = new XmlBeanFactory(new ClassPathResource("Beans.xml"));

        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        obj.getMessage();
	}
}