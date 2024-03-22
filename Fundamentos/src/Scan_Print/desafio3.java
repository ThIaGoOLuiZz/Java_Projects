package Scan_Print;
import java.util.Scanner;


public class desafio3 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int num = scan.nextInt();

        System.out.println();

        if(num%2==0)
        {
            System.out.println("Esse número é par!");
        }
        else
        {
            System.out.println("Esse número é impar!");
        }

        scan.close();
    }

}
