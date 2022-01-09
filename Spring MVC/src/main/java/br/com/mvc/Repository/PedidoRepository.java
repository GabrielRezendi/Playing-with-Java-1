package br.com.mvc.Repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.mvc.model.Pedido;
import br.com.mvc.model.StatusPedido;


@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Integer> {

    @Query("SELECT p FROM Pedido p JOIN p.usuario u WHERE u.nome = :nome ")
    List<Pedido> findByUsuario(@Param("nome") String nome);

    @Cacheable("pedidos")
    List<Pedido> findByStatus(StatusPedido entregue, Sort sort);
    
    @Query ("SELECT p FROM Pedido p JOIN p.usuario u WHERE u.nome= :nome AND p.status= :status")
    List<Pedido> findByStatusAndByUsuario(@Param("nome") String nome, @Param("status") StatusPedido status);

    
       
}





