package com.techno.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan("com.techno")
@EnableWebMvc
public class AnnotationBasedDispatcherServlet {
	
	 @Bean
	 public LocalEntityManagerFactoryBean getFactory() {
	  LocalEntityManagerFactoryBean factory = new LocalEntityManagerFactoryBean();
	  factory.setPersistenceUnitName("Shopsinfo");
	  
	  return factory; 
	  }
	 
	
}
