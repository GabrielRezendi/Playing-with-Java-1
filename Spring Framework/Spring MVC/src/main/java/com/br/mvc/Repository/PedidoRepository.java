package com.br.mvc.Repository;

import java.util.List;

import com.br.mvc.model.Pedido;
import com.br.mvc.model.StatusPedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Integer> {
    List<Pedido> findByStatus(StatusPedido status);
}
