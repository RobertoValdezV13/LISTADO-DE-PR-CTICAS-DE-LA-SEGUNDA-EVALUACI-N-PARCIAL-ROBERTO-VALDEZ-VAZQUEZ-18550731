//@author Roberto Valdez Vazquez-18550731

import java.util.*;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce tu calificacion");
        int iCalifa;
        
        iCalifa = input.nextInt();
        if (iCalifa == 100) {
            System.out.println("A");
        } else {
            if (iCalifa == 90) {
                System.out.println("B");
            } else {
                if (iCalifa== 80) {
                    System.out.println("C");
                } else {
                    if (iCalifa == 70) {
                        System.out.println("D");
                    } else {
                        if (iCalifa == 60) {
                            System.out.println("F");
                        } else {
                            System.out.println("Calificacion fuera de rango");
                        }
                    }
                }
            }
        }
    }
}
