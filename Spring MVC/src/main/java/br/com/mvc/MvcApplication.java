package br.com.mvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import br.com.mvc.service.PopularBanco;

@EnableCaching
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
