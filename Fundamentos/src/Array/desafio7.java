package Array;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[30];
        Random random = new Random();
        int aleatorio = 0;
        int acima = 0;
        double media =0.0;

        for(int x=0;x<30;x++)
        {
            aleatorio = random.nextInt(10);
            System.out.println("Nota do aluno " + (x+1) + " = " + aleatorio);
            media = media + aleatorio;

            if(aleatorio >= 7)
            {
                acima++;
            }
        }
        media = media / 30;

        System.out.println("A media das notas é igual a: " + media);
        System.out.println();
        System.out.println("Quantidade de alunos que ficaram acima da media: " + acima);



    }
}
