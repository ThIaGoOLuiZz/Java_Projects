package Switch;
import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número do candidato em que você deseja votar!");

        System.out.println("[1] - Candidato 1");
        System.out.println("[2] - Candidato 2");
        System.out.println("[3] - Candidato 3");
        System.out.println("[4] - Candidato 4");
        System.out.println("[5] - Candidato 5");
        int voto = scan.nextInt();

        switch (voto)
        {
            case 1:
                System.out.println("Você votos no candidato 1, da plataforma 1");
                break;

            case 2:
                System.out.println("Você votos no candidato 2, da plataforma 2");
                break;

            case 3:
                System.out.println("Você votos no candidato 3, da plataforma 3");
                break;

            case 4:
                System.out.println("Você votos no candidato 4, da plataforma 4");
                break;

            case 5:
                System.out.println("Você votos no candidato 5, da plataforma 5");
                break;

            default:
                System.out.println("Você digitou um valor incorreto!");
                break;
        }

        scan.close();
    }
}
