package com.mysupermarket.oauthservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysupermarket.service.MyService;

import lombok.AllArgsConstructor;

@SpringBootApplication (scanBasePackages = "com.mysupermarket")
@RestController
@AllArgsConstructor
public class OauthServiceApplication {
	
	private final MyService myService;
	public static void main(String[] args) {
		SpringApplication.run(OauthServiceApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return myService.message();		
	}

}
