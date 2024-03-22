package While;

import java.util.Scanner;
public class desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean validacao = true;

        do
        {
            System.out.println("Digite um numero");
            int num = sc.nextInt();

            if(num % 2 != 0)
            {
                System.out.println("\nVocê digitou um numero impar!");
                validacao = false;
                System.out.println();
            }
            else
            {
                System.out.println("\nEsse é um numero par!");
                validacao = true;
            }
        }while (!validacao);

        sc.close();
    }
}
