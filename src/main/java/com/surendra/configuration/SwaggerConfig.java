package com.surendra.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration  //it is used to configure java class as spring class
@EnableSwagger2 //to enable swagger functionality
public class SwaggerConfig {
	@Bean  //to represent Docket as a spring bean
	public Docket restApi()  //this Docket will implement Documentation type interface which is used to generate documentation for our api(by giving base pcg name)
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.surendra.controller"))
				.build();
	}

}
