package Scan_Print;
import java.util.Scanner;

public class desafio7 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em ºC a ser convertida: ");
        int celsius = scan.nextInt();

        double fahrenheit = (celsius * 1.8) + 32;
        int kelvin = celsius + 273;

        System.out.println("");

        System.out.println("A temperatua em Celsius é de: " + celsius + "º");
        System.out.println("A temperatua em Fahrenheit é de: " + fahrenheit + "º");
        System.out.println("A temperatua em Kelvin é de: " + kelvin + "º");

        scan.close();
    }

}
