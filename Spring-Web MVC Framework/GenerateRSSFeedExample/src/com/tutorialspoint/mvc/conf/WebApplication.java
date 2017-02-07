package com.tutorialspoint.mvc.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;

import com.tutorialspoint.mvc.RSSView;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages= {"com"})
public class WebApplication extends WebMvcConfigurerAdapter {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
	BeanNameViewResolver resolver = new BeanNameViewResolver();
	registry.viewResolver(resolver);
    }

    @Bean
    public RSSView rssView() {
	return new RSSView();
    }
}