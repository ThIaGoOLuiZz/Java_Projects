package Array;

import java.util.Scanner;
import java.util.Arrays;

public class desafio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int x=0;x<5;x++)
        {
            System.out.print("Digite um numero inteiro: ");
            numeros[x] = sc.nextInt();
        }

        Arrays.sort(numeros);

        for(int x=0;x<5;x++)
        {
            System.out.println("Indice [" + x + "] = " + numeros[x]);
        }

        sc.close();
    }
}
