package If_Else_Elseif;
import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de um comprimento: ");
        int comp1 = scan.nextInt();

        System.out.print("Digite o valor de outro comprimento: ");
        int comp2 = scan.nextInt();

        System.out.print("Digite o valor do ultimo comprimento: ");
        int comp3 = scan.nextInt();

        System.out.println("");

        if(comp1 == comp2 && comp1 == comp3 && comp2 == comp3)
        {
            System.out.println("Você tem um trianguilo equilatero!");
        }
        else if(comp1 != comp2 && comp2 != comp3)
        {
            System.out.println("Você tem um trianguilo escaleno!");
        }
        else
        {
            System.out.println("Você tem um trianguilo isosceles!");
        }

        scan.close();
    }
}
