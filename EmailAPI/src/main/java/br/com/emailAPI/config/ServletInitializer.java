package br.com.emailAPI.config;

import org.springframework.boot.builder.SpringApplicationBuilder;

import br.com.emailAPI.EmailApiApplication;

public class ServletInitializer {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EmailApiApplication.class);
	}

}
