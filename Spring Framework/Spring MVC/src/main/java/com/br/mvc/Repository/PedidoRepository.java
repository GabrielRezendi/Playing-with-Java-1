package com.br.mvc.Repository;

import java.util.List;

import com.br.mvc.model.Pedido;
import com.br.mvc.model.StatusPedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Integer> {

    @Query("SELECT p FROM Pedido p JOIN p.usuario u WHERE u.nome = :nome ")
    List<Pedido> findByUsuario(@Param("nome") String nome);

    List<Pedido> findByStatus(StatusPedido status);
    
    @Query ("SELECT p FROM Pedido p JOIN p.usuario u WHERE u.nome= :nome AND p.status= :status")
    List<Pedido> findByStatusAndByUsuario(@Param("nome") String nome, @Param("status") StatusPedido status);
       
}
