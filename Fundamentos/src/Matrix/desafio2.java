package Matrix;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota[][] = new int[5][3];
        int media[] = new int[5];

        for(int x=0;x<5;x++)
        {
            for(int y=0;y<3;y++)
            {
                System.out.print("Digite a " + (y+1) + "ª nota do aluno: " + (x+1) + ": ");
                nota[x][y] = sc.nextInt();

                media[x] = media[x] + nota[x][y];
            }
        }
        for(int x=0;x<5;x++)
        {
            media[x] = media[x] / 3;
            System.out.println("A media do " + (x+1) + "º aluno é de: " + media[x]);
        }

        sc.close();
    }
}
