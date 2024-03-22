package Methods;

import java.util.Scanner;
public class desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        for(int x=0;x<3;x++)
        {
            num[x] = imput();
        }

        System.out.println();

        verificacaoMaior(num);
        verificacaoMenor(num);
    }
    public static int imput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        return sc.nextInt();
    }

    public static void verificacaoMaior(int numeros[]){
        int maior = 0;

        if(numeros[0] > numeros[1] && numeros[0] > numeros[2])
        {
            maior = numeros[0];
        }
        else if(numeros[1] > numeros[0] && numeros[1] > numeros[2])
        {
            maior = numeros[1];
        }
        else
        {
            maior = numeros[2];
        }

        System.out.println("O maior numero é: " + maior);
    }

    public static void verificacaoMenor(int numeros[]){
        int menor = 0;

        if(numeros[0] < numeros[1] && numeros[0] < numeros[2])
        {
            menor = numeros[0];
        }
        else if(numeros[1] < numeros[0] && numeros[1] < numeros[2])
        {
            menor = numeros[1];
        }
        else
        {
            menor = numeros[2];
        }

        System.out.println("O menor numero é: " + menor);
    }
}
