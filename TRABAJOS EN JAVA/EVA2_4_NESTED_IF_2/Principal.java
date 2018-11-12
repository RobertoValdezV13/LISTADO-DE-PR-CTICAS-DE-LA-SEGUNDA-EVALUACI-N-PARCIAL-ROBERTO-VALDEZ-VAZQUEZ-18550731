//@author Roberto Valdez Vazquez-18550731

import java.util.Scanner;

public class Principal {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int iCalifa;
        
        iCalificacion = input.nextInt();
        if (iCalifa == 100) {
            System.out.println("A");
        } else {
            if (iCalifa == 90) {
                System.out.println("B");
            } else {
                if (iCalifa == 80) {
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