package For;
import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {

        int soma = 0;
        int media = 0;
        int cont = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num1 = scan.nextInt();

        System.out.print("Informe outro número: ");
        int num2 = scan.nextInt();

        for(int x = (num1 + 1); x<num2; x++)
        {
            soma = soma + x;
            cont = cont + 1;
        }
        media = soma / cont;

        System.out.print("A soma dos valores é de: " + soma);
        System.out.println();
        System.out.print("A media dos valores é de: " + media);

        scan.close();
    }
}
