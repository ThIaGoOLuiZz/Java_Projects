package For;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {

        boolean caracter = true;

        int contConsoantes = 0;
        int contVogais = 0;
        int contEspacos = 0;
        int contCaracter =0;

        char[] vogais = {'a','e','i','o','u'};
        char[] consoantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase!");
        String frase = sc.nextLine();

        frase = frase.toLowerCase();

        char[] letras = frase.toCharArray();

        for(char letra: letras)
        {
            caracter = true;

            //FOR para vogais.
            for(int x = 0;x < vogais.length; x++)
            {
                if(letra == vogais[x])
                {
                    contVogais++;
                    caracter = false;
                    break;
                }
            }

            //FOR para consoantes.
            for(int x = 0;x < consoantes.length;x++)
            {
                if(letra == consoantes[x])
                {
                    contConsoantes++;
                    caracter = false;
                    break;
                }
            }

            //IF para espaco.
            if(letra == ' ')
            {
                contEspacos++;
                caracter = false;
            }
            else if(caracter == true)
            {
                contCaracter++;
            }
        }

        System.out.println("Vogais: " + contVogais);
        System.out.println("Consoantes: " + contConsoantes);
        System.out.println("Espaços : " + contEspacos);
        System.out.println("Caracteres especiais: " + contCaracter);

        sc.close();
    }
}