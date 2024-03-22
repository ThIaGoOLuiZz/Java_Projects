package For;
import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int num = 0;

        for(int x = 0; x<5;x++)
        {
            System.out.print("Digite um numero inteiro: ");
            num = scan.nextInt();

            System.out.println();

            if(num %2 == 0)
            {
                pares = pares + num;
            }
            else
            {
                impares = impares + num;
            }
        }

        int numTotal = pares + impares;

        System.out.println("A soma dos pares é igual a: " + pares);
        System.out.println("A soma dos impares é igual a: " + impares);
        System.out.println("A soma total é igual a: " + numTotal);


    }
}
