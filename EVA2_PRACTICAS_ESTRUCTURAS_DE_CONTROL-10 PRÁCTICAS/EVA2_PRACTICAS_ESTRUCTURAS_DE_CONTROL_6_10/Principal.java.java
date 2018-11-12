//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce la coordenada 1 (Valor de X)");
        int iCoordenadaX;
        iCoordenadaX = input.nextInt();
        
        System.out.println("Introduce la cordenada 1 (Valor de Y)");
        int iCoordenadaY;
        iCoordenadaY = input.nextInt();
        
        if (iCoordenadaX > 0 && iCoordenadaY > 0) {
            System.out.println("La Coordenada se encuentra en el cuadrante 1");
        } else {
            if (iCoordenadaX < 0 && iCoordenadaY > 0) {
                System.out.println("La Coordenada se encuentra en el cuadrante 2");
            } else {
                if (iCoordenadaX < 0 && iCoordenadaY < 0) {
                    System.out.println("La Coordenada se encuentra en el cuadrante 3");
                } else {
                    if (iCoordenadaX > 0 && iCoordenadaY < 0) {
                        System.out.println("La Coordenada se encuentra en el cuadrante 4");
                    } else {
                        if (iCoordenadaX == 0 && iCoordenadaY == 0) {
                            System.out.println("La Coordenada se encuentra en el origen");
                        } else {
                            System.out.println("El Valor insertado es desconocido");
                        }
                    }
                }
            }
        }
    }
}
