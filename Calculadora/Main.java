package com.calculadora;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        double[] num = new double[2];
        char operador;

        System.out.print ("Informe o primeiro numero: ");
        num[0] = sc.nextDouble();
        System.out.print ("Informe o segundo numero: ");
        num[1] = sc.nextDouble();
        System.out.print ("Informe o operador [+, -, /, *]: ");
        operador = sc.next().charAt(0);
        
        Calculate calculadora = new Calculate();
      
        switch (operador){
            case '*':
                System.out.println(calculadora.multiplication(num[0], num[1]));
            break;
            case '/': 
                System.out.println(calculadora.division(num[0], num[1]));
            break;
            case '+': 
                System.out.println(calculadora.sum(num[0], num[1]));
            break;
            case '-': 
                System.out.println(calculadora.substraction(num[0], num[1]));
            break;
            default: 
                System.out.println("Operador invalido");
            break;
        }
    }   

}

