package com.spring.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BacanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BacanosApplication.class, args);
	}

}
