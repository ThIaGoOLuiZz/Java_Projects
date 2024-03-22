package Scan_Print;
import java.util.Scanner;


public class desafio1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //IMPUT NOME
        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("\n");


        //IMPUT IDADE
        System.out.print("Agora, digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("\n");

        System.out.println("Olá " + nome + "! \nSua idade é de: " + idade + " anos.");

        sc.close();


    }

}
