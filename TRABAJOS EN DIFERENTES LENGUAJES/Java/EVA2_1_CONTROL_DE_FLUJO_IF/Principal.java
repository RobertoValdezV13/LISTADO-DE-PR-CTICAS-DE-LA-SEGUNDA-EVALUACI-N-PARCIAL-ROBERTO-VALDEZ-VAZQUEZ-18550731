//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Que calificacion obtuvo en Fundamentos de Programacion?");
        double califa;
        
        califa = input.nextDouble();
        System.out.println("Tu calificacion es");
        System.out.println(califa);
        if (califa >= 70) {
            System.out.println("Materia aprobada");
        } else {
            System.out.println("Materia reprobada");
        }
    }
}
