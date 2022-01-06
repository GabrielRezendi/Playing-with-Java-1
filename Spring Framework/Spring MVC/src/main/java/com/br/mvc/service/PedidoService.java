package com.br.mvc.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.br.mvc.Repository.PedidoRepository;
import com.br.mvc.model.Pedido;
import com.br.mvc.model.StatusPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

  @Autowired
  private PedidoRepository res;

  public void iniciar() {
    Pedido[] pedido = {new Pedido(), new Pedido(), new Pedido()};
    pedido[0].setNomeProduto("Obra completa - Murilo Rubião");
    pedido[0].setDataDaEntrega(LocalDate.now());
    pedido[0].setUrlProduto("https://www.amazon.com.br/gp/product/8535927565/ref=ppx_yo_dt_b_asin_title_o00_s00?ie=UTF8&psc=1");
    pedido[0].setDescricao("Murilo Rubião se aventurou no universo do fantástico antes que o gênero ficasse em voga entre os escritores latino-americanos. Além de precursor ― seus contos foram escritos, em sua maioria, entre os anos 1940 e 1960 ―, Rubião é mestre em fazer o absurdo penetrar na realidade cotidiana, subvertendo-a e lançando novos olhares sobre temas consagrados da literatura, como o desejo, a morte, o amor e a falta de sentido do mundo moderno. Este volume celebra o centenário do nascimento de Rubião com todos os 33 contos que o autor mineiro lapidou à exaustão. Completam a edição um delicioso artigo de época do crítico Jorge Schwartz e um alentado ensaio inédito do jovem escritor Carlos de Brito e Mello.");
    pedido[0].setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/81txRw4XfSL.jpg");
    pedido[0].setValorNegociado(new BigDecimal("31.06"));
    pedido[0].setStatus(StatusPedido.AGUARDANDO);

    res.save(pedido[0]);

    pedido[1].setNomeProduto("COPO EVERYDAY STANLEY 0,296L - MAPLE");
    pedido[1].setDataDaEntrega(LocalDate.now());
    pedido[1].setUrlProduto("https://www.amazon.com.br/COPO-EVERYDAY-STANLEY-296L-MAPLE/dp/B09HSYLYDH/");
    pedido[1].setDescricao("Preserva o estilo aventureiro, mas sem abrir mão da descontração? Parabéns, porque fizemos este Copo EVERYDAY Stanley pensando em você! Resistente, durável e atemporal, com preservação térmica de até 4 horas, parede dupla com isolamento a vácuo."+System.lineSeparator()+
    "Feito para acompanhar as aventuras da sua legião. Funcional, moderno, versátil, com 3 cores incríveis e uma tampa de acrílico que permite o gole ideal. Versátil para que a sua diversão seja lendária! Seja com vinho, gim, caipirinha, refrigerante ou suco, o Copo Everyday deixa a sua bebida favorita gelada até o último gole."+System.lineSeparator()+
    "Feito em aço inox 18/8"+System.lineSeparator()+
    "Capacidade de 0,296 L"+System.lineSeparator()+
    "Garantia vitalícia"+System.lineSeparator()+
    "Corpo com parede dupla e isolamento a vácuo");
    pedido[1].setUrlImagem("https://m.media-amazon.com/images/I/51KGnhhTYUL._AC_SL1500_.jpg");
    pedido[1].setValorNegociado(new BigDecimal("179.90"));
    pedido[1].setStatus(StatusPedido.APROVADO);

    res.save(pedido[1]);

    pedido[2].setNomeProduto("Homem-Aranha: A Saga Do Devorador De Pecados: Marvel Vintage ");
    pedido[2].setDataDaEntrega(LocalDate.now());
    pedido[2].setUrlProduto("https://www.amazon.com.br/Homem-aranha-Devorador-Pecados-marvel-Vintage/dp/6555128003");
    pedido[2].setDescricao("Ele é o Devorador de Pecados, o homem que toma para si todos os pecados do mundo, matando todo pecador que vê pela frente - e ele os vê em toda parte! Mas o perigoso lunático pode ter ido longe demais quando tirou a vida de uma grande amiga do Homem-Aranha: a Capitã Jean DeWolff, do Departamento de Polícia de Nova York! Como o enlutado herói aracnídeo vai perseguir um vilão com alvos em todo lugar que vai? Junte-se ao Escalador de Paredes numa busca frenética por Nova York que culminará num momento pivotal entre dois dos maiores heróis mascarados da cidade: Homem-Aranha e Demolidor!");
    pedido[2].setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/51den02WoPL.jpg");
    pedido[2].setValorNegociado(new BigDecimal("55.92"));
    pedido[2].setStatus(StatusPedido.ENTREGUE);

    res.save(pedido[2]);
  
  }
  
}
