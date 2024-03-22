package Matrix;

import java.util.Scanner;
public class desafio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor;
        int linha = 3;
        double resto = 0;

        int[][] matriz = new int[4][4];

        for(int x=0;x<4;x++)
        {
            for(int y=0;y<4;y++)
            {
                System.out.print("Digite um valor para a matriz [" + x + "x" + y + "]: ");
                matriz[x][y] = sc.nextInt();
            }
        }

        System.out.print("Qual sera o divisor do numero?: ");
        divisor = sc.nextInt();

        System.out.println();

        System.out.println("Diagonal principal");

        for(int x=0;x<4;x++)
        {
            for(int y=0;y<4;y++)
            {
                if(x == y)
                {
                    resto = matriz[x][y] % divisor;

                    System.out.print("O resto da divisão da matriz [" + x + "x" + y + "] = " + resto);
                    System.out.println();
                }
            }
        }

        System.out.println();

        System.out.println("Diagonal secundaria: ");

        for(int x=0;x<4;x++)
        {
            resto = (double) matriz[linha][x] / divisor;

            System.out.print("O produto da matriz [" + linha + "x" + x + "] = " + resto);
            System.out.println();
            linha--;
        }
        System.out.println("\n");

        //Organização diagonal principal

        for(int x=0;x<4;x++)
        {
            for(int y=0;y<4;y++)
            {
                if(x == y)
                {
                    resto = matriz[x][y] % divisor;

                    System.out.print(resto);
                }
                else
                {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        System.out.println("\n---------------------------------------------------------------\n");

        linha = 3;
        for(int x=0;x<4;x++)
        {
            resto = (double) matriz[linha][x] / divisor;

            switch (x)
            {
                case 0:
                    System.out.println("---" + resto);
                    break;

                case 1:
                    System.out.println("--" + resto + "-");
                    break;

                case 2:
                    System.out.println("-" + resto + "--");
                    break;

                case 3:
                    System.out.println(resto + "---");
                    break;
            }
            linha--;
        }

        sc.close();
    }
}
