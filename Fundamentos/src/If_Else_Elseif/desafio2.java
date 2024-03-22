package If_Else_Elseif;
import java.util.Scanner;

public class desafio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        int nota1 = scan.nextInt();

        System.out.print("Digite sua segunda nota: ");
        int nota2 = scan.nextInt();

        System.out.print("Digite sua terceira nota: ");
        int nota3 = scan.nextInt();

        int media = (nota1+nota2+nota3) / 3;

        if(media >=7)
        {
            System.out.println("Parabens, você foi aprovado com media " + media);
        }
        else if(media>=5 && media<=6)
        {
            System.out.println("Você precisa fazer recuperação, sua media foi " + media);
        }
        else
        {
            System.out.println("Você foi reprovado, sua media foi " + media);
        }

        scan.close();
    }
}
