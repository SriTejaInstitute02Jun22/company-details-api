package com.sriteja.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration	//CompanyDetailsConfig companyDetailsConfig = new CompanyDetailsConfig();
public class CompanyDetailsConfig {

	
	@Bean  //RestTemplate restTemplate = new RestTemplate();
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
