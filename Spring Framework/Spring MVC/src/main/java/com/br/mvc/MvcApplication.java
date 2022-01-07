package com.br.mvc;

import com.br.mvc.service.PopularBanco;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcApplication implements CommandLineRunner{
	
	private PopularBanco popularBanco;

	public MvcApplication(PopularBanco popularBanco) {
		this.popularBanco = popularBanco;
	}

	public static void main(String[] args) {
		SpringApplication.run(MvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		popularBanco.iniciar();

	}
}
