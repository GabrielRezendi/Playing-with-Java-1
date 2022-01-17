package br.com.yann.calculadora.operacoes;

import br.com.yann.calculadora.operacoes.interfaces.Command;

public class Potencia implements Command {

  @Override
  public double executar(double num1, double num2) {
    return Math.pow(num1,num2);
  }
  
}
