package CalculadoraV6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continuar;
        double resultado = 0;
        Operacoes oper = null;

        do
        {
            double num1 = EntradaSaida.solicitaNumero("1º");
            double num2= EntradaSaida.solicitaNumero("2º");
            System.out.println();
            int operacao = EntradaSaida.solicitaOperacao();

            switch (operacao)
            {
                case 1:
                    oper = new Soma();
                    break;

                case 2:
                    oper = new Subtracao();
                    break;

                case 3:
                    oper = new Multiplicacao();
                    break;

                case 4:
                    while(num2 == 0)
                    {
                        num2 = EntradaSaida.solicitaNumero("2º");
                    }

                    oper = new Divisao();
                    break;

                default:
                    System.out.println("Operação inválida! A calculadora será encerrada!");
                    System.exit(0);
            }
            oper.setNum1(num1);
            oper.setNum2(num2);
            resultado = oper.calcula();
            System.out.println();
            EntradaSaida.mostraResultado(resultado, operacao);
            System.out.println();

            System.out.println("Deseja continuar calculando? 1 - Sim | 2 - Não");
            continuar = sc.nextInt();
        }while (continuar == 1);

    }
}
