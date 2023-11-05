package com.pedroigor.Api.Imdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiImdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiImdbApplication.class, args);
	}

}
