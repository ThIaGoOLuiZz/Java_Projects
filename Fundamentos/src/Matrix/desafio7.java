package Matrix;

import java.util.Scanner;
public class desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] valores = new int[3][2];
        int[][] matrizTransposta = new int[2][3];

        for(int x=0;x<3;x++)
        {
            for(int y=0;y<2;y++)
            {
                System.out.print("Digite um valor para a matriz [" + x + "x" + y + "]: ");
                valores[x][y] = sc.nextInt();
            }
        }

        for(int x=0;x<3;x++)
        {
            for(int y=0;y<2;y++)
            {
                matrizTransposta[y][x] = valores[x][y];

            }
        }

        System.out.println();

        for(int x=0;x<3;x++)
        {
            for(int y=0;y<2;y++)
            {
                System.out.print("Matriz [" + x + "x" + y + "] = " + valores[x][y]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();

        for(int x=0;x<2;x++)
        {
            for(int y=0;y<3;y++)
            {
                System.out.print("Matriz Transposta [" + x + "x" + y + "] = " + matrizTransposta[x][y]);
                System.out.print("\t\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
