package Scan_Print;
import java.util.Scanner;

public class desafio6 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor com Float: ");
        double num = scan.nextFloat();

        num = Math.round(num);

        System.out.println("Seu numero arredondado é: " + num);

        scan.close();
    }

}
