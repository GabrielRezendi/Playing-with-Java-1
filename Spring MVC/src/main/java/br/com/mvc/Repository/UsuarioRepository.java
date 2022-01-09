package br.com.mvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mvc.model.Security.Database.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, String>{

  Usuario findByNome(String Nome);
  
}
