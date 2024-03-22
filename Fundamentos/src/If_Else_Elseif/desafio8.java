package If_Else_Elseif;
import java.util.Scanner;

public class desafio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o nome do filme?: ");
        String nome = scan.nextLine();

        System.out.print("Digite a duração em minutos do filme: ");
        int minutos = scan.nextInt();

        System.out.print("Qual a classificação do filme?(0 para livre, 10, 12, 14, 16 ou 18 anos): ");
        int classificacao = scan.nextInt();

        if(minutos < 60 && classificacao == 0)
        {
            System.out.println("O filme informado é da categoria Infantil!");
        }
        else if((minutos >= 60 && minutos <= 120) && classificacao == 10 || classificacao == 12 || classificacao == 14 )
        {
            System.out.println("O filme informado é da categoria Adolescente!");
        }
        else if(minutos > 120 && (classificacao == 16 || classificacao == 18))
        {
            System.out.println("O filme informado é da categoria Adultos!");
        }
        else if(minutos > 60 && classificacao == 0)
        {
            System.out.println("O filme informado é da categoria Não Recomendado!");
        }
        else
        {
            System.out.println("O filme informado não se enquadra em nenhuma categoria!");
        }

    }
}
