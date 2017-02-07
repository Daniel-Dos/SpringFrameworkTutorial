package com.tutorialspoint.mvc.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
	// TODO Auto-generated method stub
	return null;
    }

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses()
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
	// TODO Auto-generated method stub
	return new Class[] {WebApplication.class};
    }

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
     */
    @Override
    protected String[] getServletMappings() {
	// TODO Auto-generated method stub
	return new String[] {"/"};
    }
}