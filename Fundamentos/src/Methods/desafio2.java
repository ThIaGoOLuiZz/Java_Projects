package Methods;

import java.util.Scanner;
public class desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoNascimento = anoNascimento();

        calculoIdade(anoNascimento);

        sc.close();
    }

    public static int anoNascimento(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de Nascimento: ");
        return sc.nextInt();
    }
    public static void calculoIdade(int anoNascimento){
        int idade = 2021 - anoNascimento;

        System.out.println("Sua idade é de: " + idade);
    }
}
