package com.client.ClientAppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.client.controller.ClientController;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(basePackageClasses = {ClientController.class})
public class ClientApppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApppApplication.class, args);
		System.out.println("GO!!!");
	}
}
