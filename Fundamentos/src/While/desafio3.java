package While;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continuacao;

        do
        {
            System.out.print("Digite um numero inteiro: ");
            int num1 = sc.nextInt();
            System.out.print("\n");

            System.out.print("Digite outro valor: ");
            int num2 = sc.nextInt();
            System.out.print("\n");

            long soma = num1 + num2;
            long sub = num1 - num2;
            long mult = num1 * num2;

            System.out.println("Qual operação você deseja realizar?");
            System.out.println("[1] - Adição");
            System.out.println("[2] - Subtração");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão");
            int operacao = sc.nextInt();

            System.out.println();

            switch (operacao)
            {
                case 1:
                    System.out.println("A soma dos valores é igual a: " + soma + "\n");
                    break;

                case 2:
                    System.out.println("A subtração dos valores é igual a: " + sub + "\n");
                    break;

                case 3:
                    System.out.println("A multiplicação dos valores é igual a: " + mult + "\n");
                    break;

                case 4:
                    if (num2 > 0)
                    {
                        long divi = num1 / num2;
                        System.out.println("A divisão dos valores é igual a: " + divi + "\n");
                    }
                    else
                    {
                        System.out.println("Valor 2 não pode ser divisivel por 0!!");
                    }
                    break;

            }

            System.out.println("Você deseja continuar? ([1] - Sim || [2] - Não)");
            continuacao = sc.nextInt();

            System.out.println("");

        }while (continuacao == 1);

        sc.close();

    }
}
