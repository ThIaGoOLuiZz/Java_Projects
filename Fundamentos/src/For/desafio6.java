package For;
import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        boolean verify = false;
        Scanner scan = new Scanner(System.in);

        for(int x = 1; x<=100; x++)
        {
            verify = false;
            for(int y = 2;y<x;y++)
            {
                if(x%y == 0 && x!=y)
                {
                    verify = true;
                    break;
                }
            }
            if(verify == false && x != 1)
            {
                System.out.print(x+", ");
            }
        }
    }
}