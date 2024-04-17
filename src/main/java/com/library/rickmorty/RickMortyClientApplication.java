package com.library.rickmorty;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RickMortyClientApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RickMortyClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RickMortyClient client = new RickMortyClient();
		System.out.println(client.getCharacterById(1));
	}

}
