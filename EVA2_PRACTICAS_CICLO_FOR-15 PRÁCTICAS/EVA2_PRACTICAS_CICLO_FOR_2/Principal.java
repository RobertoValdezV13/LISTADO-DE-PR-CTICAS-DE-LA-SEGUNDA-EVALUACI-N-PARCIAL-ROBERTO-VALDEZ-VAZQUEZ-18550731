
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Valdez Vazquez-18550731
 */
 

public class Principal {
    private static Scanner input = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresa tu nombre");
        String sNomb;
        sNombre = input.nextLine();
        System.out.println("¿Cuantas veces quieres imprimir tu nombre?");
        int iVeces;
        
        iVeces = input.nextInt();
        int impNomb;
        
        for (impNomb = 1; impNom <= iVeces; impNom++) {
            System.out.println(sNomb);
        }
    }
}
