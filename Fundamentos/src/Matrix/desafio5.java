package Matrix;

import java.util.Scanner;
public class desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[5][5];
        int[][] numerosDobrado = new int[5][5];

        for(int x=0;x<5;x++)
        {
            for(int y=0;y<5;y++)
            {
                System.out.print("Digite um numero inteiro para a matriz: " + x + "x" + y + ": ");
                numeros[x][y] = sc.nextInt();
            }
        }

        for(int x=0;x<5;x++)
        {
            for(int y=0;y<5;y++)
            {
                numerosDobrado[x][y] = numeros[x][y] * 2;
            }
        }

        for(int x=0;x<5;x++)
        {
            for(int y=0;y<5;y++)
            {
                System.out.println("Valor " + x + "x" + y + ": " + numerosDobrado[x][y]);
            }
        }

        sc.close();
    }
}
