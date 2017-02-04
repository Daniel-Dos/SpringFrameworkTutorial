package com.tutorialspoint.mvc.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.tutorialspoint.mvc.HelloController;
import com.tutorialspoint.mvc.WelcomeController;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages={"com"})
public class WebApplication extends WebMvcConfigurerAdapter {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/views/");
		internalResourceViewResolver.setSuffix(".jsp");
		registry.viewResolver(internalResourceViewResolver);
	}

	@Bean
	public HelloController helloController() {
		return new HelloController();
	}

	@Bean
	public WelcomeController welcomeController() {
		return new WelcomeController();
	}

	@Bean
	public ControllerClassNameHandlerMapping classNameHandlerMapping() {
		return new ControllerClassNameHandlerMapping();
	}
}