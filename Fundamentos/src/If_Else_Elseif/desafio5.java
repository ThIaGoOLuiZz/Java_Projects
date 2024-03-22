    package If_Else_Elseif;
    import java.util.Scanner;

    public class desafio5 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Digite seu peso(Ex.: 58,9): ");
            double peso = scan.nextDouble();

            System.out.print("Digite sua altura(Ex.: 1,68): ");
            double altura = scan.nextDouble();

            double imc = peso / (altura * altura);

            if(imc < 18.5)
            {
                System.out.println("Abaixo do peso!");
            }
            else if(imc >= 18.5 && imc <=24.9)
            {
                System.out.println("Peso Normal!");
            }
            else if(imc >= 25 && imc <= 29.9)
            {
                System.out.println("Sobrepeso!");
            }
            else if(imc >=30)
            {
                System.out.println("Obeso!");
            }

            scan.close();
        }
    }
