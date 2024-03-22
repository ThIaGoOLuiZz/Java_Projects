package While;

import java.util.Scanner;

public class desafio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sexo;
        int idade;
        int nota;
        String loop;
        String nome;
        int pessoa = 0;

        int mediaIdade=0;
        String pessoas = "";
        int homem5 = 0;
        int homem7 = 0;
        int mulher5 = 0;
        int mulher7 = 0;
        int mediaNota = 0;

        do {
            pessoa++;

            System.out.print("Digite seu nome: ");
            nome = sc.next();

            System.out.println();

            System.out.print("Digite seu sexo([M] - Masculino || [F] - Feminino: ");
            sexo = sc.next();

            sexo = sexo.toUpperCase();

            System.out.println();

            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();

            mediaIdade = mediaIdade + idade;

            System.out.println();

            System.out.print("Digite a nota sobre a pré-estreia do filme(1 a 10): ");
            nota = sc.nextInt();

            if (nota == 10)
            {
                pessoas = pessoas.concat(nome + ", ");
            }
            else if(nota < 5 && sexo.equals("M"))
            {
                homem5++;
            }
            else if (nota > 7 && sexo.equals("M"))
            {
                homem7++;
            }
            else if(nota < 5 && sexo.equals("F"))
            {
                mulher5++;
            }
            else if (nota > 7 && sexo.equals("F"))
            {
                homem7++;
            }

            mediaNota = mediaNota + nota;

            System.out.println();

            do {
                System.out.print("Existe mais algum usuario?([S] - sim || [N] - não): ");
                loop = sc.next();

                loop = loop.toUpperCase();

                if (!loop.equalsIgnoreCase("N") && !loop.equals("S"))
                {
                    System.out.println();
                    System.out.println("Valor digitado incorreto!");
                    System.out.println();
                }

            }while (!loop.equals("N") && !loop.equals("S"));
            System.out.println();

        }while (loop.equals("S"));

        mediaIdade = mediaIdade / pessoa;
        mediaNota = mediaNota / pessoa;


        System.out.println();
        System.out.println("Média de idade das pessoas: " + mediaIdade + "\n");
        System.out.println("Lista de pessoas com nota igual a : " + pessoas + "\n");
        System.out.println("Homens com opiniões inferior a 5: " + homem5 + "\n");
        System.out.println("Homens com opiniões superior a 7: " + homem7 + "\n");
        System.out.println("Mulheres com opiniões inferior a 5: " + mulher5 + "\n");
        System.out.println("Homens com opiniões superior a 7: " + mulher7 + "\n");
        System.out.println("A média das notas: " + mediaNota);

        sc.close();
    }
}
