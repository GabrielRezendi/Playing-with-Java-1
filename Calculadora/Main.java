package playing.calculadora;

import java.util.*;

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
        
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
      
        switch (operador){
            case '*':
                System.out.println(calculadora.multiplication(num[0], num[1]));
            break;
            case '/': 
                System.out.println(calculadora.division(num[0], num[1]));
            break;
            case '+': 
                System.out.println(calculadora.addition(num[0], num[1]));
            break;
            case '-': 
                System.out.println(calculadora.substraction(num[0], num[1]));
            break;
            case '^':
               System.out.println(calculadora.exponential(num[0], num[1]));
            default: 
                System.out.println("Operador invalido");
            break;
        }
    }   

}


