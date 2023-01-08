package com.flames.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({ "com.flames.controller", "com.flames.service", "com.flames.model" })
public class FlamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlamesApplication.class, args);

	}

}
