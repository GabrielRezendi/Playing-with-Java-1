package com.br.mvc.model.Security.Database;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "authorities")
public class Autoridade {

  @NotBlank
  @Id
  private String nome;

  @NotBlank 
  @Column (name = "authority")
  @Enumerated(EnumType.STRING)
  private AutoridadeStatus autoridade;

  @MapsId
  @OneToOne (cascade = CascadeType.ALL)
  @JoinColumn(name = "username")
  private Usuario usuario;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public AutoridadeStatus getAutoridade() {
    return this.autoridade;
  }

  public void setAutoridade(AutoridadeStatus autoridade) {
    this.autoridade = autoridade;
  }


  

   



}