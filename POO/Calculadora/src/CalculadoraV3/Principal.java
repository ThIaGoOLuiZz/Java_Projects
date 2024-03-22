package CalculadoraV3;

import java.util.Scanner;

public class Principal {

    private static Operacoes oper = new Operacoes();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continuar;
        double num1;
        double num2;
        int operacao;
        double resultado = 0;

        do
        {
            num1 = EntradaSaida.solicitaNumero("1º");
            num2= EntradaSaida.solicitaNumero("2º");
            System.out.println();
            operacao = EntradaSaida.solicitaOperacao();

            switch (operacao)
            {
                case 1:
                    resultado = oper.calculaSoma(num1, num2);
                    break;

                case 2:
                    resultado = oper.calculaSubtracao(num1, num2);
                    break;

                case 3:
                    resultado = oper.calculaMultiplicacao(num1, num2);
                    break;

                case 4:
                    while(num2 == 0)
                    {
                        num2 = EntradaSaida.solicitaNumero("2º");
                    }
                    resultado = oper.calculaDivisao(num1, num2);
                    break;

                default:
                    System.out.println("Operação inválida! A calculadora será encerrada!");
                    System.exit(0);
            }

            System.out.println();
            EntradaSaida.mostraResultado(resultado, operacao);
            System.out.println();

            System.out.println("Deseja continuar calculando? 1 - Sim | 2 - Não");
            continuar = sc.nextInt();
        }while (continuar == 1);

    }
}
