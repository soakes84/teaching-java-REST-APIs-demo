package com.theironyard.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestdemoApplication {

	public final String API_URL = "http://ufc-data-api.ufc.com/api/v1/us/fighters/490667.json"; //Free UFC API


	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}

	RestTemplate restTemplate = new RestTemplate();

	@Bean
	public String logFighter () {    //Here we are just console logging the information we pulled from the UFC API
									 //as json.

			UFCFighter fighter = restTemplate.getForObject(API_URL, UFCFighter.class);
			System.out.println("/****************/");
			System.out.println(fighter);
			System.out.println("/****************/");
			return "done";
	}
}
