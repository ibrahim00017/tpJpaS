package com.bootcamp.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bootcamp.rest.controllers.BailleurRestController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
//@PropertySource("classPath:swagger.properties")
@ComponentScan(basePackageClasses=BailleurRestController.class)
public class SwaggerConfig {
	private static final String SWAGGER_API_VERSION="1.0";
	private static final String LICENCE_TEXT="Licence";
	private static final String title="Service Bailleur ";
	private static final String description ="La documentation du service Bailleur";
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title(title)
				.description(description)
				.license(LICENCE_TEXT)
				.version(SWAGGER_API_VERSION)
				.build();
		
	}
    @Bean
    public Docket bailleurApi() { 
        return new Docket(DocumentationType.SWAGGER_2)        		
           .apiInfo(apiInfo())
           .pathMapping("/")
          .select()
          .apis(RequestHandlerSelectors.basePackage("com.bootcamp.rest.controller"))
          .paths(PathSelectors.regex("/bailleurs.*"))                          
          .build();                                           
    }

}
