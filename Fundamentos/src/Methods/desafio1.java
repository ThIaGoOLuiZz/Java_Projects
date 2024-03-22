package Methods;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variaveis
        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println();

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println();

        imprimir(nome,idade);
    }

    public static void imprimir(String nome, int idade) {

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
    }
}
