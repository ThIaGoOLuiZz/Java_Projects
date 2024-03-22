package Array;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.print("Digite o primeiro número: ");
        numeros[0] = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        numeros[1] = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        numeros[2] = sc.nextInt();

        System.out.print("Digite o quarto número: ");
        numeros[3] = sc.nextInt();

        System.out.print("Digite o quinto número: ");
        numeros[4] = sc.nextInt();

        sc.close();

    }
}
