package If_Else_Elseif;
import java.util.Scanner;


public class desafio1 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual foi sua nota?: ");
        int nota = scan.nextInt();

        System.out.print("\n");

        if(nota >= 7)
        {
            System.out.println("Parabéns! Você foi aprovado! Sua nota foi " + nota + ".");
        }
        else if(nota >=5 && nota <=6)
        {
            System.out.println("Você está em recuperação! Sua nota foi " + nota + ".");
        }
        else
        {
            System.out.println("Você foi reprovado! Sua nota foi " + nota + ".");
        }

        scan.close();

    }

}
