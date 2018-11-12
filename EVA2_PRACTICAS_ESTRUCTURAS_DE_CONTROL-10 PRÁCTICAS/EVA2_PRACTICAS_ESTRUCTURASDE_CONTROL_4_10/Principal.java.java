//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un valor numerico");
        int iValor;
        

        iValor = input.nextInt();

        if (iValor > 0) {

            System.out.println("1");

        } else {

            if (iValor == 0) {
                System.out.println("0");
            } else {
                if (iValor < 0) {
                    System.out.println("-1");
                } else {
                    System.out.println("El Valor no es entendible");
                }
            }
        }
    }
}
