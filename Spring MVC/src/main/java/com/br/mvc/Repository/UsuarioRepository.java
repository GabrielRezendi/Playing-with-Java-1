package com.br.mvc.Repository;

import com.br.mvc.model.Security.Database.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, String>{

  Usuario findByNome(String Nome);
  
}
