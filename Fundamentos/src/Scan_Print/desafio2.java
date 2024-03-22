package Scan_Print;
import java.util.Scanner;


public class desafio2 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num1 = scan.nextInt();
        System.out.print("\n");

        System.out.print("Digite outro valor: ");
        int num2 = scan.nextInt();
        System.out.print("\n");

        long soma = num1 + num2;
        long sub = num1 - num2;
        long mult = num1 * num2;

        System.out.println("A soma dos valores é igual a: " + soma + "\n");
        System.out.println("A subtração dos valores é igual a: " + sub + "\n");
        System.out.println("A multiplicação dos valores é igual a: " + mult + "\n");

        if (num2 > 0)
        {
            long divi = num1 / num2;
            System.out.println("A divisão dos valores é igual a: " + divi + "\n");
        }
        else
        {
            System.out.println("Valor 2 não pode ser divisivel por 0!!");
        }

        scan.close();

    }

}
