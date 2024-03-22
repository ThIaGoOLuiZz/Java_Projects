package For;
import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero divisor de 1 a 9: ");
        double divisor = scan.nextInt();

        if(divisor == 0)
        {
            System.out.println("Não é possivel dividir por zero!");
        }
        else
        {
            for(double x = 1; x<=20; x++)
            {
                System.out.println(divisor + " / " + x + "O quociente do valor é de " + (divisor / x));
                System.out.println(divisor + " / " + x + "O resto da divisão é de " + (divisor % x));
                System.out.println("");
            }
        }

        scan.close();

    }
}
