package com.tutorialspoint.springframework.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.core.Ordered;

/**
 * 
 * A interface {@link BeanPostProcessor} define metodos de callBack onde podemos 
 * fornecer nossa propria instanciação logica, dependencia-resolução logica, etc.
 * Podemos implementar algumas logicas customizada depois o Spring container termina
 * instancializações,configurações e inicializações de um bean ao ligar em um ou mais
 * BeanPostProcessor implementados.
 * 
 * Podemos configurar multiplas interfaces BeanPostProcessor e controlar a ordem em que
 * esses BeanPostProcessor irao ser executado atraves da configuração da propriedade order 
 * que fornecida da BeanPostProcessor a implementação da interface {@link Ordered}. 
 * 
 * O BeanPostProcessor opera em bean/objeto instancias, que significa que o 
 * Spring IoC container instancia uma instancia do bean e entao a interface 
 * BeanPosProcessor trabalha eles.
 * 
 * Uma {@link ApplicationContext} automaticamente detecta alguns beans que são definidos com
 * a implementação da interface e registra esses beans como post-processor, para então
 * chama-lo apropriadamente pelo container sobre a criação do bean.
 * 
 * Este é um exemplo basico de implementação do {@link BeanPostProcessor},
 * na qual imprime o nome de um bean antes e depois da inicialização de qualquer bean.
 * Podemos implementar uma logica mais complexa  para antes e depois da instancialização de um bean,
 * porque temos um acesso ao objeto bean dentro de ambos metodos post processor.
 * 
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class InitHelloWorld implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException { // BeforeInitialization
        // TODO Auto-generated method stub
        System.out.println("BeforeInitialization : " + beanName);
        return bean; // podemos retornar um outro objeto qualquer tambem.
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException { // AfterInitialization
        // TODO Auto-generated method stub
        System.out.println("AfterInitialization : "+ beanName);
        return bean; // Podemos retornar um outro objeto qualquer tambem.
    }
}