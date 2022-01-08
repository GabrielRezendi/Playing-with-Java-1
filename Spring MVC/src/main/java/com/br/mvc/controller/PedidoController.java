package com.br.mvc.controller;

import javax.validation.Valid;

import com.br.mvc.Repository.PedidoRepository;
import com.br.mvc.Repository.UsuarioRepository;
import com.br.mvc.dto.RequisicaoNovoPedido;
import com.br.mvc.model.Pedido;
import com.br.mvc.model.Security.Database.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {

  @Autowired
  private PedidoRepository pedidoRepository;
  
  @Autowired
  private UsuarioRepository usuarioRepository;

  @GetMapping("formulario")
  public String formulario (RequisicaoNovoPedido requisicao){
      return "pedido/formulario";
  }
  
  @PostMapping("novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
		if (result.hasErrors()){
      return "pedido/formulario";
    }
    String usuarioAtivo = SecurityContextHolder.getContext().getAuthentication().getName();
    Usuario usuario = usuarioRepository.findByNome(usuarioAtivo);
    Pedido pedido = requisicao.toPedido();
		pedido.setUsuario(usuario);
    pedidoRepository.save(pedido);
		return "redirect:/home";
	}

 }

