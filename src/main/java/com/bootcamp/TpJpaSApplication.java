package com.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
@EnableAutoConfiguration
@SpringBootApplication
public class TpJpaSApplication extends SpringBootServletInitializer {
	
	  @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(TpJpaSApplication.class);
	    }

	public static void main(String[] args) {
		SpringApplication.run(TpJpaSApplication.class, args);
	}
}
