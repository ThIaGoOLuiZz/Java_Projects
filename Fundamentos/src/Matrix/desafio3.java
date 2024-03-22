package Matrix;

import java.util.Scanner;
public class desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double faturamento[][] = new double[6][3];

        for(int x=0;x<6;x++)
        {
            for(int y=0;y<3;y++)
            {
                System.out.print("Digite o valor do " + (y+1) + "º faturamento do mês " + (x+1) + ": ");
                faturamento[x][y] = sc.nextDouble();
                System.out.println();
            }
        }

        for(int x=0;x<6;x++)
        {
            System.out.println("Faturamentos do mês " + (x+1) + ":");

            for(int y=0;y<3;y++)
            {
                System.out.println((y+1) + "º: " + faturamento[x][y]);
            }
        }

        sc.close();
    }
}
