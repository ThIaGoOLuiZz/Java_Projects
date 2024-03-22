package Array;

import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] valores = new double[10];
        double[] valoresInvertidos = new double[10];
        int cont = 9;

        for(int x=0;x<10;x++)
        {
            System.out.print("Digite um numero real: ");
            valores[cont] = sc.nextDouble();

            cont--;
        }

        System.out.println();

        for(int x=0;x<10;x++)
        {
            System.out.println("Indice[" + (x) + "] = " + valores[x]);
        }

        sc.close();
    }
}
