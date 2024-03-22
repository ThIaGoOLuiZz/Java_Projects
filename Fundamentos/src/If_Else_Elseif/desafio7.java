package If_Else_Elseif;
import java.util.Scanner;

public class desafio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o seu salario por hora?: ");
        long salary_hour = scan.nextLong();

        System.out.print("Quantas horas você fez no mês?: ");
        int hours = scan.nextInt();

        if(hours >= 160)
        {
            double salary = salary_hour * 160;

            if(hours > 160)
            {
                double extra_salary = ((hours - 160) * salary_hour) * 1.5;

                System.out.println("Seu salário sem horas extras foi de: " + salary);
                System.out.println("O valor pago sobre as horas extras foi de: " + extra_salary);
                System.out.println("O valor total recebido será de: " + (extra_salary + salary));
            }
            else
            {
                System.out.println("Seu salário sem horas extras foi de: " + salary);
            }

        }
        else
        {
            double salary = salary_hour * hours;

            System.out.println("Seu salário sem horas extras foi de: " + salary);
        }

        scan.close();
    }
}
