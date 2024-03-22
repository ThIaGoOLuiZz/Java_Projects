package Matrix;

import java.util.Scanner;
public class desafio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int cont=0;

        for(int x=0;x<4;x++)
        {
            for(int y=0;y<4;y++)
            {
                System.out.print("Digite um valor inteiro para a matriz 1 || " + x + "x" + y + ": ");
                matriz1[x][y] = sc.nextInt();
            }
            for(int z=0;z<4;z++)
            {
                System.out.print("Digite um valor inteiro para a matriz 2 || " + x + "x" + z + ": ");
                matriz2[x][z] = sc.nextInt();
            }
        }

        for(int x=0;x<4;x++)
        {
            for(int y=0;y<4;y++)
            {
                for(int z=0;z<4;z++)
                {
                    for(int i=0;i<4;i++)
                    {
                        if(matriz1[x][y] == matriz2[z][i])
                        {
                            cont++;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println("A quantidade de elementos iguais é de: " + cont);

        sc.close();
    }
}
