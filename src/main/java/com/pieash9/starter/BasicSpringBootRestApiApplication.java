package com.pieash9.starter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicSpringBootRestApiApplication implements CommandLineRunner {
	ProdDB prodDB;

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringBootRestApiApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		ProdDB prodDB = new ProdDB();
		System.out.println(prodDB.getData());
	}
}
