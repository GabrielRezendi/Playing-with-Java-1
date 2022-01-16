package br.com.yann.calculadora;

import java.util.List;
import java.util.Scanner;


import br.com.yann.calculadora.operacoes.Divisao;
import br.com.yann.calculadora.operacoes.Multiplicacao;
import br.com.yann.calculadora.operacoes.Potencia;
import br.com.yann.calculadora.operacoes.Resto;
import br.com.yann.calculadora.operacoes.Soma;
import br.com.yann.calculadora.operacoes.Subtracao;
import br.com.yann.calculadora.operacoes.interfaces.Command;

public class CalculadoraCientifica {

  private List<Command> operacoes;
 
  public CalculadoraCientifica() {
    this.operacoes = List.of(
                              new Soma(),
                              new Subtracao(),
                              new Multiplicacao(),
                              new Divisao(),
                              new Resto(),
                              new Potencia()
                            );
  }

    
  void iniciar (){
    
    System.out.println("----Calculadora Cientifica----");
    
    int contador = 1;
    for (Command operacao : operacoes) {

      int ultimoOcorrenciaDePontoDoFQN = operacao.getClass().getName().lastIndexOf(".");
      String nomeClasse = operacao.getClass().getName().substring(ultimoOcorrenciaDePontoDoFQN+1);

      System.out.println(contador +" - "+ nomeClasse);
      contador++;
    }

    try (Scanner scanner = new Scanner(System.in)) {

      System.out.print("Informe sua opção: ");
      int indexOperacao = scanner.nextInt()-1;

      System.out.print("Informe o numero opção: ");
      double num1 = scanner.nextDouble();

      System.out.print("Informe o numero opção: ");
      double num2 = scanner.nextDouble();

      double resultado = operacoes.get(indexOperacao).executar(num1, num2);

      System.out.println("O resultado da operacao eh "+resultado);
    }

  }

}