package For;
import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();

        for(char letra: palavra.toCharArray())
        {
            System.out.println(letra);
        }

        System.out.println("\nCaracteres: " + palavra.length());

        scan.close();
    }
}
