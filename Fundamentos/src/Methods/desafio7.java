package Methods;

import java.util.Scanner;
public class desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3];

        for(int x=0;x<3;x++)
        {
            valores[x] = imput();
        }

        System.out.println();

        verify(valores);
    }
    public static int imput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        return sc.nextInt();
    }
    public static void verify(int valores[]){
        String triangulo;

        if(valores[0] == valores[1] && valores[0] == valores[2])
        {
            triangulo = "Triangulo equilátero.";
        }
        else if(valores[0] != valores[1] && valores[0] != valores[2])
        {
            triangulo = "Triangulo escaleno.";
        }
        else
        {
            triangulo = "Triangulo isósceles.";
        }

        System.out.println("O triangulo é um " + triangulo);

    }
}
