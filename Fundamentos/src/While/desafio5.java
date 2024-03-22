package While;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chute = 0;

        System.out.print("Digite um numero: \n");
        int num1 = sc.nextInt();

        System.out.print("Digite outro numero: \n");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        do
        {
            System.out.print("Qual o resultado da soma?: ");
            chute = sc.nextInt();

            if (chute != sum)
            {
                System.out.println("\nInfelizmente você errou, tente novamente\n");
            }
            else
            {
                System.out.println("\nVocê acertou!");
            }
        }while(chute != sum);

    }
}
