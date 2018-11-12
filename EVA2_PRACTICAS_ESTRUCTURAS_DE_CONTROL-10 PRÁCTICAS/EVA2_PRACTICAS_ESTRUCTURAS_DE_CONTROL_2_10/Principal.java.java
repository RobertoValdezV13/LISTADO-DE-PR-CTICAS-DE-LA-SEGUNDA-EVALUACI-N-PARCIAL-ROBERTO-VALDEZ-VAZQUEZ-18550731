//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        int iValor;
        
        iValor = input.nextInt();
        if (iValor % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
