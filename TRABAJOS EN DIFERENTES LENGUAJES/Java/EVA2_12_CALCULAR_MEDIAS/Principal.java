//@author Roberto Valdez Vazquez-18550731

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int iSumar = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println("Edad " + i + ":");
            iSumar = iSumar + input.nextInt();
    }
    double dMedia = (double)iSumar / 5;
    System.out.println("La Media resultante es " + dMedia);
    }
}
