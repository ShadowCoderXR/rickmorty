package com.library.rickmorty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RickMortyClientApplication implements CommandLineRunner {
	private final RickMortyClient client;

	@Autowired
	public RickMortyClientApplication(RickMortyClient client) {
		this.client = client;
	}

	public static void main(String[] args) {
		SpringApplication.run(RickMortyClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(client.getCharacterById(1));
	}

}
