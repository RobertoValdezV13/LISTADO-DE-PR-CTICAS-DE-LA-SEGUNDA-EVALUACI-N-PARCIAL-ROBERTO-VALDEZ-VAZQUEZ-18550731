//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Tienes tu INE?");
        boolean bINE;
        
        bINE = input.nextBoolean();
        if (bINE == true) {
            System.out.println("Si tienes INE");
        } else {
            System.out.println("No tienes INE");
        }
    }
}
