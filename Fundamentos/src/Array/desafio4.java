package Array;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temperatura = new double[12];
        double menor = 0.0;
        double maior = 0.0;
        double media = 0.0;

        for(int x=0;x<12;x++)
        {
            System.out.print("Qual foi a temperatura do " + (x+1) +"º mês: ");
            temperatura[x] = sc.nextInt();
            media = media + temperatura[x];
            System.out.println();

            if(x == 1)
            {
                maior = temperatura[x];
                menor = temperatura[x];
            }
            else if(temperatura[x] > maior)
            {
                maior = temperatura[x];
            }

            if(temperatura[x] < menor)
            {
                menor = temperatura[x];
            }
        }

        media = media / 12;

        System.out.println("A menor temperatura é igual a: " + menor);
        System.out.println("A maior temperatura é igual a: " + maior);
        System.out.println("A media é igual a: " + media);

        sc.close();
    }
}
