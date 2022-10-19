package com.sriteja.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = {"com.sriteja.api.repository"})
public class CompanyDetailsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyDetailsApiApplication.class, args);
	}

}
