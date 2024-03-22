package Array;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] arraySoma = new int[5];

        for(int x=0;x<5;x++)
        {
            System.out.print("Digite o " + (x+1 + "º valor inteiro para o array 1: "));
            array1[x] = sc.nextInt();

            System.out.print("Digite o " + (x+1 + "º valor inteiro para o array 2: "));
            array2[x] = sc.nextInt();
        }
        System.out.println();

        for(int x=0;x<5;x++)
        {
            arraySoma[x] = array1[x] + array2[x];
            System.out.println("A soma dos vetores " + (x+1) + " é de: " + arraySoma[x]);
        }

        sc.close();
    }
}
