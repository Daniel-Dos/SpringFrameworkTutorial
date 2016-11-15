package com.tutorialspoint.springframework.contextevents;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
@Configuration
public class AppConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

	@Bean
	public CStartEventHandler cStartEventHandler() {
		return new CStartEventHandler();
	}

	@Bean
	public CStopEventHandlerand cStopEventHandler() {
		return new CStopEventHandlerand();
	}
}