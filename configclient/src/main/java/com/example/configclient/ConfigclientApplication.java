package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope
@RestController
public class ConfigclientApplication {

	@Value("${message:Hello default}")
	private String message;

	@RequestMapping("/message")
	String getMessage() {
		return this.message;
	}

	public static void main(final String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}

}
