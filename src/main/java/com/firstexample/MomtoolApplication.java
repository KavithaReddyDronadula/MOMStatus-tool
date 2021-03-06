package com.firstexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"comm"})
@SpringBootApplication
public class MomtoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MomtoolApplication.class, args);
	}
}
