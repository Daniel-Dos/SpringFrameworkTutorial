package com.tutorialspoint.springframework.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *  Classe Principal que ira executar o Beans.xml configurado.
 */
public class MainApp {
	public static void main(String[] args) {

		/*
		 *  {@link ClassPathXmlApplicationContext} , est� api carrega o arquivo de
		 *  configura��o dos beans e eventualmente baseando na Provider API.
		 *  Nisto ela cria e inicializa TODOS os objetos em que os beans foram mencionados
		 *  no arquivo de configura��o.
		 */
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		/*
		 *  Cria um novo Objeto, recuperando o Bean passado no
		 *  context do XML e instanciando. O metodo getBean � usado para
		 *  retornar o objeto generico o seu ID do bean. Uma vez que tenhamos
		 *  um objeto, podemos usar esse objeto ara chamar qualquer metodo da classe.
		 */

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage(); // Exibe a Menssagem.
	}
}