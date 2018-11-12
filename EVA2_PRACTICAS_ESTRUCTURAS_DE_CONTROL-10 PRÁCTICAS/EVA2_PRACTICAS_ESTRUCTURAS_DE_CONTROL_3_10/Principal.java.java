//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        double rValor;
        
        rValor = input.nextDouble();
        if (rValor > 0) {
            System.out.println("El numero es positivo");
        } else {
            if (rValor == 0) {
                System.out.println("El numero es neutro");
            } else {
                System.out.println("El numero es negativo");
            }
        }
    }
}
