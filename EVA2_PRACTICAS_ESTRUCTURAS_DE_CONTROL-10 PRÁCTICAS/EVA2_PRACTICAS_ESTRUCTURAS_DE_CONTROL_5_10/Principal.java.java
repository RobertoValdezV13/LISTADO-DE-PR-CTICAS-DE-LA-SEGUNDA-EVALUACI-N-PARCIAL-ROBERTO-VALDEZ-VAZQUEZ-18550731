//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el Valor 1");
        int iValor1;
        
        iValor1 = input.nextInt();
        System.out.println("Introduce el Valor 2");
        int iValor2;
        

        iValor2 = input.nextInt();
        System.out.println("Introduce el Valor 3");
        int iValor3;
        
        iValor3 = input.nextInt();
        if (iValor1 > iValor2) {
            if (iValor1 > iValor3) {
                System.out.println("El Valor mas grande es ");
                System.out.println(iValor1);
            } else {
                System.out.println("El Valor mas grande es ");
                System.out.println(iValor3);
            }
        } else {
            if (iValor1 > iValor3) {
                System.out.println("El Valor mas grande es ");
                System.out.println(iValor2);
            } else {
                if (iValor3 > iValor2) {
                    System.out.println("El Valor mas grande es ");
                    System.out.println(iValor3);
                } else {
                    System.out.println("El Valor mas grande es ");
                    System.out.println(iValor2);
                }
            }
        }
    }
}
