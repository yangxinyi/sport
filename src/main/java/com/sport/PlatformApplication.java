package com.sport;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Wade on 2015/9/23.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@ImportResource({"classpath:app.xml"})
public class PlatformApplication {

    @Bean
    public InternalResourceViewResolver internalViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/pages/");
        resolver.setSuffix(".html");
        return resolver;
    }

	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setMaxFileSize(5242880);
		factory.setMaxRequestSize(5242880);
		return factory.createMultipartConfig();
	}

    public static void main(String[] args) {
        SpringApplication.run(PlatformApplication.class, args);
    }

}
