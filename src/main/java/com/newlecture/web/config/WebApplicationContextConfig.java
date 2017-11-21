package com.newlecture.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("com.newlecture.web.controller")
public class WebApplicationContextConfig extends WebMvcConfigurerAdapter{ //servlet-Context.xml 역할
	
}
