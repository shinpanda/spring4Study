package com.newlecture.web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {//spring, service, security 등 설정을 배열로...
		// TODO Auto-generated method stub
		return new Class[] {
				WebApplicationContextConfig.class
		};
	}

	@Override
	protected String[] getServletMappings() { // url 매핑을 설정
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
