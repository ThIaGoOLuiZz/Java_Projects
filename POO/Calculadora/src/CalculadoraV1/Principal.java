package CalculadoraV1;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continuar;
        double num1;
        double num2;
        int operacao;
        double resultado = 0;

        do
        {
            num1 = solicitaNumero("1º");
            num2= solicitaNumero("2º");
            System.out.println();
            operacao = solicitaOperacao();

            switch (operacao)
            {
                case 1:
                    resultado = calculaSoma(num1, num2);
                    break;

                case 2:
                    resultado = calculaSubtracao(num1, num2);
                    break;

                case 3:
                    resultado = calculaMultiplicacao(num1, num2);
                    break;

                case 4:
                    while(num2 == 0)
                    {
                        num2 = solicitaNumero("2º");
                    }
                    resultado = calculaDivisao(num1, num2);
                    break;

                default:
                    System.out.println("Operação inválida! A calculadora será encerrada!");
                    System.exit(0);
            }

            System.out.println();
            mostraResultado(resultado, operacao);
            System.out.println();

            System.out.println("Deseja continuar calculando? 1 - Sim | 2 - Não");
            continuar = sc.nextInt();
        }while (continuar == 1);

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
    public static double solicitaNumero(String ordem){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o " + ordem + " número: ");
        return sc.nextInt();
    }
    // METODO SOMA
    public static double calculaSoma(double num1, double num2){
        return num1+num2;
    }

    // METODO SUBTRAÇÃO
    public static double calculaSubtracao(double num1, double num2){
        return num1-num2;
    }

    // METODO MULTIPLICAÇÃO
    public static double calculaMultiplicacao(double num1, double num2){
        return num1*num2;
    }
    // METODO DIVISÃO
    public static double calculaDivisao(double num1, double num2){
        return num1/num2;
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
