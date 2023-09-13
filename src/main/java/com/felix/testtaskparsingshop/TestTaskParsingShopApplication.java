package com.felix.testtaskparsingshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestTaskParsingShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTaskParsingShopApplication.class, args);
	}

}
