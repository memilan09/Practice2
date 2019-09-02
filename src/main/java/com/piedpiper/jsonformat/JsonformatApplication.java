package com.piedpiper.jsonformat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class JsonformatApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonformatApplication.class, args);
	}

}
