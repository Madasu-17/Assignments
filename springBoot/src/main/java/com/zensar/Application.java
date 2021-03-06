package com.zensar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Ram");
		SpringApplication.run(Application.class, args);
		System.out.println("Done...!!!");
	}
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
