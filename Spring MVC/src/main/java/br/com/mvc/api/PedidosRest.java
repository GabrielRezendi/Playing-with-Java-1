package br.com.mvc.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mvc.Repository.PedidoRepository;
import br.com.mvc.model.Pedido;
import br.com.mvc.model.StatusPedido;


@RequestMapping("api/pedidos")
@RestController
public class PedidosRest {

  @Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("aguardando")
	public List<Pedido> getPedidosAguardandoOfertas() {
		Sort sort = Sort.by("id").descending();
	
		
		return pedidoRepository.findByStatus(StatusPedido.AGUARDANDO, sort);
	}
  
}
