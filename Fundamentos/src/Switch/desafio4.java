package Switch;
import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {

        boolean confirm = true;

        Scanner scan = new Scanner(System.in);

        char[] vogais = {'A', 'E', 'I', 'O', 'U'};
        char[] consoantes = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M','N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z'};

        System.out.print("Digite uma letra: ");
        String letra = scan.nextLine();

        System.out.print("\n");

        letra = letra.toUpperCase();

        char[] letras = letra.toCharArray();

        for(int x = 0; x < vogais.length;x++)
        {
            if(letras[0] == vogais[x])
            {
                System.out.println("A letra é uma vogal!");
                confirm = false;
            }
        }
        for(int x = 0; x< consoantes.length;x++)
        {
            if(letras[0] == consoantes[x])
            {
                System.out.println("A letra é uma consoante!");
                confirm = false;
            }
        }
        if(confirm)
        {
            System.out.println("Esse é um caracter invalido!");
        }

        scan.close();
    }
}
