package Switch;
import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero em que você deseja ver qual dia da semana correspondente: ");
        int num = scan.nextInt();

        switch(num)
        {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-feira");
                break;

            case 3:
                System.out.println("Terça-feira");
                break;

            case 4:
                System.out.println("Quarta-feira");
                break;

            case 5:
                System.out.println("Quinta-feira");
                break;

            case 6:
                System.out.println("Sexta-feira");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Valor incorreto!!");


        }

        scan.close();
    }
}
