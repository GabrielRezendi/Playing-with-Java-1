package br.com.mvc.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.mvc.model.Security.Database.Usuario;

@Entity
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "nome_produto")
  private String nomeProduto;
  @Column(name = "valor_negociado")
  private BigDecimal valorNegociado;
  @Column(name = "data_da_entrega")
  private LocalDate dataDaEntrega;
  @Column(name = "url_produto")
  private String urlProduto;
  @Column(name= "descricao_produto", columnDefinition = "LONGTEXT")
  private String descricao;
  @Column(name = "url_imagem")
  private String urlImagem;
	@Enumerated(EnumType.STRING)
	private StatusPedido status;

  @ManyToOne ( fetch = FetchType.LAZY)
  @JoinColumn(name = "nome_usuario")
  private Usuario usuario;

  public Usuario getUsuario() {
    return this.usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

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
