package Switch;
import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int base = 0, altura = 0;

        System.out.println("Digite o valor correspondente a figura que você deseja calcular:");
        System.out.println("[1] - Circulo");
        System.out.println("[2] - Quadrado");
        System.out.println("[3] - Retângulo");
        System.out.println("[4] - Triângulo");
        int figura = scan.nextInt();

        switch (figura)
        {
            case 1:
                // Calculo circulo = 3,14 * R^2

                System.out.println("Você escolheu o circulo!");
                System.out.print("Digite o valor do Raio: ");
                int raio = scan.nextInt();

                double circulo = 3.14 * (raio * raio);

                System.out.println("\nO valor do circulo é de: " + circulo);
                break;

            case 2:
                // Calculo quadrado = lado * lado

                System.out.println("Você escolheu o quadrado!");
                System.out.print("Digite o valor do lado: ");
                int lado = scan.nextInt();

                double quadrado = lado * lado;

                System.out.println("\nO valor do quadrado é de: " + quadrado);
                break;

            case 3:
                // Calculo retangulo = base * altura

                System.out.println("Você escolheu o retângulo!");
                System.out.print("Digite o valor da base: ");
                base = scan.nextInt();

                System.out.print("Digite o valor da altura: ");
                altura = scan.nextInt();

                double retangulo = base * altura;

                System.out.println("\nO valor do quadrado é de: " + retangulo);
                break;

            case 4:
                // Calculo do triangulo = base * altura / 2

                System.out.println("Você escolheu o triângulo!");
                System.out.print("Digite o valor da base: ");
                base = scan.nextInt();

                System.out.print("Digite o valor da altura: ");
                altura = scan.nextInt();

                double triangulo = (base * altura) / 2;

                System.out.println("\nO valor do tringualo é de: " + triangulo);
                break;

            default:
                System.out.println("Você digitou um valor incorreto!");

        }

        scan.close();

    }

}
