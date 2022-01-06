package com.br.mvc.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String nomeProduto;
  private BigDecimal valorNegociado;
  private LocalDate dataDaEntrega;
  private String urlProduto;
  @Column(columnDefinition = "LONGTEXT")
  private String descricao;
  private String urlImagem;
	@Enumerated(EnumType.STRING)
	private StatusPedido status;

  public StatusPedido getStatus() {
    return this.status;
  }

  public void setStatus(StatusPedido status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", nomeProduto='" + getNomeProduto() + "'" +
      ", valorNegociado='" + getValorNegociado() + "'" +
      ", dataDaEntrega='" + getDataDaEntrega() + "'" +
      ", descricao='" + getDescricao() + "'" +
      ", urlImagem='" + getUrlImagem() + "'" +
      "}";
  }
  public String getUrlProduto() {
    return this.urlProduto;
  }

  public void setUrlProduto(String urlProduto) {
    this.urlProduto = urlProduto;
  }
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNomeProduto() {
    return this.nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public BigDecimal getValorNegociado() {
    return this.valorNegociado;
  }

  public void setValorNegociado(BigDecimal valorNegociado) {
    this.valorNegociado = valorNegociado;
  }

  public LocalDate getDataDaEntrega() {
    return this.dataDaEntrega;
  }

  public void setDataDaEntrega(LocalDate dataDaEntrega) {
    this.dataDaEntrega = dataDaEntrega;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getUrlImagem() {
    return this.urlImagem;
  }

  public void setUrlImagem(String urlImagem) {
    this.urlImagem = urlImagem;
  } 

  

  
}
