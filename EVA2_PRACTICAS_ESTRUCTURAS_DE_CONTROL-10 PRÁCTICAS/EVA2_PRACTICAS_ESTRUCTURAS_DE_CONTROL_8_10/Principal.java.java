//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el valor del lado A");
        int iLadoA;
        
        iLadoA = input.nextInt();
        System.out.println("Introduce el valor del lado B");
        int iLadoB;
        
        iLadoB = input.nextInt();
        System.out.println("Introduce el valor del lado C");
        int iLadoC;
        
        iLadoC = input.nextInt();
        if (iLadoA == iLadoB) {
            if (iLadoA == iLadoC) {
                System.out.println("El Triangulo es");
                System.out.println("Equlatero");
            } else {
                System.out.println("El Triangulo es");
                System.out.println("Isosceles");
            }
        } else {
            if (iLadoA == iLadoC) {
                System.out.println("El Triangulo es");
                System.out.println("Isosceles");
            } else {
                if (iLadoC == iLadoB) {
                    System.out.println("El Triangulo es");
                    System.out.println("Isosceles");
                } else {
                    System.out.println("El Triangulo es");
                    System.out.println("Escaleno");
                }
            }
        }
    }
}
