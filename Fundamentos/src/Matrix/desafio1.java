package Matrix;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[][] = new int[4][5];
        int somaColunas[] = new int[5];
        int somaTotal = 0;

        for(int x=0;x<4;x++)
        {
            for(int y=0;y<5;y++)
            {
                System.out.print("Digite um numero para a matriz " + x + "x" + y + ": ");
                numeros[x][y] = sc.nextInt();

                somaColunas[y] = somaColunas[y] + numeros[x][y];
                somaTotal = somaTotal + numeros[x][y];
            }
        }

        for(int x=0;x<5;x++)
        {
            System.out.println("A soma da linha " + x + " = " + somaColunas[x]);
        }

        System.out.println("A soma total das matrizes é de: " + somaTotal);

        sc.close();
    }
}
