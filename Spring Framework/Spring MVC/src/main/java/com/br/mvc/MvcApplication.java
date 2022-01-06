package com.br.mvc;

import com.br.mvc.service.PedidoService;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcApplication implements CommandLineRunner{
	
	private final  PedidoService pedidoService;

	public MvcApplication(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}


	public static void main(String[] args) {
		SpringApplication.run(MvcApplication.class, args);
	}

		@Override
		public void run(String... args) throws Exception {

			pedidoService.iniciar();
		}
}
