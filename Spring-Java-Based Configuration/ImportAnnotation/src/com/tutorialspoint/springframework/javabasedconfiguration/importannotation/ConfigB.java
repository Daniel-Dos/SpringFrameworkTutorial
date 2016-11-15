package com.tutorialspoint.springframework.javabasedconfiguration.importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */

@Configuration
@Import(ConfigA.class)
public class ConfigB {

	@Bean
	public B b() {
		return new B();
	}
}
