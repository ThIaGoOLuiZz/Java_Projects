package While;

import java.util.Scanner;
import java.text.DecimalFormat;

public class desafio6 {
    public static void main(String[] args) {
        double imc = 0.0;
        DecimalFormat df = new DecimalFormat("0.00");

        String loop = "";

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Qual seu peso?: ");
            double peso = sc.nextDouble();

            System.out.print("Qual sua altura?: ");
            double altura = sc.nextDouble();

            imc = peso / (altura * altura);

            String imcFormat = df.format(imc);

            System.out.println("Seu IMC é de: " + imcFormat);

            do {
                System.out.println("Você deseja realizar uma nova pesquisa?([S] - sim || [N] - não");
                loop = sc.next();

                loop = loop.toUpperCase();

                if (!loop.equals("S") && !loop.equals("N"))
                {
                    System.out.println("Valor incorreto!\n");
                }

            }while (!loop.equals("S") && !loop.equals("N"));


        }while (loop.equals("S"));





    }
}
