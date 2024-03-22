package Array;

import java.util.Arrays;
import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];
        double media = 0;
        int maior = 0;
        int segMaior = 0;
        int terMenor = 0;

        for(int x = 0; x < 10; x++)
        {
            System.out.print("Digite um numero inteiro: ");
            num[x] = sc.nextInt();
            System.out.println("");

            media = media + num[x];
        }
        Arrays.sort(num);

        media = media / 10;

        System.out.println("Segundo maior = " + num[8]);
        System.out.println("Terceiro menor = " + num[2]);
        System.out.println("Media = " + media);

        sc.close();

    }
}
