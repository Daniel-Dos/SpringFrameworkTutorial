package com.tutorialspoint.springframework.javabasedconfiguration.configurationbeanannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */

@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}