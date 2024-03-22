package Array;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        double[] nota1 = new double[5];
        int[] peso1 = new int[5];

        double[] nota2 = new double[5];
        int[] peso2 = new int[5];

        double[] nota3 = new double[5];
        int[] peso3 = new int[5];

        double[] mediaPonderada = new double[5];

        for(int x=0;x<5;x++)
        {
            System.out.print("Escreva o valor da 1ª prova do aluno " + (x+1) + ": ");
            nota1[x] = sc.nextInt();

            System.out.print("Escreva o peso da nota: ");
            peso1[x] = sc.nextInt();

            System.out.println();
        }

        for(int x=0;x<5;x++)
        {
            System.out.print("Escreva o valor da 2ª prova do aluno " + (x+1) + ": ");
            nota2[x] = sc.nextInt();

            System.out.print("Escreva o peso da nota: ");
            peso2[x] = sc.nextInt();

            System.out.println();
        }

        for(int x=0;x<5;x++)
        {
            System.out.print("Escreva o valor da 3ª prova do aluno " + (x+1) + ": ");
            nota3[x] = sc.nextInt();

            System.out.print("Escreva o peso da nota: ");
            peso2[x] = sc.nextInt();

            System.out.println();
        }

        for(int x=0;x<5;x++)
        {
            mediaPonderada[x] = (nota1[x]*peso1[x] + nota2[x]*peso2[x] + nota3[x] * peso3[x]) / peso1[x]+peso2[x]+peso3[x];
        }

        for(int x=0;x<5;x++)
        {
            System.out.println("A media ponderada do aluno " + (x+1) + " é: " + mediaPonderada[x]);
        }

        sc.close();
    }
}
