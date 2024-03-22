package Methods;

import java.util.Scanner;
public class desafio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        boolean ver = verificacao(numero);

        if(ver)
        {
            System.out.println("Esse numero é primo.");
        }
        else
        {
            System.out.println("Esse numero não é primo.");
        }
    }
    public static boolean verificacao(int numero){

        for(int x=2;x<10;x++)
        {
            if(numero%x == 0)
            {
                return false;
            }
        }

        return true;
    }

}
