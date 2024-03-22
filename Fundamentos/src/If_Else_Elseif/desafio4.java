package If_Else_Elseif;
import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a sua idade?: ");
        int idade = scan.nextInt();

        if(idade < 18)
        {
            System.out.println("\nO usuario é uma criança1");
        }
        else if(idade >= 18 && idade < 30)
        {
            System.out.println("\nO usuario é um jovem!");
        }
        else if(idade >= 30 && idade < 60)
        {
            System.out.println("\nO usuario é um adulto!");
        }
        else
        {
            System.out.println("\nO usuario é um idoso!");
        }

    }
}
