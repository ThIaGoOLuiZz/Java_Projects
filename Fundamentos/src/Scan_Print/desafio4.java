package Scan_Print;
import java.util.Scanner;

public class desafio4 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.next();

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Digite sua altura: (Ex: 1,72)");
        float altura = scan.nextFloat();

        System.out.println("\nOlá " + nome + ". Você tem " + idade + " anos, e sua altura é de " + altura + "cm.");

        scan.close();

    }

}
