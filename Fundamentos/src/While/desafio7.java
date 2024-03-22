package While;

import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, loop;
        int idade, numFilhos, pessoas=0;
        double salario;
        int count = 0;

        double mediaSalario = 0.0;
        int mediaNumFilhos = 0;
        double maiorSalario = 0.0;
        String nomes = "";
        int mediaIdade = 0;

        do {
            pessoas = pessoas + 1;

            System.out.print("Digite seu nome: ");
            nome = sc.next();

            System.out.println();

            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();

            mediaIdade = mediaIdade + idade;

            System.out.println();

            System.out.println("Digite seu salario: ");
            salario = sc.nextDouble();

            mediaSalario = mediaSalario + salario;

            if(count == 0)
            {
                maiorSalario = salario;
                count++;
            }
            else if(salario > maiorSalario)
            {
                maiorSalario = salario;
            }

            if(salario < 1000)
            {
                nomes = nomes.concat(nome + ", ");
            }

            System.out.println();

            System.out.println("Digite o numero de filhos: ");
            numFilhos = sc.nextInt();

            mediaNumFilhos = mediaNumFilhos + numFilhos;

            System.out.println();

            do {
                System.out.print("Existe mais algum morador?([S] - sim || [N] - não): ");
                loop = sc.next();

                System.out.println();

                loop = loop.toUpperCase();

                if (!loop.equals("S") && !loop.equals("N"))
                {
                    System.out.println("Valor digitado incorreto!\n");
                }
            }while (!loop.equals("S") && !loop.equals("N"));


        }while (loop.equals("S"));

        mediaSalario = mediaSalario / pessoas;
        mediaNumFilhos = mediaNumFilhos / pessoas;
        mediaIdade = mediaIdade / pessoas;

        System.out.println("Média de salário da população: " + mediaSalario);
        System.out.println("Média do número de filhos: " + mediaNumFilhos);
        System.out.println("Maior salário: " + maiorSalario);
        System.out.println("Salário inferior a R$1000: " + nomes);
        System.out.println("Média de idade da população: " + mediaIdade);

        sc.close();

    }
}
