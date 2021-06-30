package com.decathlon.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SimpleWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SimpleWebConfiguration.class};
    }
 
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
 
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/entry/*" };
    }
 
}
