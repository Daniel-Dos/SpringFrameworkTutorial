package com.tutorialspoint.springframework.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *  Bean Life Cycle
 *  
 *  O ciclo de vida do Spring Bean é facil de ser compreendido. Quando um bean
 *  é instanciado, este é requisitado para sua inicialização, ele é recuperado e entra
 *  no estado de  uso. Similarmente, quando o bean não é mais requirido ele é removido do 
 *  container, logo depois faz uma limpeza.
 *  
 *  Para definir a iniciarlização ou destruição para o bean, nos simplesmente 
 *  declaramos no paramentro do<bean> init-method e/ou destroy-method. 
 *  O init-method especifica um atributo de metodo que chama o bean imediatamente apos sua instancialização.
 *  Enquanto, destroy-method é um metodo especifico para chamar antes de um bean ser removido do container.
 *  
 *  
 *  <h3>Initialization CallBacks</h3>
 *  
 *  A interface {@link InitializingBean} especifica um unico methodo: 
 *  {@code void afterPropertiesSet() throws Exception;} ele simplesmente implementa a interface
 *  e inicializa o trabalho dentro do metodo.
 *  No caso de uma configuração baseada em XML , utilizamos o init-method, especificando um nome de um
 *  metodo vazio e sem argumento.  
 *  
 *  <h3>Destruction CallBacks</h3>
 *   
 *   A interface {@link DisposableBean} espeficia um unico metodo:
 *   {@code void destroy() throws Exception}, ele simplemente implementa e finaliza o trabalho 
 *   dentro do metodo destroy().
 *   No caso de uma configuração baseada em XML , utilizamos o init-method, especificando um nome de um
 *   metodo vazio e sem argumento. 
 *  
 * @author daniel
 * @git
 */
public class HelloWorld {
    private String message;
    
    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
    	System.out.println("Your Message : " + message);
    }

    public void init() {
        System.out.println("Bean is going through init.");
    }

    public void destroy() {
    	System.out.println("Bean will destroy now.");
    }
}