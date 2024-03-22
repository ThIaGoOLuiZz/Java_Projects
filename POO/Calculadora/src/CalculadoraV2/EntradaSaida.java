package CalculadoraV2;

import java.util.Scanner;

public class EntradaSaida {
    public static double solicitaNumero(String ordem){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o " + ordem + " número: ");
        return sc.nextInt();
    }

    public static int solicitaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.println();

        return sc.nextInt();
    }

    public static void mostraResultado(double resultado, int operacao){
        String op = "";

        if(operacao==1)
        {
            op = "soma";
        }
        else if(operacao==2)
        {
            op = "subtração";
        }
        else if(operacao==3)
        {
            op = "multiplicação";
        }
        else
        {
            op = "divisão";
        }

        System.out.println("O resultado da " + op + " é " + resultado);
    }
}
