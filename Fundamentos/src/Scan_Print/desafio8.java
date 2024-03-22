package Scan_Print;
import java.util.Scanner;

public class desafio8 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra para realizar a contagem de letras: ");
        String palavra = scan.next();

        int contPalavra = palavra.length();

        System.out.print("\n");
        System.out.println("O número de caracteres da palavra é de: " + contPalavra);

        scan.close();
    }

}
