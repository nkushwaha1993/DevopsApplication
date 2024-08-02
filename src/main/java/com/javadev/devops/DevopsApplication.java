package com.javadev.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsApplication {

	public static void main(String[] args) {
		System.setProperty("server.port","8085");
		SpringApplication.run(DevopsApplication.class, args);
	}

}
