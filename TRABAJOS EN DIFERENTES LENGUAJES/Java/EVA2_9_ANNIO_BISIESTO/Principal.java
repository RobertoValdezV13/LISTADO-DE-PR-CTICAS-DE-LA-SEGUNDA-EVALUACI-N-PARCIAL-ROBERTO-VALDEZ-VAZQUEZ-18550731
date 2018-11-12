//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa el annio");
        int iAnnio;
        
        iAnnio = input.nextInt();
        if (iAnnio % 4 == 0) {
            if (!(iAnnio % 100 == 0)) {
                if (!(iAnnio % 400 == 0)) {
                    System.out.println("Annio Bisiesto");
                } else {
                    System.out.println("Annio No Bisiesto");
                }
            } else {
                System.out.print("Annio Bisiesto");
            }
        } else {
            System.out.println("Annio No Bisiesto");
        }
    }
}
