package com.messages.MessagesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.messages.service"})
public class MessagesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagesApiApplication.class, args);
	}
}
