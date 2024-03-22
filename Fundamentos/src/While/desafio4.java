package While;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        int idadeGeral = 0;
        int idadeMas = 0;
        int idadeFem = 0;
        int pessoas = 0;
        int pessoasM = 0;
        int pessoasF = 0;
        int cont = 0;
        double mediaSalario = 0.0;
        double salarioMas = 0.0;
        double salarioFem = 0.0;
        double maiorSalario = 0.0;
        double menorSalario = 0.0;
        boolean validacao = true;
        String genero;
        String loop = "";


        Scanner sc = new Scanner(System.in);

        do {
            // Contador nº pessoas.
            pessoas = pessoas + 1;

            System.out.print("Digite a sua idade: ");
            int idade = sc.nextInt();

            idadeGeral = idadeGeral + idade;

            System.out.println();

            System.out.print("Digite o seu salário: ");
            double salario = sc.nextDouble();

            System.out.println();

            mediaSalario = mediaSalario + salario;

            if(cont == 0)
            {
                menorSalario = salario;
                maiorSalario = salario;
                cont++;
            }
            else if(salario > maiorSalario)
            {
                maiorSalario = salario;
            }
            else if (salario < menorSalario)
            {
                menorSalario = salario;
            }

            do {

                System.out.print("Digite o seu gênero([M] - Masculino || [F] - Feminino): ");
                genero = sc.next();

               genero = genero.toUpperCase();

                if (genero.equals("M"))
                {
                    idadeMas = idadeMas + idade;
                    pessoasM = pessoasM + 1;
                    salarioMas = salarioMas + salario;

                }
                else if (genero.equals("F"))
                {
                    idadeFem = idadeFem + idade;
                    pessoasF = pessoasF + 1;
                    salarioFem = salarioFem + salario;
                }
                else
                {
                    System.out.println("Você digitou o genero errado!");
                }
            }while (!genero.equals("M") && !genero.equals("F"));

            System.out.println();

            do {
                System.out.print("Cadastrar nova pessoa?(sim ou finalizar): ");
                loop = sc.next();

                loop = loop.toUpperCase();

                if (!loop.equals("SIM") && !loop.equals("FINALIZAR"))
                {
                    System.out.println("Digite um valor correto!\n");
                }
            }while (!loop.equals("SIM") && !loop.equals("FINALIZAR"));

        }while (loop.equals("SIM"));

        idadeGeral = idadeGeral / pessoas;

        if(pessoasM > 0)
        {
            idadeMas = idadeMas / pessoasM;
            salarioMas = salarioMas / pessoasM;
        }
        if(pessoasF > 0)
        {
            idadeFem = idadeFem / pessoasF;
            salarioFem = salarioFem / pessoasF;
        }

        mediaSalario = mediaSalario / pessoas;

        System.out.println("A média de idade geral é " + idadeGeral);
        System.out.println("A média de idade de pessoas do gênero feminino é " + idadeFem);
        System.out.println("A média de idade de pessoas do gênero masculino é " + idadeMas);
        System.out.println("A média salarial geral é " + mediaSalario);
        System.out.println("A média salarial do gênero feminino é " + salarioFem);
        System.out.println("A média salarial do gênero masculino é " + salarioMas);
        System.out.println("O maior salário é " + maiorSalario);
        System.out.println("O menor salário é " + menorSalario);

    }
}
