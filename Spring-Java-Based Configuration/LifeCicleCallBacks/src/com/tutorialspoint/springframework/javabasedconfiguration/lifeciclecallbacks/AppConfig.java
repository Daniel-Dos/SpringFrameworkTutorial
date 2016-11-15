package com.tutorialspoint.springframework.javabasedconfiguration.lifeciclecallbacks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */

@Configuration
public class AppConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Foo foo() {
		return new Foo();
	}
}