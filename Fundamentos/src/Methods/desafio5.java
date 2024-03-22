package Methods;

import java.util.Scanner;
public class desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = numero();

        System.out.println();

        verificacao(numero);
    }
    public static int numero(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        return sc.nextInt();
    }
    public static void verificacao(int numero){
        String num;

        if(numero > 0)
        {
            num = "Positivo";
        }
        else if(numero < 0)
        {
            num = "Negativo";
        }
        else
        {
            num = "Zero";
        }

        System.out.println("O numero é: " + num);
    }

}
