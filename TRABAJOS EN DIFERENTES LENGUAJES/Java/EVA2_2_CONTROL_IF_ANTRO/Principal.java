//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Que edad tienes?");
        int iEdad;
        
        iEdad = input.nextInt();
        if (iEdad >= 18) {
            System.out.println("Eres Mayor de edad");
        } else {
            System.out.println("Eres Menor de edad");
        }
    }
}
