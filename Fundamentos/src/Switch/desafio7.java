package Switch;
import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {

        double soma = 0.0;
        double sub = 0.0;
        double mult = 0.0;
        double div = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double num1 = scan.nextInt();

        System.out.print("Digite outro numero: ");
        double num2 = scan.nextInt();

        System.out.println("Escolha qual operação você fará com os valores");
        System.out.println("[1] - Soma");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        int operacao = scan.nextInt();

        switch (operacao)
        {
            case 1:
                soma = num1 + num2;
                System.out.println("A soma dos valores é de: " + soma);
                break;

            case 2:
                sub = num1 - num2;
                System.out.println("A Subtração dos valores é de: " + sub);
                break;

            case 3:
                mult = num1 * num2;
                System.out.println("A Multiplicação dos valores é de: " + mult);
                break;

            case 4:

                if(num2 == 0)
                {
                    System.out.println("Não é possivel dividir um valor por 0!");
                }
                else
                {
                    div = num1 / num2;
                    System.out.println("A Divisão dos valores é de: " + div);
                }
                break;

        }

        scan.close();
    }
}
