package com.tutorialspoint.springframework.beanfactorycontainer;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *  Classe Principal 
 *  Utilizando BeanFactoryContainer - Esté container simplesmente prover suporte para DI 
 *  e defino pela interface {@link BeanFactory} .
 *  O BeanFactory e relacionado com as interfaces {@link BeanFactoryAware}, {@link InitializingBean},
 *  {@link DisposableBean}, estao presentes no Spring para propor compatibilidade com uma largo numero de 
 *  framework de terceiros que se integram com Spring.
 *  
 *  Quando um numero de implementações sao da interface BeanFactory esta vem direto fora da caixa com Spring.
 *  O mais utilizado no BeanFactory é a implementação da interface {@link XmlBeanFactory}.
 *  
 *  Este container ler a configuração de metada do arquivo XML e usa ele para criar uma 
 *  configuração completa do sistemas ou aplicação.
 *  
 *  O BeanFactory é comumente utilizado quando os recurso são limitados como dispositivos moveis ou
 *  aplicações baseadas em applets.
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
