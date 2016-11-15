package com.tutorialspoint.springframework.javabasedconfiguration.importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */

@Configuration
public class ConfigA {

	@Bean
	public A a() {
		return new A();
	}
}