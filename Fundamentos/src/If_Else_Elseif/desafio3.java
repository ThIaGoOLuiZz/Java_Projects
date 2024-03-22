package If_Else_Elseif;
import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor de 1 a 7: ");
        int num = scan.nextInt();

        if(num == 1)
        {
            System.out.println("Domingo");
        }
        else if(num == 2)
        {
            System.out.println("Segunda-feira");
        }
        else if(num == 3)
        {
            System.out.println("Terça-feira");
        }
        else if(num == 4)
        {
            System.out.println("Quarta-feira");
        }
        else if(num == 5)
        {
            System.out.println("Quinta-feira");
        }
        else if(num == 6)
        {
            System.out.println("Sexta-feira");
        }
        else
        {
            System.out.println("Sábado");
        }

        scan.close();

    }
}
