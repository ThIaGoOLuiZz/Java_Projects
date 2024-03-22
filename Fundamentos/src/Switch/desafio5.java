package Switch;
import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        double centimetros = 0.0;
        double polegadas = 0.0;
        double pes = 0;
        double quilometros = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma medida em metros: ");
        double metros = scan.nextDouble();

        System.out.println("Para qual unidade de medida você deseja transformar?");
        System.out.println("[1] - Centímetros");
        System.out.println("[2] - polegadas");
        System.out.println("[3] - pés");
        System.out.println("[4] - quilômetros");

        int unidade = scan.nextInt();

        switch (unidade)
        {
            case 1:
                System.out.println("Você escolheu transformar o valor para centímetros");
                centimetros = metros * 100;

                System.out.println("\n valor convertido foi de: " + centimetros);
                break;

            case 2:
                System.out.println("Você escolheu transformar o valor para polegadas");
                polegadas = metros * 39.37;

                System.out.println("\n valor convertido foi de: " + polegadas);
                break;

            case 3:
                System.out.println("Você escolheu transformar o valor para pés");
                pes = metros * 3.281;

                System.out.println("\n valor convertido foi de: " + pes);
                break;

            case 4:
                System.out.println("Você escolheu transformar o valor para quilometros");
                quilometros = metros / 1000;

                System.out.println("\n valor convertido foi de: " + quilometros);
                break;
        }

        scan.close();
    }
}
