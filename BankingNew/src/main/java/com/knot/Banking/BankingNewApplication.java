package com.knot.Banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//@EnableWebSecurity
@Configuration
@SpringBootApplication
@EntityScan(basePackages = "com.knot.Banking.Model")

public class BankingNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingNewApplication.class, args);
	}

}
