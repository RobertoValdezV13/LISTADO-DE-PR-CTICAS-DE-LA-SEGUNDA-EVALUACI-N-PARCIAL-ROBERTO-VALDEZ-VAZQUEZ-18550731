//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce los puntos obtenidos en Matematicas");
        int iMatematicas;
        


        iMatematicas = input.nextInt();
        System.out.println("Introduce los puntos obtenidos en Fisica");
        int iFisica;
        


        iFisica = input.nextInt();
        System.out.println("Introduce los puntos obtenidos en Quimica");
        int iQuimica;
        


        iQuimica = input.nextInt();
        if (iMatematicas >= 65 && iFisica >= 55 && iQuimica >= 50) {
            if (iMatematicas + iFisica + iQuimica >= 180) {
                System.out.println("El candidato es elegible para el curso");
            } else {
                System.out.println("El Candidato no es elegible para el curso");
            }
        } else {
            System.out.println("El Candidato no es elegible para el curso");
        }
    }
}
