
import java.util.Scanner;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
            System.out.println("Ingresa un numero");
            System.out.println();
        
        int iNum;
        iNum = input.nextInt();
            System.out.println();
        
            System.out.println("Los numeros que NO pueden dividir al numero " + iNum + " son:");
            System.out.println();
        for (int i = 1; i <= 100; i++) {
            if(iNum % i != 0)
                System.out.println(i);
            
        }
    }
}
