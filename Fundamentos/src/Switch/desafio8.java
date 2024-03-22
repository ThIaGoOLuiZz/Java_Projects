package Switch;
import java.text.DecimalFormat;
import java.util.Scanner;

public class desafio8 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        double imposto1 = 2826.65 - 1903.99;
        double imposto2 = 3751.05 - 2826.66;
        double imposto3 = 3751.06 - 4664.68;
        double impostoTotal = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual seu salario bruto mensal?: ");
        double salario = scan.nextInt();

        System.out.println("");

        if(salario <= 1903.98)
        {
            System.out.println("Você esta isento de imposto");
        }
        else if(salario >= 1903.99 && salario <= 2826.65)
        {
            imposto1 = (salario - 1903.99) * 0.075;
            System.out.println("Você pagará um imposto de: R$" + imposto1);
        }
        else if(salario <= 2826.66 && salario <= 3751.05)
        {
            imposto1 = imposto1 * 0.075;
            imposto2 = (salario - 2826.65) * 0.15;

            impostoTotal = imposto1 + imposto2;

            String total = df.format(impostoTotal);

            System.out.println("Você pagará um imposto de: R$" + total);
        }
        else if (salario >= 3751.06 && salario <=4664.68)
        {
            imposto1 = imposto1 * 0.075;
            imposto2 = imposto2 * 0.15;
            imposto3 = (salario - 3751.05) * 0.225;

            impostoTotal = imposto1 + imposto2 + imposto3;

            String total = df.format(impostoTotal);

            System.out.println("Você pagará um imposto de: R$" + total);
        }
        else
        {
            imposto1 = imposto1 * 0.075;
            imposto2 = imposto2 * 0.15;
            imposto3 = imposto3 * 0.225;
            double imposto4 = (salario - 4664.68) * 0.275;

            impostoTotal = imposto1 + imposto2 + imposto3 + imposto4;

            String total = df.format(impostoTotal);

            System.out.println("Você pagará um imposto de: R$" + total);

        }

        scan.close();
    }
}
