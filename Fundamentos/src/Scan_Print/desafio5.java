package Scan_Print;
import java.util.Scanner;

public class desafio5 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int num = scan.nextInt();

        System.out.print("\n");

        for(int x=0;x<11;x++)
        {
            System.out.println(num + " x " + x + " = " + (x*num));
        }

        scan.close();
    }

}
