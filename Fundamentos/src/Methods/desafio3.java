package Methods;

import java.util.Scanner;
public class desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorCompra = valorCompra();

        valorDesconto(valorCompra);
    }

    public static double valorCompra(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor da compra?: ");
        return sc.nextDouble();
    }

    public static void valorDesconto(double valorCompra){

        if(valorCompra > 100.00 && valorCompra <= 200)
        {
            valorCompra = valorCompra - (valorCompra*0.20);
        }
        else if(valorCompra > 200.00)
        {
            valorCompra = valorCompra - (valorCompra*0.30);
        }

        System.out.println("O valor da compra é de: R$" + valorCompra);
    }
}
