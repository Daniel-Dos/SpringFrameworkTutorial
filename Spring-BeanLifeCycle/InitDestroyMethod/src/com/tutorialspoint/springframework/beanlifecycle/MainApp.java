package com.tutorialspoint.springframework.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Se você estiver usando contêiner IoC do Spring em um ambiente de aplicação não-web; por exemplo,
 *em um ambiente de desktop cliente rico, você registrar um gancho de encerramento com a JVM. fazendo
 *assim garante um desligamento normal e chama o relevantes destruir métodos em seu singleton
 *bean de modo que todos os recursos são liberados.
 * 
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