package com.tutorialspoint.springframework.applicationcontextcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Class Principal Utilizando ApplicationContext Container
 * 
 * O Application Context é um avançado container do Spring. Similar ao
 * BeanFactory está carrega as definições do beans e dispensa uma requisição ao
 * bean. Adicionalmente, ele adiciona mais funcionalidade especifica , tais como
 * a habilidade para resolver mensagens textual de um arquivo de propriedade e
 * habilidade para publicar eventos de aplicativos para ouvir eventos dos
 * interresados. este container é definido pela interface
 * {@link org.springframework.context.ApplicationContext} .
 * 
 * O ApplicationContext contém toda as funcionalidade do BeanFactory. Geralmente
 * é recomendo utilizado ao inves do BeanFactory.
 * 
 * as implementaçoẽs vulgamente utilizadas pelo ApplicationContext são:
 * 
 * {@link FileSystemXmlApplicationContext} - Esta container carrega as
 * definições dos beans do XML. È necessario prover o CAMINHO COMPLETO do
 * arquivo XML com os nossos beans para o seu construtor.
 * 
 * {@link ClassPathXmlApplicationContext} - Está container carrega as definições
 * do beans do XML. Porém não há necessdade de passarmos todo o caminho do XML
 * para o seu construtor, mas necessitamos setar no CLASSPATH, pois é aonde o
 * container irá procurar pelo XML.
 * 
 * {@link XmlWebApplicationContext} - Esta container carrega o arquivo XML com a
 * definição de todos os beans dentro de um aplicação WEB.
 * 
 * @author daniel
 * @Email daniel.dias.analistati@gmail.com
 *
 */
public class MainApp {
 public static void main(String[] args) {
	ApplicationContext context = 
		new FileSystemXmlApplicationContext("/src/Beans.xml");
	
	HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	obj.getMessage();
 }
}