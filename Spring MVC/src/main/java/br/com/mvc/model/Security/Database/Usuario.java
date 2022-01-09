package br.com.mvc.model.Security.Database;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.mvc.model.Pedido;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table (name = "users")
public class Usuario {
  
  @Id
  @Column (name="username")
  private String nome;
  @Column (name="password")
  private String senha;
  @NotNull
  private boolean enabled;

  @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "usuario")
  private List<Pedido> listaPedidos;

  @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuario")
  private Autoridade autoridade;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSenha() {
    return this.senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public boolean isEnabled() {
    return this.enabled;
  }

  public boolean getEnabled() {
    return this.enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }
  
  

}
