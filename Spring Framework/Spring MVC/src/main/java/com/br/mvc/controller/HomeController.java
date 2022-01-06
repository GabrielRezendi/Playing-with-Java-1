package com.br.mvc.controller;

import java.util.List;

import com.br.mvc.Repository.PedidoRepository;
import com.br.mvc.model.Pedido;
import com.br.mvc.model.StatusPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

	
	@Autowired
	private PedidoRepository repository;
	
	@GetMapping
	public String home(Model model) {
		List<Pedido> pedidos = repository.findAll();
		model.addAttribute("pedidos", pedidos);
		return "home"; 
	}

	@GetMapping ("/{status}")
	public String status (@PathVariable("status") String status, Model model){
		List<Pedido> pedidos = repository.findByStatus(StatusPedido.valueOf(status.toUpperCase()));
		model.addAttribute("status", status);
		model.addAttribute("pedidos", pedidos);
		return "home"; 
	}

	@ExceptionHandler(IllegalArgumentException.class)	
	public String OnError(){
		return "redirect:/home";
	}
}

