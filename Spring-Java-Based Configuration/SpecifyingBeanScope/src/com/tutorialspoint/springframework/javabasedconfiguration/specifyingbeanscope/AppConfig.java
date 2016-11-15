package com.tutorialspoint.springframework.javabasedconfiguration.specifyingbeanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */

@Configuration
public class AppConfig {

	@Bean
	@Scope("prototype")
	public Foo foo() {
		return new Foo();
	}
}