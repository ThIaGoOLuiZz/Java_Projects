package For;

import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mediaMatematica = 0;
        double mediaHistoria = 0;
        double mediaPortugues = 0;
        double mediaGeografia = 0;

        int peso;
        int totalPesoM = 0;
        int totalPesoH = 0;
        int totalPesoP = 0;
        int totalPesoG = 0;

        double[] matematica = new double[4];
        double[] historia = new double[4];
        double[] portugues = new double[4];
        double[] geografia = new double[4];

        //FOR para matematica.
        for(int x = 0; x < 4;x++)
        {
            System.out.print("Digite a " + (x+1) + "ª nota de matematica: ");
            System.out.println();
            matematica[x] = sc.nextDouble();

            System.out.print("Agora digite o peso da " + (x+1) + "ª nota de matematica: ");
            peso = sc.nextInt();

            matematica[x] = matematica[x] * peso;
            totalPesoM = totalPesoM + peso;
        }

        System.out.println();

        //FOR para historia. ///////////////////////////////////////////
        for(int x = 0; x < 4;x++)
        {
            System.out.print("Digite a " + (x+1) + "ª nota de historia: ");
            System.out.println();
            historia[x] = sc.nextDouble();

            System.out.print("Agora digite o peso da " + (x+1) + "ª nota de historia: ");
            peso = sc.nextInt();

            historia[x] = historia[x] * peso;
            totalPesoH = totalPesoH + peso;
        }

        System.out.println();

        //FOR para portugues. ///////////////////////////////////////////
        for(int x = 0; x < 4;x++)
        {
            System.out.print("Digite a " + (x+1) + "ª nota de portugues: ");
            System.out.println();
            portugues[x] = sc.nextDouble();

            System.out.print("Agora digite o peso da " + (x+1) + "ª nota de portugues: ");
            peso = sc.nextInt();

            portugues[x] = portugues[x] * peso;
            totalPesoP = totalPesoP + peso;

        }

        System.out.println();

        //FOR para geografia.
        for(int x = 0; x < 4;x++)
        {
            System.out.print("Digite a " + (x+1) + "ª nota de geografia: ");
            System.out.println();
            geografia[x] = sc.nextDouble();

            System.out.print("Agora digite o peso da " + (x+1) + "ª nota de geografia: ");
            peso = sc.nextInt();

            matematica[x] = matematica[x] * peso;
            totalPesoG = totalPesoG + peso;
        }

        for(int x=0;x<4;x++)
        {
            mediaMatematica = mediaMatematica + matematica[x];
            mediaHistoria = mediaHistoria + historia[x];
            mediaPortugues = mediaPortugues + portugues[x];
            mediaGeografia = mediaGeografia + geografia[x];
        }
        mediaMatematica = mediaMatematica / totalPesoM;
        mediaHistoria = mediaHistoria / totalPesoH;
        mediaPortugues = mediaPortugues / totalPesoP;
        mediaGeografia = mediaGeografia / totalPesoG;

        System.out.println();

        for(int x=0; x<4;x++)
        {
            System.out.print("A " + (x+1) + "ª nota de matematica é: " + matematica[x]);
            System.out.println();
        }

        System.out.print("E a media final é de: " + mediaMatematica);
        System.out.println("\n");

        for(int x=0; x<4;x++)
        {
            System.out.print("A " + (x+1) + "ª nota de historia é: " + historia[x]);
            System.out.println();
        }
        System.out.print("E a media final é de: " + mediaHistoria);
        System.out.println("\n");

        for(int x=0; x<4;x++)
        {
            System.out.print("A " + (x+1) + "ª nota de portugues é: " + portugues[x]);
            System.out.println();
        }
        System.out.print("E a media final é de: " + mediaPortugues);
        System.out.println("\n");

        for(int x=0; x<4;x++)
        {
            System.out.print("A " + (x+1) + "ª nota de geografia é: " + geografia[x]);
            System.out.println();
        }
        System.out.print("E a media final é de: " + mediaGeografia);
        System.out.println("\n");

        sc.close();
    }
}
