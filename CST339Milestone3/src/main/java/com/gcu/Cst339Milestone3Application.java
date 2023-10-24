package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gcu"})
public class Cst339Milestone3Application {

	public static void main(String[] args) {
		SpringApplication.run(Cst339Milestone3Application.class, args);
	}

}
